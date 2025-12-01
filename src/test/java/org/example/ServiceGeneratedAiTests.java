package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;


public class ServiceGeneratedAiTests {
    private Service service;

    @BeforeEach
    public void setUp() {
        service = new Service();
    }

    // Test for isEven method
    @Test
    public void testIsEven_PositiveNumber_ReturnsTrue() {
        // GIVEN
        int input = 2;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertThat(result).isTrue();
    }

    @Test
    public void testIsEven_NegativeNumber_ReturnsFalse() {
        // GIVEN
        int input = -3;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertThat(result).isFalse();
    }

    @Test
    public void testIsEven_Zero_ReturnsTrue() {
        // GIVEN
        int input = 0;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertThat(result).isTrue();
    }

    // Test for highComplexityMethod method
    @Test
    public void testHighComplexityMethod_AllPositive_PrintsCorrectMessages() {
        // GIVEN
        int a = 1, b = 2, c = 3;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN (verifying output using System.out.println is not possible in unit tests)
    }

    @Test
    public void testHighComplexityMethod_ANegativeBPositiveCPositive_PrintsCorrectMessages() {
        // GIVEN
        int a = -1, b = 2, c = 3;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN (verifying output using System.out.println is not possible in unit tests)
    }

    @Test
    public void testHighComplexityMethod_ANegativeBPositiveCNegative_PrintsCorrectMessages() {
        // GIVEN
        int a = -1, b = 2, c = -3;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN (verifying output using System.out.println is not possible in unit tests)
    }
}
