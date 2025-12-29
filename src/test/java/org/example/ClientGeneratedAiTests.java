package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ClientGeneratedAiTests {
    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @BeforeEach
    void setUp() {
        // Reset mocks before each test
    }

    @Test
    void greeting_WhenNameIsNull_ThenThrowIllegalArgumentException() {
        // GIVEN
        String name = null;

        // WHEN
        // THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_WhenNameIsBlank_ThenThrowIllegalArgumentException() {
        // GIVEN
        String name = "   ";

        // WHEN
        // THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_WhenNameLengthIsEven_ThenReturnUpperCaseGreeting() {
        // GIVEN
        String name = "Bob";
        when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, BOB", result);
    }

    @Test
    void greeting_WhenNameLengthIsOdd_ThenReturnNormalCaseGreeting() {
        // GIVEN
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, Alice", result);
    }

    @Test
    void greeting_WhenNameIsEmpty_ThenThrowIllegalArgumentException() {
        // GIVEN
        String name = "";

        // WHEN
        // THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_WhenNameContainsUnicodeCharacters_ThenReturnFormattedGreeting() {
        // GIVEN
        String name = "José";
        when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, José", result);
    }

    @Test
    void greeting_WhenNameIsExactlyThreeCharacters_ThenReturnUpperCaseGreeting() {
        // GIVEN
        String name = "Cat";
        when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, Cat", result);
    }
}
