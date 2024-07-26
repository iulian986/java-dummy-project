package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.Duration;

class ClientTests {

    @Test
    void testGreetingValidName() {
        Service mockService = mock(Service.class);
        when(mockService.isEven(anyInt())).thenReturn(true);

        Client client = new Client(mockService);
        String result = client.greeting("Alice");

        assertEquals("HELLO, ALICE", result);
    }

    @Test
    void testGreetingInvalidName() {
        Service mockService = mock(Service.class);

        Client client = new Client(mockService);

        assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
            assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
        });
    }
}
