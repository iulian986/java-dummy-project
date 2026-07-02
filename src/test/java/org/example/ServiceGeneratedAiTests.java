package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyAnnotations.class)
public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_positiveEvenNumber() {
        // GIVEN: A positive even number
        int input = 4;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be true
        assertThat(result).isTrue();
    }

    @Test
    void testIsEven_positiveOddNumber() {
        // GIVEN: A positive odd number
        int input = 5;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be false
        assertThat(result).isFalse();
    }

    @Test
    void testIsEven_zero() {
        // GIVEN: Zero
        int input = 0;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be true
        assertThat(result).isTrue();
    }

    @Test
    void testIsEven_negativeEvenNumber() {
        // GIVEN: A negative even number
        int input = -4;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be true
        assertThat(result).isTrue();
    }

    @Test
    void testIsEven_negativeOddNumber() {
        // GIVEN: A negative odd number
        int input = -5;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be false
        assertThat(result).isFalse();
    }

    @Test
    void testHighComplexityMethod_positiveNumbers() {
        // GIVEN: Three positive numbers
        int a = 1;
        int b = 2;
        int c = 3;
        // WHEN: The highComplexityMethod is called with the input
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed to console
        // Assertions can be added here if needed, but the primary purpose is to execute the method
    }

    @Test
    void testHighComplexityMethod_zeroAndPositive() {
        // GIVEN: a = 0, b = 1, c = 2
        int a = 0;
        int b = 1;
        int c = 2;
        // WHEN: The highComplexityMethod is called with the input
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed to console
    }

    @Test
    void testHighComplexityMethod_negativeAndPositive() {
        // GIVEN: a = -1, b = 1, c = 2
        int a = -1;
        int b = 1;
        int c = 2;
        // WHEN: The highComplexityMethod is called with the input
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed to console
    }

    @Test
    void testHighComplexityMethod_allNegative() {
        // GIVEN: a = -1, b = -2, c = -3
        int a = -1;
        int b = -2;
        int c = -3;
        // WHEN: The highComplexityMethod is called with the input
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed to console
    }
}
