package com.example.basicapi.controllers;

import com.example.basicapi.models.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/message")
    public Response getMessage() {
        return new Response("Welcome Back master!!!!");
    }
}
