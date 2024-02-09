package com.example.basicapi.dao;

import com.example.basicapi.dao.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    Long createUser(User user);

    Boolean doesExist(User user);

    User updateUser(User user);

    void deleteUser(Long userId);
}
