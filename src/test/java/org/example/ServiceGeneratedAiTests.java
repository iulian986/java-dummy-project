package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ServiceGeneratedAiTests {

    private Service service;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        service = new Service();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testIsEven_GivenEvenNumber_WhenChecked_ShouldReturnTrue() {
        // GIVEN an even number
        int evenNumber = 4;
        
        // WHEN checking if the number is even
        boolean result = service.isEven(evenNumber);
        
        // THEN it should return true
        assertThat(result).isTrue();
    }

    @Test
    void testIsEven_GivenOddNumber_WhenChecked_ShouldReturnFalse() {
        // GIVEN an odd number
        int oddNumber = 5;
        
        // WHEN checking if the number is even
        boolean result = service.isEven(oddNumber);
        
        // THEN it should return false
        assertThat(result).isFalse();
    }

    @Test
    void testHighComplexityMethod_GivenZeroA_PositiveBAndC_WhenCalled_ShouldPrintCorrectMessages() {
        // GIVEN a = 0, b > 0, c > 0
        int a = 0;
        int b = 1;
        int c = 2;

        // WHEN calling highComplexityMethod
        service.highComplexityMethod(a, b, c);
        
        // THEN it should print the correct messages
        assertThat(outContent.toString()).contains("a is positive", "b is positive", "c is positive");
    }

    @Test
    void testHighComplexityMethod_GivenZeroA_NonPositiveBAndC_WhenCalled_ShouldPrintCorrectMessages() {
        // GIVEN a = 0, b <= 0, c <= 0
        int a = 0;
        int b = -1;
        int c = -2;

        // WHEN calling highComplexityMethod
        service.highComplexityMethod(a, b, c);
        
        // THEN it should print the correct messages
        assertThat(outContent.toString()).contains("a is positive", "b is non-positive", "c is non-positive");
    }

    @Test
    void testHighComplexityMethod_GivenNegativeA_PositiveBAndC_WhenCalled_ShouldPrintCorrectMessages() {
        // GIVEN a < 0, b > 0, c > 0
        int a = -1;
        int b = 1;
        int c = 2;

        // WHEN calling highComplexityMethod
        service.highComplexityMethod(a, b, c);
        
        // THEN it should print the correct messages
        assertThat(outContent.toString()).contains("a is non-positive", "b is positive", "c is positive");
    }

    @Test
    void testHighComplexityMethod_GivenPositiveA_PositiveBAndC_WhenCalled_ShouldPrintCorrectMessages() {
        // GIVEN a > 0, b > 0, c > 0
        int a = 1;
        int b = 2;
        int c = 3;

        // WHEN calling highComplexityMethod
        service.highComplexityMethod(a, b, c);
        
        // THEN it should print the correct messages
        assertThat(outContent.toString()).contains("a is positive", "b is positive", "c is positive");
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }
}
