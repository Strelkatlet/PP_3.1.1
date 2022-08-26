package com.example.PP_311.service;

import com.example.PP_311.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(long id);

    void saveUser(User user);

    void updateUser(long id, User user);

    void deleteUser(long id);
}