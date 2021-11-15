package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.user.UserScore;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserScoreServiceImpl implements  UserScoreService{
    @Override
    public List<UserScore> findAll() {
        return null;
    }

    @Override
    public void save(UserScore userScore) {

    }

    @Override
    public UserScore findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
