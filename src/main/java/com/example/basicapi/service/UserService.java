package com.example.basicapi.service;

import com.example.basicapi.dao.entity.User;
import com.example.basicapi.models.UserRequest;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void createUser(UserRequest userRequest);

    void updateUser(UserRequest userRequest);

    void deleteUser(String userId);
}
