package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTests {

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
        // THEN the expected output is printed
    }

    @Test
    void testHighComplexityMethod_APositiveBAndCNonPositive() {
        // GIVEN a is positive, b and c are non-positive
        int a = 1;
        int b = -2;
        int c = -3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the expected output is printed
    }

    @Test
    void testHighComplexityMethod_ANonPositiveBAndCPositive() {
        // GIVEN a is non-positive, b and c are positive
        int a = -1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the expected output is printed
    }

    @Test
    void testHighComplexityMethod_AllNonPositive() {
        // GIVEN a, b, and c are non-positive
        int a = -1;
        int b = -2;
        int c = -3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the expected output is printed
    }

}
