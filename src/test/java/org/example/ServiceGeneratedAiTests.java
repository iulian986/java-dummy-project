package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
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
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1;
        int b = 2;
        int c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals(System.out.println("a is positive"), "a is positive");
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = -1;
        int b = 2;
        int c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals(System.out.println("a is non-positive"), "a is non-positive");
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1;
        int b = -2;
        int c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals(System.out.println("b is non-positive"), "b is non-positive");
    }

}
