package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.user.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    User findById(Long id);

    void deleteById(Long id);
}
