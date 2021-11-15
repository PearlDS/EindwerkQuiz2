package com.keisse.eindwerkquiz.repository;

import com.keisse.eindwerkquiz.quizquestions.Theme;
import com.keisse.eindwerkquiz.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
