package com.spring.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Lazy
public class LazyLoadingService {

    LazyLoadingService(){
        log.info("LazyLoading ....... ");
    }
}
