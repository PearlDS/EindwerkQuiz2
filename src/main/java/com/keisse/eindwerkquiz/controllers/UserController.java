package com.keisse.eindwerkquiz.controllers;

import com.keisse.eindwerkquiz.services.UserService;
import com.keisse.eindwerkquiz.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

//todo: controller mapping

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("login")
    public String goToLoginPage(Model model) {
    model.addAttribute("user",new User("",""));
        return "login";
    }

    @PostMapping("login2")
    public String redirectToLoginPage(@ModelAttribute( "user") User userReceived, HttpSession session){
        System.out.println(userReceived.getUserName());
        System.out.println(userReceived.getPassword());

        User user = userService.getUserByUserNameAndPassword(userReceived.getUserName(),userReceived.getPassword());

        if(user.getUserName()!=null && user.getPassword()!=null) {
            session.setAttribute("currentUser", user.getUserName());
            return "redirect:indexLoggedIn";                                                                        //todo maak een index aje ingelogd zijt waar ge u naam ziet
        }
        else return "redirect:login";
    }

//    @RequestMapping("tempPlayers")
//    public String tempUser(Model model){
//        User user = new User();
//
//        if (user.getPassword()==null){
//            model.addAttribute(user);
//        }
//        return "PlayerConnections";
//    }
//
//    @PostMapping
//    public String playerConnections("playerConnections")

    @RequestMapping("/new")
    public String newUser(Model model) {
        User user = new User();
        model.addAttribute(user);
        return "signUp";
    }

    @PostMapping("save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.createUser(user);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public String showEditUser(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "edit_user";
    }

    @RequestMapping("delete/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteById(id);
        return "redirect:/";
    }
}
