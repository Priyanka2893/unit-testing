package com.example.unit_testing.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b){
        return a + b;
    }

    public int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return a / b;
    }
}
