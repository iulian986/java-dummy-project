package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void givenEvenNumber_whenIsEvenCalled_thenReturnsTrue() {
        // GIVEN
        int input = 4;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenOddNumber_whenIsEvenCalled_thenReturnsFalse() {
        // GIVEN
        int input = 5;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenZeroInput_whenIsEvenCalled_thenReturnsTrue() {
        // GIVEN
        int input = 0;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenNegativeEvenNumber_whenIsEvenCalled_thenReturnsTrue() {
        // GIVEN
        int input = -4;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenNegativeOddNumber_whenIsEvenCalled_thenReturnsFalse() {
        // GIVEN
        int input = -5;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenPositiveValues_whenHighComplexityMethodCalled_thenNoExceptionThrown() {
        // GIVEN
        int a = 0;
        int b = 1;
        int c = 1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void givenNegativeValues_whenHighComplexityMethodCalled_thenNoExceptionThrown() {
        // GIVEN
        int a = -1;
        int b = -1;
        int c = -1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void givenMixedValues_whenHighComplexityMethodCalled_thenNoExceptionThrown() {
        // GIVEN
        int a = 0;
        int b = -1;
        int c = 1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void givenBoundaryValues_whenHighComplexityMethodCalled_thenNoExceptionThrown() {
        // GIVEN
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int c = 0;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void givenInvalidInput_whenIsEvenCalled_thenReturnsFalse() {
        // GIVEN
        int input = Integer.MAX_VALUE;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenNegativeBoundaryValues_whenHighComplexityMethodCalled_thenNoExceptionThrown() {
        // GIVEN
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }

    @Test
    void givenPositiveBoundaryValues_whenHighComplexityMethodCalled_thenNoExceptionThrown() {
        // GIVEN
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
    }
}
