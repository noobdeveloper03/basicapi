package com.example.basicapi.service.impl;

import com.example.basicapi.dao.UserDao;
import com.example.basicapi.dao.entity.User;
import com.example.basicapi.models.UserRequest;
import com.example.basicapi.service.UserService;
import com.example.basicapi.util.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void createUser(UserRequest request) {
        //Todo: Add Error Handling for existing username or email validation
        userDao.createUser(UserConverter.convertUser(request));
    }
}
