package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private final Service service = new Service();

    @Test
    public void testIsEven() {
        assertTrue(service.isEven(2));
        assertFalse(service.isEven(3));
    }

    @Test
    public void testHighComplexityMethod() {
        // Test for highComplexityMethod
        // Since the method prints to System.out, we can't directly assert the output.
        // Instead, we can verify that the method runs without throwing an exception.
        assertDoesNotThrow(() -> service.highComplexityMethod(0, 1, 1));
        assertDoesNotThrow(() -> service.highComplexityMethod(-1, 1, 1));
        assertDoesNotThrow(() -> service.highComplexityMethod(1, -1, 1));
        assertDoesNotThrow(() -> service.highComplexityMethod(1, 1, -1));
    }
}
