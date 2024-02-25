package com.example.basicapi.controllers;

import com.example.basicapi.config.AppProperties;
import com.example.basicapi.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private AppProperties appProperties;

    @GetMapping("/message")
    public Response getMessage() {
        return new Response("Welcome Back master!!!!");
    }

    @GetMapping("/config")
    public Response getConfig() {
        appProperties.displayConfig();
        return new Response("Success");
    }
}
