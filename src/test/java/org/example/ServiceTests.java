package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        Service service = new Service();
        assertTrue(service.isEven(2));
        assertFalse(service.isEven(3));
    }

    @Test
    public void testHighComplexityMethod() {
        Service service = new Service();
        // Test case 1
        service.highComplexityMethod(1, 2, 3);
        // Add assertions here

        // Test case 2
        service.highComplexityMethod(-1, -2, -3);
        // Add assertions here

        // Test case 3
        service.highComplexityMethod(0, 0, 0);
        // Add assertions here
    }
}
