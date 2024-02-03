package com.example.basicapi.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

public class UserResponse {

    @Getter
    @Setter
    private String message;

    @Setter
    @Getter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Object result;

    public UserResponse(String message, Object result) {
        this.message = message;
        this.result = result;
    }

    public UserResponse(String message) {
        this.message = message;
    }
}
