package com.spring.example.service;

import com.spring.example.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Primary
@PropertySource("classpath:Custom.properties")
public class StudentServiceImple implements StudentService {

    @Autowired
    Book book;

    @Value("${message}")
    String message;


    public StudentServiceImple() {
        log.info("creating object of StudentService ::: ");
    }

    @Override
    public String welcomeStudent() {

        return "Welcome Student in our college";
    }


    public Book getBookDetails() throws StudentNotFound {
        log.info("book loaded ::: " + book);
        log.info("message from book is ::: " + message);
        throw new StudentNotFound("Student not found ::: ");
    }
}
