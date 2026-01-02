package org.example;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServiceGeneratedAiTests {

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
        assertThat(result).isTrue();
    }

    @Test
    void givenOddNumber_whenIsEvenCalled_thenReturnsFalse() {
        // GIVEN
        int input = 7;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertThat(result).isFalse();
    }

    @Test
    void givenZero_whenIsEvenCalled_thenReturnsTrue() {
        // GIVEN
        int input = 0;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertThat(result).isTrue();
    }

    @Test
    void givenPositiveA_whenHighComplexityMethodCalled_thenPrintsAIsPositive() {
        // GIVEN
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));

        // WHEN
        service.highComplexityMethod(1, 2, 3);

        // THEN
        String output = baos.toString();
        assertThat(output).contains("a is positive");
        assertThat(output).contains("b is positive");
        assertThat(output).contains("c is positive");
    }

    @Test
    void givenNegativeA_whenHighComplexityMethodCalled_thenPrintsAIsNonPositive() {
        // GIVEN
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));

        // WHEN
        service.highComplexityMethod(-1, 2, 3);

        // THEN
        String output = baos.toString();
        assertThat(output).contains("a is non-positive");
        assertThat(output).contains("b is positive");
        assertThat(output).contains("c is positive");
    }

    @Test
    void givenZeroA_whenHighComplexityMethodCalled_thenPrintsAIsPositive() {
        // GIVEN
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));

        // WHEN
        service.highComplexityMethod(0, 2, 3);

        // THEN
        String output = baos.toString();
        assertThat(output).contains("a is positive");
        assertThat(output).contains("b is positive");
        assertThat(output).contains("c is positive");
    }

    @Test
    void givenNegativeAAndNegativeB_whenHighComplexityMethodCalled_thenPrintsAllNonPositive() {
        // GIVEN
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));

        // WHEN
        service.highComplexityMethod(-1, -2, -3);

        // THEN
        String output = baos.toString();
        assertThat(output).contains("a is non-positive");
        assertThat(output).contains("b is non-positive");
        assertThat(output).contains("c is non-positive");
    }

    @Test
    void givenZeroAAndZeroB_whenHighComplexityMethodCalled_thenPrintsBIsNonPositive() {
        // GIVEN
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));

        // WHEN
        service.highComplexityMethod(0, 0, 1);

        // THEN
        String output = baos.toString();
        assertThat(output).contains("a is positive");
        assertThat(output).contains("b is non-positive");
        assertThat(output).contains("c is positive");
    }

}