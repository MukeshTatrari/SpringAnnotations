package com.spring.example.controllers;

import com.spring.example.model.Book;
import com.spring.example.service.MyService;
import com.spring.example.service.StudentNotFound;
import com.spring.example.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Scope("singleton")
@Slf4j
public class MyController {

    public MyController() {
        log.info("Hello welcome to MyController ");
    }

    @Autowired
    private StudentService studentService;

    @Autowired
    private MyService service;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/welcome")
    public String test() {
        return studentService.welcomeStudent();
    }

    @GetMapping("/welcome/all")
    public ResponseEntity<Object> getAllStudents(){
        return service.getStudents();
    }

    @GetMapping("/book")
    public Book getBookDetails() throws StudentNotFound {
        return studentService.getBookDetails();
    }

    @GetMapping("/users")
    public ResponseEntity getUsers() {
        Object response = restTemplate.getForEntity("http://jsonplaceholder.typicode.com/users", Object.class);
        log.info("response ::::::: " + response);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
