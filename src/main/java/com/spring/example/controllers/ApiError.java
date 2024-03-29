package com.spring.example.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ApiError {
    private String errorCode;
    private String message;
    private HttpStatus httpStatus;
}
