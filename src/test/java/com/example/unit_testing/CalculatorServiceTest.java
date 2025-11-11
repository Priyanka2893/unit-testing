package com.example.unit_testing;

import com.example.unit_testing.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * JUnit (the testing framework) finds all methods with @Test annotation
 * It creates a new instance of the test class for each test
 * It runs each test method independently
 * It shows you which tests passed (green) and which failed (red)
 */
public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();
    @Test
    void shouldAddTwoIntegers(){
        // Will follow Arrange-Call-Assert
        // 1. Arrange
        int num1 = 10;
        int num2 = 20;

        // 2. Call the method
        int result = calculatorService.add(num1,num2);

        // 3. Assert
        assertEquals(30,result);
    }

    @Test
    void shouldAddPositiveAndNegativeNumbers(){
        int num1 = 10;
        int num2 = -3;
        int result = calculatorService.add(num1,num2);
        assertEquals(7,result);
    }

    @Test
    void shouldAddZeroToNumber(){
        int num1 = 0;
        int num2 = 30;
        int result = calculatorService.add(num1,num2);
        assertEquals(30,result);
    }

    @Test
    void shouldDivideNumbers(){
        int num1 = 10;
        int num2 = 5;
        int result = calculatorService.divide(num1,num2);
        assertEquals(2,result);
    }
    @Test
    void shouldThrowExceptionWhenDivideByZero(){
        int num1 = 10;
        int num2 = 0;
        Exception exception = assertThrows(IllegalArgumentException.class,
            ()-> calculatorService.divide(num1,num2)
        );
        // Verify exception message
        assertEquals("Cannot divide by 0",exception.getMessage());
    }
}
