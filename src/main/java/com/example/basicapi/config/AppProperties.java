package com.example.basicapi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    @Getter
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Getter
    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Getter
    @Value("${spring.datasource.password}")
    private String dbPassword;

    public void displayConfig() {
        System.out.println("######DB URL: " + dbUrl);
        System.out.println("######DB Username: " + dbUsername);
        System.out.println("######DB Password: " + dbPassword);
    }
}
