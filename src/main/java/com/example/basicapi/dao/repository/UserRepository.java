package com.example.basicapi.dao.repository;

import com.example.basicapi.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
