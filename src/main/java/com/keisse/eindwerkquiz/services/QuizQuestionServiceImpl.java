package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.models.QuizQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizQuestionServiceImpl implements QuizQuestionService{
    @Override
    public List<QuizQuestion> findAll() {
        return null;
    }

    @Override
    public void save(QuizQuestion quizQuestion) {

    }

    @Override
    public QuizQuestion findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
