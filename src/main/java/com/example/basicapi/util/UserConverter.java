package com.example.basicapi.util;

import com.example.basicapi.dao.entity.User;
import com.example.basicapi.exception.UserException;
import com.example.basicapi.models.UserRequest;
import com.example.basicapi.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;

public class UserConverter {

    private Logger logger = LoggerFactory.getLogger(UserConverter.class);

    public static User convertUser(UserRequest request) {
        try {
            User user = new User();
            user.setUserId((request.getUserId() != null)? Long.parseLong(request.getUserId()) : null);
            user.setUsername(request.getUsername());
            user.setPassword(request.getPassword());
            user.setEmail(request.getEmail());
            return user;
        } catch(NumberFormatException nfe) {
            throw new UserException("UserId is not a valid number. Error Message : " + nfe.getMessage());
        }
    }

    public static Long convertUserId(String userId) {
        try {
            return Long.parseLong(userId);
        } catch(NumberFormatException nfe) {
            throw new UserException("UserId is not a valid number. Error Message : " + nfe.getMessage());
        }
    }
}
