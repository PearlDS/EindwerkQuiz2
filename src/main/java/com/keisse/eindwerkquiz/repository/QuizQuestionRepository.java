package com.keisse.eindwerkquiz.repository;


import com.keisse.eindwerkquiz.quizquestions.QuizQuestion;
import com.keisse.eindwerkquiz.quizquestions.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion,Long> {
}
