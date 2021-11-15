package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.user.User;
import com.keisse.eindwerkquiz.user.UserScore;

import java.util.List;

public interface UserScoreService {

    List<UserScore> findAll();

    void save(UserScore userScore);

    UserScore findById(Long id);

    void deleteById(Long id);
}
