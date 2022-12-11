package com.spring.example.controllers;

import com.spring.example.service.StudentNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice

public class StudentControllerAdvice {

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<ApiError> handleNotFoundException(StudentNotFound exception) {

        ApiError error = new ApiError("500",
                exception.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
