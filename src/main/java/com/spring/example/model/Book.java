package com.spring.example.model;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@ConfigurationProperties(prefix = "book")
@Component
public class Book {

    private String name;
    private String authorName;
    private Double price;
}
