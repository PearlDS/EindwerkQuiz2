package com.keisse.eindwerkquiz.controllers;

import com.keisse.eindwerkquiz.services.UserService;
import com.keisse.eindwerkquiz.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//todo: controller mapping

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    @RequestMapping("/new")
    public String newUser(Model model) {
        User user = new User();
        model.addAttribute(user);
        return "new_user";
    }

    @PostMapping("save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
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
