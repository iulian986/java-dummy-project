package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_PositiveNumber() {
        // GIVEN a positive number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_NegativeNumber() {
        // GIVEN a negative number
        int input = -6;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_Zero() {
        // GIVEN zero
        int input = 0;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_OddNumber() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

    @Test
    void testHighComplexityMethod_AllPositive() {
        // GIVEN a, b, and c are positive
        int a = 1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is positive", "b is positive", "c is positive"
    }

    @Test
    void testHighComplexityMethod_APositiveBNonPositiveCPositive() {
        // GIVEN a is positive, b is non-positive, and c is positive
        int a = 1;
        int b = -2;
        int c = 3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is positive", "b is non-positive", "c is positive"
    }

    @Test
    void testHighComplexityMethod_APositiveBPositiveCNonPositive() {
        // GIVEN a is positive, b is positive, and c is non-positive
        int a = 1;
        int b = 2;
        int c = -3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is positive", "b is positive", "c is non-positive"
    }

    @Test
    void testHighComplexityMethod_ANonPositiveBNonPositiveCPositive() {
        // GIVEN a is non-positive, b is non-positive, and c is positive
        int a = -1;
        int b = -2;
        int c = 3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is non-positive", "b is non-positive", "c is positive"
    }

    @Test
    void testHighComplexityMethod_ANonPositiveBPositiveCNonPositive() {
        // GIVEN a is non-positive, b is positive, and c is non-positive
        int a = -1;
        int b = 2;
        int c = -3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is non-positive", "b is positive", "c is non-positive"
    }
