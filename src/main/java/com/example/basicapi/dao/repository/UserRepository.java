package com.example.basicapi.dao.repository;

import com.example.basicapi.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * Reminder: Spring JPA uses entity variable names instead of column names. In this case, user_id was the name of
     * the column while userId is the variable name we declared in the entity. JPA uses the one we declared in the entity.
     *
     * If you want to use @Query for Modifying database, you should put @Modifying on top of @Query Annotation.
     *
     * We can also use Spring JPA findOne method but for the sake of example of custom query, I did this.
     */
    @Query("SELECT u FROM User u WHERE u.username = :username OR u.email = :email ")
    List<User> findByUserNameEmail(@Param("username") String username,@Param("email") String email);
}
