package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.quizquestions.QuizQuestion;
import com.keisse.eindwerkquiz.user.User;

import java.util.List;

public interface QuizQuestionService {
    List<QuizQuestion> findAll();

    void save(QuizQuestion quizQuestion);

    QuizQuestion findById(Long id);

    void deleteById(Long id);
}
