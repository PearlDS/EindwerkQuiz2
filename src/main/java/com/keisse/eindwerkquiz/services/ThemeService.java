package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.quizquestions.Theme;
import com.keisse.eindwerkquiz.user.User;

import java.util.List;

public interface ThemeService {

    List<Theme> findAll();

    void save(Theme theme);

    Theme findById(Long id);

    void deleteById(Long id);
}
