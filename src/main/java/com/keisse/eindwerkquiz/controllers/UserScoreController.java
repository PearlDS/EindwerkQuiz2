package com.keisse.eindwerkquiz.controllers;

import com.keisse.eindwerkquiz.services.UserScoreService;
import com.keisse.eindwerkquiz.services.UserService;
import com.keisse.eindwerkquiz.user.UserScore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserScoreController {

    private final UserScoreService userScoreService;

    public UserScoreController(UserScoreService userScoreService){
        this.userScoreService = userScoreService;
    }

    @RequestMapping("/")
    public String viewUserScores(Model model) {
        List<UserScore> userScores = userScoreService.findAll();
        model.addAttribute("userscores", userScores);
        return "index";
    }

    @RequestMapping("/new")
    public String newUserScore(Model model) {
        UserScore userScore = new UserScore();
        model.addAttribute(userScore);
        return "new_userscore";
    }

    @PostMapping("save")
    public String saveUserScore(@ModelAttribute("userscore") UserScore userScore) {
        userScoreService.save(userScore);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public String showEditUserScore(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("userscore", userScoreService.findById(id));
        return "edit_userscore";
    }

    @RequestMapping("delete/{id}")
    public String deleteUserScore(@PathVariable(name = "id") Long id) {
        userScoreService.deleteById(id);
        return "redirect:/";
    }



}
