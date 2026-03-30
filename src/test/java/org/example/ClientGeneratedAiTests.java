package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGreetingWithValidName() {
        // GIVEN
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, ALICE", result);
        verify(service).isEven(name.length());
    }

    @Test
    void testGreetingWithEmptyName() {
        // GIVEN
        String name = "";

        // WHEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });

        // THEN
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void testGreetingWithNullName() {
        // GIVEN
        String name = null;

        // WHEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });

        // THEN
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }
}
