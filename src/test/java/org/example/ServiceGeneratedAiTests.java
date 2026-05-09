package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

@ExtendWith(MyExtension.class)
public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = Mockito.mock(Service.class);
    }

    @Test
    void isEven_positiveNumber_returnsTrue() {
        // GIVEN: A positive integer
        int input = 4;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The method should return true
        assertTrue(result);
    }

    @Test
    void isEven_negativeNumber_returnsFalse() {
        // GIVEN: A negative integer
        int input = -4;
        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN: The method should return false
        assertFalse(result);
    }

    @Test
    void highComplexityMethod_aIsZero_bIsPositive_cIsPositive() {
        // GIVEN: a = 0, b = 5, c = 10
        Mockito.doNothing().when(service.isEven(0));
        Mockito.doNothing().when(service.isEven(5));
        Mockito.doNothing().when(service.isEven(10));
        // WHEN: The highComplexityMethod is called with a = 0, b = 5, c = 10
        service.highComplexityMethod(0, 5, 10);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(0);
        Mockito.verify(service, Mockito.times(3)).isEven(5);
        Mockito.verify(service, Mockito.times(3)).isEven(10);
    }

    @Test
    void highComplexityMethod_aIsZero_bIsNegative_cIsPositive() {
        // GIVEN: a = 0, b = -5, c = 10
        Mockito.doNothing().when(service.isEven(0));
        Mockito.doNothing().when(service.isEven(-5));
        Mockito.doNothing().when(service.isEven(10));
        // WHEN: The highComplexityMethod is called with a = 0, b = -5, c = 10
        service.highComplexityMethod(0, -5, 10);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(0);
        Mockito.verify(service, Mockito.times(3)).isEven(-5);
        Mockito.verify(service, Mockito.times(3)).isEven(10);
    }

    @Test
    void highComplexityMethod_aIsZero_bIsPositive_cIsNegative() {
        // GIVEN: a = 0, b = 5, c = -10
        Mockito.doNothing().when(service.isEven(0));
        Mockito.doNothing().when(service.isEven(5));
        Mockito.doNothing().when(service.isEven(-10));
        // WHEN: The highComplexityMethod is called with a = 0, b = 5, c = -10
        service.highComplexityMethod(0, 5, -10);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(0);
        Mockito.verify(service, Mockito.times(3)).isEven(5);
        Mockito.verify(service, Mockito.times(3)).isEven(-10);
    }

    @Test
    void highComplexityMethod_aIsZero_bIsNegative_cIsNegative() {
        // GIVEN: a = 0, b = -5, c = -10
        Mockito.doNothing().when(service.isEven(0));
        Mockito.doNothing().when(service.isEven(-5));
        Mockito.doNothing().when(service.isEven(-10));
        // WHEN: The highComplexityMethod is called with a = 0, b = -5, c = -10
        service.highComplexityMethod(0, -5, -10);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(0);
        Mockito.verify(service, Mockito.times(3)).isEven(-5);
        Mockito.verify(service, Mockito.times(3)).isEven(-10);
    }

    @Test
    void highComplexityMethod_aIsPositive_bIsPositive_cIsPositive() {
        // GIVEN: a = 5, b = 10, c = 15
        Mockito.doNothing().when(service.isEven(5));
        Mockito.doNothing().when(service.isEven(10));
        Mockito.doNothing().when(service.isEven(15));
        // WHEN: The highComplexityMethod is called with a = 5, b = 10, c = 15
        service.highComplexityMethod(5, 10, 15);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(5);
        Mockito.verify(service, Mockito.times(3)).isEven(10);
        Mockito.verify(service, Mockito.times(3)).isEven(15);
    }

    @Test
    void highComplexityMethod_aIsNegative_bIsPositive_cIsPositive() {
        // GIVEN: a = -5, b = 10, c = 15
        Mockito.doNothing().when(service.isEven(-5));
        Mockito.doNothing().when(service.isEven(10));
        Mockito.doNothing().when(service.isEven(15));
        // WHEN: The highComplexityMethod is called with a = -5, b = 10, c = 15
        service.highComplexityMethod(-5, 10, 15);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(-5);
        Mockito.verify(service, Mockito.times(3)).isEven(10);
        Mockito.verify(service, Mockito.times(3)).isEven(15);
    }

    @Test
    void highComplexityMethod_aIsPositive_bIsNegative_cIsPositive() {
        // GIVEN: a = 5, b = -10, c = 15
        Mockito.doNothing().when(service.isEven(5));
        Mockito.doNothing().when(service.isEven(-10));
        Mockito.doNothing().when(service.isEven(15));
        // WHEN: The highComplexityMethod is called with a = 5, b = -10, c = 15
        service.highComplexityMethod(5, -10, 15);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(5);
        Mockito.verify(service, Mockito.times(3)).isEven(-10);
        Mockito.verify(service, Mockito.times(3)).isEven(15);
    }

    @Test
    void highComplexityMethod_aIsNegative_bIsNegative_cIsPositive() {
        // GIVEN: a = -5, b = -10, c = 15
        Mockito.doNothing().when(service.isEven(-5));
        Mockito.doNothing().when(service.isEven(-10));
        Mockito.doNothing().when(service.isEven(15));
        // WHEN: The highComplexityMethod is called with a = -5, b = -10, c = 15
        service.highComplexityMethod(-5, -10, 15);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(-5);
        Mockito.verify(service, Mockito.times(3)).isEven(-10);
        Mockito.verify(service, Mockito.times(3)).isEven(15);
    }

    @Test
    void highComplexityMethod_aIsPositive_bIsNegative_cIsNegative() {
        // GIVEN: a = 5, b = -10, c = -15
        Mockito.doNothing().when(service.isEven(5));
        Mockito.doNothing().when(service.isEven(-10));
        Mockito.doNothing().when(service.isEven(-15));
        // WHEN: The highComplexityMethod is called with a = 5, b = -10, c = -15
        service.highComplexityMethod(5, -10, -15);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(5);
        Mockito.verify(service, Mockito.times(3)).isEven(-10);
        Mockito.verify(service, Mockito.times(3)).isEven(-15);
    }

    @Test
    void highComplexityMethod_aIsNegative_bIsNegative_cIsNegative() {
        // GIVEN: a = -5, b = -10, c = -15
        Mockito.doNothing().when(service.isEven(-5));
        Mockito.doNothing().when(service.isEven(-10));
        Mockito.doNothing().when(service.isEven(-15));
        // WHEN accesible: The highComplexityMethod is called with a = -5, b = -10, c = -15
        service.highComplexityMethod(-5, -10, -15);
        // THEN: Expected print statements should have been executed
        Mockito.verify(service, Mockito.times(3)).isEven(-5);
        Mockito.verify(service, Mockito.times(3)).isEven(-10);
        Mockito.verify(service, Mockito.times(3)).isEven(-15);
    }
}
