package com.spring.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EagerLoadingService {

    EagerLoadingService(){
        log.info("EagerLoadingService ::::::    ");
    }
}
