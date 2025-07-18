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
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        // GIVEN
        service = new Service();
    }

    @Test
    void isEven_givenEvenNumber_returnsTrue() {
        // GIVEN
        int input = 4;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void isEven_givenOddNumber_returnsFalse() {
        // GIVEN
        int input = 3;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void isEven_givenZero_returnsTrue() {
        // GIVEN
        int input = 0;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void highComplexityMethod_givenAIsZero_BPositive_CPositive_executesWithoutException() {
        // GIVEN
        int a = 0;
        int b = 1;
        int c = 1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void highComplexityMethod_givenAIsZero_BNonPositive_CNonPositive_executesWithoutException() {
        // GIVEN
        int a = 0;
        int b = 0;
        int c = 0;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void highComplexityMethod_givenANegative_BPositive_CNonPositive_executesWithoutException() {
        // GIVEN
        int a = -1;
        int b = 1;
        int c = 0;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void highComplexityMethod_givenANegative_BNonPositive_CPositive_executesWithoutException() {
        // GIVEN
        int a = -5;
        int b = -1;
        int c = 2;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void highComplexityMethod_givenAPositive_BPositive_CPositive_executesWithoutException() {
        // GIVEN
        int a = 5;
        int b = 3;
        int c = 4;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void highComplexityMethod_givenAPositive_BNonPositive_CNonPositive_executesWithoutException() {
        // GIVEN
        int a = 10;
        int b = 0;
        int c = -1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }
}
