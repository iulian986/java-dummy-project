package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void givenEvenNumber_whenIsEven_thenReturnsTrue() {
        // GIVEN
        int input = 4;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenOddNumber_whenIsEven_thenReturnsFalse() {
        // GIVEN
        int input = 5;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenZero_whenIsEven_thenReturnsTrue() {
        // GIVEN
        int input = 0;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenPositiveAZeroBPositiveCPositive_whenHighComplexityMethod_thenOutputsExpected() {
        // GIVEN
        int a = 0;
        int b = 1;
        int c = 1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(0, a);
        assertEquals(1, b);
        assertEquals(1, c);
    }

    @Test
    void givenNegativeAZeroBPositiveCNonPositive_whenHighComplexityMethod_thenOutputsExpected() {
        // GIVEN
        int a = -1;
        int b = 1;
        int c = 0;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(-1, a);
        assertEquals(1, b);
        assertEquals(0, c);
    }

    @Test
    void givenPositiveANonPositiveBPositiveCPositive_whenHighComplexityMethod_thenOutputsExpected() {
        // GIVEN
        int a = 2;
        int b = -3;
        int c = 5;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(2, a);
        assertEquals(-3, b);
        assertEquals(5, c);
    }

    @Test
    void givenValidInputs_whenHighComplexityMethod_thenNoExceptionThrown() {
        // GIVEN
        int a = 1;
        int b = 1;
        int c = 1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(1, a);
        assertEquals(1, b);
        assertEquals(1, c);
    }

    @Test
    void givenNullService_whenCallingIsEven_thenThrowsNullPointerException() {
        // GIVEN
        Service nullService = null;

        // WHEN & THEN
        assertThrows(NullPointerException.class, () -> nullService.isEven(2));
    }

    @Test
    void givenNullService_whenCallingHighComplexityMethod_thenThrowsNullPointerException() {
        // GIVEN
        Service nullService = null;

        // WHEN & THEN
        assertThrows(NullPointerException.class, () -> nullService.highComplexityMethod(1, 2, 3));
    }

    @Test
    void givenLargeInteger_whenIsEven_thenHandlesWithoutException() {
        // GIVEN
        int input = Integer.MAX_VALUE;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenNegativeLargeInteger_whenIsEven_thenHandlesWithoutException() {
        // GIVEN
        int input = Integer.MIN_VALUE;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }
}
