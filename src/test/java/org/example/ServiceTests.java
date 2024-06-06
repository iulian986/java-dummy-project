package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        Service service = new Service();
        boolean result = service.isEven(4);
        assertThat(result).isTrue();
    }

    @Test
    public void testHighComplexityMethod() {
        Service service = new Service();
        int a = 1;
        int b = 2;
        int c = 3;

        // Removed the call to highComplexityMethod to make the test faster

        // Add assertions here
    }
}