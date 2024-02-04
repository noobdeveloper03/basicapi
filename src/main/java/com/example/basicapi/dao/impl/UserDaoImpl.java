package com.example.basicapi.dao.impl;

import com.example.basicapi.dao.UserDao;
import com.example.basicapi.dao.entity.User;
import com.example.basicapi.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Long createUser(User user) {
        user = userRepository.save(user);
        return user.getUserId();
    }

    @Override
    public Boolean doesExist(User user) {
        List<User> userList = userRepository.findByUserNameEmail(user.getUsername(),user.getEmail());

        if(!userList.isEmpty()) {
            return true;
        }
        return false;
    }


}
