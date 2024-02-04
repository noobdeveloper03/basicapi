package com.example.basicapi.service.impl;

import com.example.basicapi.dao.UserDao;
import com.example.basicapi.dao.entity.User;
import com.example.basicapi.exception.UserException;
import com.example.basicapi.models.UserRequest;
import com.example.basicapi.service.UserService;
import com.example.basicapi.util.UserConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void createUser(UserRequest request) {
        //Todo: Add Error Handling for existing username or email validation
        User user = UserConverter.convertUser(request);
        logger.info("Validating User {}",user);
        if(userDao.doesExist(user)) {
            logger.error("Username: {} or email: {} already exist",user.getUsername(),user.getEmail());
            throw new UserException("Username or email Already Exist");
        }
        userDao.createUser(UserConverter.convertUser(request));
    }
}
