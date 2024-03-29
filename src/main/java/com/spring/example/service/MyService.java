package com.spring.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MyService {

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<Object> getStudents() {

        Object response = restTemplate.getForEntity("http://localhost:8080/students", Object.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
