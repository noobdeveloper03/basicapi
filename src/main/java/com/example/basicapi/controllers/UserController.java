package com.example.basicapi.controllers;

import com.example.basicapi.dao.entity.User;
import com.example.basicapi.models.UserRequest;
import com.example.basicapi.models.UserResponse;
import com.example.basicapi.service.UserService;
import com.example.basicapi.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<UserResponse> getUsers() {
        return new ResponseEntity<>(new UserResponse("Success",userService.getUsers()), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
        userService.createUser(request);
        return new ResponseEntity<>(new UserResponse("Success"), HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable("id") String id, @RequestBody UserRequest request) {
        request.setUserId(id);
        userService.updateUser(request);
        return new ResponseEntity<>(new UserResponse("Success"),HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<UserResponse> deleteUser(@PathVariable("id") String userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>(new UserResponse("User Removed"),HttpStatus.OK);
    }
}
