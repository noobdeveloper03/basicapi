package com.example.basicapi.util;

import com.example.basicapi.dao.entity.User;
import com.example.basicapi.models.UserRequest;

public class UserConverter {

    public static User convertUser(UserRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        return user;
    }
}
