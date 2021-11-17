package com.keisse.eindwerkquiz.services;

import com.keisse.eindwerkquiz.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    void createUser(User user);

    Optional<User> findById(Long id);

    void deleteById(Long id);

    User getUserByUserNameAndPassword(String userName, String passWord);

}
