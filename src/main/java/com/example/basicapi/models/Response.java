package com.example.basicapi.models;

import lombok.Getter;
import lombok.Setter;

public class Response {

    @Getter
    @Setter
    private String message;

    public Response(String message) {
        this.message = message;
    }
}
