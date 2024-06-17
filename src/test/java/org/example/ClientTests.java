package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.Duration;

public class ClientTests {

    @Test
    void testGreetingWithValidName() {
        // Given
        Service service = mock(Service.class);
        when(service.isEven(anyInt())).thenReturn(true);
        Client client = new Client(service);
        String name = "Alice";

        // When
        String result = client.greeting(name);

        // Then
        assertEquals("HELLO, ALICE", result);
    }

    @Test
    void testGreetingWithEmptyName() {
        // Given
        Service service = mock(Service.class);
        Client client = new Client(service);
        String name = "";

        // When & Then
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            assertThatThrownBy(() -> client.greeting(name))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("'name' must not be null or empty");
        });
    }

    @Test
    void testGreetingWithNullName() {
        // Given
        Service service = mock(Service.class);
        Client client = new Client(service);
        String name = null;

        // When & Then
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            assertThatThrownBy(() -> client.greeting(name))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("'name' must not be null or empty");
        });
    }
}