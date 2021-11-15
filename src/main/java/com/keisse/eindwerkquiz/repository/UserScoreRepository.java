package com.keisse.eindwerkquiz.repository;

import com.keisse.eindwerkquiz.quizquestions.Theme;
import com.keisse.eindwerkquiz.user.UserScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserScoreRepository extends JpaRepository<UserScore,Long> {
}
