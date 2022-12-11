package com.spring.example.service;

import com.spring.example.model.Book;

public interface StudentService {

    String welcomeStudent();

    Book getBookDetails() throws StudentNotFound;
}
