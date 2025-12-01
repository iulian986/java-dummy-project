package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClientGeneratedAiTests {

    private Service mockService;
    private Client client;

    @BeforeEach
    void setUp() {
        mockService = Mockito.mock(Service.class);
        client = new Client(mockService);
    }

    @Test
    void givenValidName_whenGreeting_thenReturnsFormattedGreeting() {
        // GIVEN
        String name = "John";
        Mockito.when(mockService.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, John", result);
    }

    @Test
    void givenValidNameWithEvenLength_whenGreeting_thenReturnsUppercaseGreeting() {
        // GIVEN
        String name = "Jane";
        Mockito.when(mockService.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, JANE", result);
    }

    @Test
    void givenNullName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = null;

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void givenEmptyName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = "";

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void givenBlankName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = "   ";

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void givenServiceThrowsException_whenGreeting_thenPropagatesException() {
        // GIVEN
        String name = "John";
        Mockito.when(mockService.isEven(name.length())).thenThrow(new RuntimeException("Service error"));

        // WHEN & THEN
        RuntimeException exception = assertThrows(RuntimeException.class, () -> client.greeting(name));
        assertEquals("Service error", exception.getMessage());
    }
}
