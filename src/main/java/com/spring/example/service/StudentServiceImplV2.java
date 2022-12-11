package com.spring.example.service;

import com.spring.example.model.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplV2 implements StudentService {

    @Override
    public String welcomeStudent() {
        return "Welcome student in our New College";
    }

    @Override
    public Book getBookDetails() {
        return null;
    }
}
