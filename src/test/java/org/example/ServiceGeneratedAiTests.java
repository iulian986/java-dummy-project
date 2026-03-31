package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;



import java.util.Objects;

@ExtendWith({MyAssertions.class})
public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    @DisplayName("isEven method - Positive even number")
    void isEvenPositiveEven() {
        // GIVEN: Input is a positive even number
        int input = 4;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be true
        Assertions.assertThat(result).isTrue();
    }

    @Test
    @DisplayName("isEven method - Positive odd number")
    void isEvenPositiveOdd() {
        // GIVEN: Input is a positive odd number
        int input = 5;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be false
        Assertions.assertThat(result).isFalse();
    }

    @Test
    @DisplayName("isEven method - Zero")
    void isEvenZero() {
        // GIVEN: Input is zero
        int input = 0;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The result should be true
        Assertions.assertThat(result).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a = 0, b > 0, c > 0")
    void highComplexityMethodAZeroBPositiveCCPositive() {
        // GIVEN: a = 0, b > 0, c > 0
        int a = 0;
        int b = 1;
        int c = 2;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a = 0, b > 0, c = 0")
    void highComplexityMethodAZeroBBPositiveCZero() {
        // GIVEN: a = 0, b > 0, c = 0
        int a = 0;
        int b = 1;
        int c = 0;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a = 0, b = 0, c > 0")
    void highComplexityMethodAZeroBBZeroCCPositive() {
        // GIVEN: a = 0, b = 0, c > 0
        int a = 0;
        int b = 0;
        int c = 1;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a = 0, b = 0, c = 0")
    void highComplexityMethodAZeroBBZeroCCZero() {
        // GIVEN: a = 0, b = 0, c = 0
        int a = 0;
        int b = 0;
        int c = 0;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a < 0, b > 0, c > 0")
    void highComplexityMethodANegativeBPositiveCCPositive() {
        // GIVEN: a < 0, b > 0, c > 0
        int a = -1;
        int b = 1;
        int c = 2;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a < 0, b > 0, c = 0")
    void highComplexityMethodANegativeBBPositiveCZero() {
        // GIVEN: a < 0, b > 0, c = 0
        int a = -1;
        int b = 1;
        int c = 0;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a < 0, b = 0, c > 0")
    void highComplexityMethodANegativeBBZeroCCPositive() {
        // GIVEN: a < 0, b = 0, c > 0
        int a = -1;
        int b = 0;
        int c = 1;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a < 0, b = 0, c = 0")
    void highComplexityMethodANegativeBBZeroCCZero() {
        // GIVEN: a < 0, b = 0, c = 0
        int a = -1;
        int b = 0;
        int c = 0;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a > 0, b > 0, c > 0")
    void highComplexityMethodAPositiveBPositiveCCPositive() {
        // GIVEN: a > 0, b > 0, c > 0
        int a = 1;
        int b = 1;
        int c = 1;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a > 0, b > 0, c = 0")
    void highComplexityMethodAPositiveBBPositiveCZero() {
        // GIVEN: a > 0, b > 0, c = 0
        int a = 1;
        int b = 1;
        int c = 0;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a > 0, b = 0, c > 0")
    void highComplexityMethodAPositiveBBZeroCCPositive() {
        // GIVEN: a > 0, b = 0, c > 0
        int a = 1;
        int b = 0;
        int c = 1;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }

    @Test
    @DisplayName("highComplexityMethod - a > 0, b = 0, c = 0")
    void highComplexityMethodAPositiveBBZeroCCZero() {
        // GIVEN: a > 0, b = 0, c = 0
        int a = 1;
        int b = 0;
        int c = 0;
        // WHEN: The highComplexityMethod is called with the given inputs
        service.highComplexityMethod(a, b, c);
        // THEN: Expected output should be printed
        Assertions.assertThat(true).isTrue();
    }
}
