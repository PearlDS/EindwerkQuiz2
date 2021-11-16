package com.keisse.eindwerkquiz.controllers;


import com.keisse.eindwerkquiz.models.Theme;
import com.keisse.eindwerkquiz.services.ThemeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//todo: controller mapping

@Controller
public class ThemeController {

    private final ThemeService themeService;

    public ThemeController(ThemeService themeService){
        this.themeService = themeService;
    }

    @RequestMapping("/")
    public String viewTheme(Model model) {
        List<Theme> theme = themeService.findAll();
        model.addAttribute("theme", theme);
        return "index";
    }

    @RequestMapping("/new")
    public String newTheme(Model model) {
        Theme theme = new Theme();
        model.addAttribute(theme);
        return "new_theme";
    }

    @PostMapping("save")
    public String saveTheme(@ModelAttribute("theme") Theme theme) {
        themeService.save(theme);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public String showEditTheme(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("theme", themeService.findById(id));
        return "edit_theme";
    }

    @RequestMapping("delete/{id}")
    public String deleteTheme(@PathVariable(name = "id") Long id) {
        themeService.deleteById(id);
        return "redirect:/";
    }
}
