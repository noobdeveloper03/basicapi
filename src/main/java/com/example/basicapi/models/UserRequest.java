package com.example.basicapi.models;

import lombok.Getter;
import lombok.Setter;

public class UserRequest {

    @Getter
    @Setter
    private String userId;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String email;
}
