package com.example.campusmarket.service;

import com.example.campusmarket.entity.User;

public interface UserService {

    boolean login(String username, String password);

    void register(User user);
}
