package com.example.basicapi.controllers;

import com.example.basicapi.models.UserRequest;
import com.example.basicapi.models.UserResponse;
import com.example.basicapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
