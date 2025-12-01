package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ServiceGeneratedAiTests {

    private static Service service;

    @BeforeAll
    public static void setUp() {
        service = new Service();
    }

    @Test
    public void testIsEven() {
        // Given
        int input = 2;

        // When
        boolean result = service.isEven(input);

        // Then
        assertEquals(true, result);
    }

    @Test
    public void testHighComplexityMethod() {
        // Given
        int a = 0;
        int b = 1;
        int c = -1;

        // When
        service.highComplexityMethod(a, b, c);

        // Then
        // The output should be:
        // "a is positive"
        // "b is non-positive"
        // "c is non-positive"

        // This test will need to verify the console output or use a logging mechanism to check the printed statements.
    }
}
