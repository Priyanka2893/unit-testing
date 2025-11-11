package com.example.unit_testing.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private String sendWelcomeEmail(String email){
        System.out.println("Welcome " + email);
    }
}
