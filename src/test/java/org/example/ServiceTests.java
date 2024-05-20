package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        Service service = new Service();
        assertAll(
            () -> assertTrue(service.isEven(2)),
            () -> assertFalse(service.isEven(3))
        );
    }

    @Test
    public void testHighComplexityMethod() {
        Service service = new Service();
        int a = 1;
        int b = 2;
        int c = 3;

        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            service.highComplexityMethod(a, b, c);
        });
    }
}