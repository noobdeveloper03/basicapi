package com.example.basicapi.dao.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "user_id")
    private Long userId;

    @Getter
    @Setter
    @Column(name = "username")
    private String username;

//    @JsonIgnore
    @Getter
    @Setter
    @Column(name = "password")
    private String password;

    @Getter
    @Setter
    @Column(name = "email")
    private String email;

    @Getter
    @Setter
    @CreationTimestamp
    @Column(name = "createdAt")
    private Timestamp createdAt;

    @JsonIgnore
    @Getter
    @Setter
    @UpdateTimestamp
    @Column(name = "modifiedAt")
    private Timestamp modifiedAt;
}
