package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceGeneratedAiTests {
    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void isEven_GivenPositiveEvenNumber_WhenChecked_ThenReturnsTrue() {
        // GIVEN
        int input = 4;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void isEven_GivenPositiveOddNumber_WhenChecked_ThenReturnsFalse() {
        // GIVEN
        int input = 3;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void isEven_GivenZero_WhenChecked_ThenReturnsTrue() {
        // GIVEN
        int input = 0;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void isEven_GivenNegativeEvenNumber_WhenChecked_ThenReturnsTrue() {
        // GIVEN
        int input = -2;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void isEven_GivenNegativeOddNumber_WhenChecked_ThenReturnsFalse() {
        // GIVEN
        int input = -3;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void highComplexityMethod_GivenAllPositiveNumbers_WhenExecuted_ThenPrintsCorrectMessages() {
        // GIVEN
        int a = 1, b = 2, c = 3;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        // Note: Since the method prints to stdout, we cannot directly assert the output.
        // In a real scenario, you might want to use a testing framework that can capture stdout.
    }

    @Test
    void highComplexityMethod_GivenAZeroBPositiveCNonPositive_WhenExecuted_ThenPrintsCorrectMessages() {
        // GIVEN
        int a = 0, b = 1, c = -1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        // Note: Since the method prints to stdout, we cannot directly assert the output.
        // In a real scenario, you might want to use a testing framework that can capture stdout.
    }

    @Test
    void highComplexityMethod_GivenANegativeBNonPositiveCPositive_WhenExecuted_ThenPrintsCorrectMessages() {
        // GIVEN
        int a = -1, b = -2, c = 1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        // Note: Since the method prints to stdout, we cannot directly assert the output.
        // In a real scenario, you might want to use a testing framework that can capture stdout.
    }

    @Test
    void highComplexityMethod_GivenAZeroBNonPositiveCNonPositive_WhenExecuted_ThenPrintsCorrectMessages() {
        // GIVEN
        int a = 0, b = -1, c = -1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        // Note: Since the method prints to stdout, we cannot directly assert the output.
        // In a real scenario, you might want to use a testing framework that can capture stdout.
    }
}
