package com.example.basicapi.models;

import com.example.basicapi.dao.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserResponse {

    @Getter
    @Setter
    private String message;

    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<User> users;

    public UserResponse(String message, List<User> users) {
        this.message = message;
        this.users = users;
    }

    public UserResponse(String message) {
        this.message = message;
    }
}
