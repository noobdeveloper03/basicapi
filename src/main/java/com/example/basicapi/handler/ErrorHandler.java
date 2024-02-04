package com.example.basicapi.handler;

import com.example.basicapi.exception.UserException;
import com.example.basicapi.models.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This will handle all our Exceptions and return a JSON response as soon as we throw an exception
 *
 * e.g Throw new UserException("error message");
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(UserException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<UserResponse> handleUserException(UserException userException) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new UserResponse(userException.getMessage()));
    }
}