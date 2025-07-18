package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ClientGeneratedAiTests {

    @Mock
    private Service service;

    private Client client;

    @BeforeEach
    void setUp() {
        client = new Client(service);
    }

    @Test
    void greeting_givenNullName_shouldThrowIllegalArgumentException() {
        // GIVEN
        String name = null;

        // WHEN / THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_givenBlankName_shouldThrowIllegalArgumentException() {
        // GIVEN
        String name = "   ";

        // WHEN / THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_givenNameWithEvenLength_shouldReturnUpperCaseGreeting() {
        // GIVEN
        String name = "John"; // length 4, even
        when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void greeting_givenNameWithOddLength_shouldReturnNormalGreeting() {
        // GIVEN
        String name = "Alice"; // length 5, odd
        when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, Alice", result);
    }
}
