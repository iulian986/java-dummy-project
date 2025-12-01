package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

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
    void givenPositiveValues_whenHighComplexityMethodCalled_thenExecutesWithoutExceptions() {
        // GIVEN
        int a = 0;
        int b = 1;
        int c = 1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
        // No exceptions expected
    }

    @Test
    void givenNegativeValues_whenHighComplexityMethodCalled_thenExecutesWithoutExceptions() {
        // GIVEN
        int a = -1;
        int b = -1;
        int c = -1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
        // No exceptions expected
    }

    @Test
    void givenMixedValues_whenHighComplexityMethodCalled_thenExecutesWithoutExceptions() {
        // GIVEN
        int a = 0;
        int b = -1;
        int c = 1;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
        // No exceptions expected
    }

    @Test
    void givenZeroValues_whenHighComplexityMethodCalled_thenExecutesWithoutExceptions() {
        // GIVEN
        int a = 0;
        int b = 0;
        int c = 0;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
        // No exceptions expected
    }

    @Test
    void givenLargeValues_whenHighComplexityMethodCalled_thenExecutesWithoutExceptions() {
        // GIVEN
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
        // No exceptions expected
    }

    @Test
    void givenSmallValues_whenHighComplexityMethodCalled_thenExecutesWithoutExceptions() {
        // GIVEN
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        // WHEN & THEN
        service.highComplexityMethod(a, b, c);
        // No exceptions expected
    }
}
