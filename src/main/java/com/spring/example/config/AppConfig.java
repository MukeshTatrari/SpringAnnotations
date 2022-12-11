package com.spring.example.config;

import com.spring.example.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {


    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
