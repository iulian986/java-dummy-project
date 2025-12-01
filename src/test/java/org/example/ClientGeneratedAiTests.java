package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @BeforeEach
    void setUp() {
        Mockito.reset(service);
    }

    @Test
    void greeting_shouldThrowException_whenNameIsNull() {
        // GIVEN
        String name = null;

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_shouldThrowException_whenNameIsEmpty() {
        // GIVEN
        String name = "";

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_shouldThrowException_whenNameIsBlank() {
        // GIVEN
        String name = "   ";

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void greeting_shouldReturnUppercaseGreeting_whenNameLengthIsEven() {
        // GIVEN
        String name = "John";
        Mockito.when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void greeting_shouldReturnNormalGreeting_whenNameLengthIsOdd() {
        // GIVEN
        String name = "Jane";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, Jane", result);
    }

    @Test
    void greeting_shouldHandleSingleCharacterName() {
        // GIVEN
        String name = "A";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, A", result);
    }

    @Test
    void greeting_shouldHandleLongNameWithEvenLength() {
        // GIVEN
        String name = "Alexander";
        Mockito.when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, ALEXANDER", result);
    }

    @Test
    void greeting_shouldHandleLongNameWithOddLength() {
        // GIVEN
        String name = "Alexandra";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, Alexandra", result);
    }

    @Test
    void greeting_shouldHandleNameWithSpecialCharacters() {
        // GIVEN
        String name = "John@123";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, John@123", result);
    }

    @Test
    void greeting_shouldHandleNameWithSpaces() {
        // GIVEN
        String name = "John Doe";
        Mockito.when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, JOHN DOE", result);
    }

    @Test
    void greeting_shouldHandleNameWithMixedCase() {
        // GIVEN
        String name = "JoHnDoE";
        Mockito.when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, JOHNDOE", result);
    }

    @Test
    void greeting_shouldHandleNameWithNumbers() {
        // GIVEN
        String name = "John123";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, John123", result);
    }

    @Test
    void greeting_shouldHandleNameWithTrailingSpaces() {
        // GIVEN
        String name = " John ";
        Mockito.when(service.isEven(name.trim().length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name.trim());

        // THEN
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void greeting_shouldHandleNameWithLeadingSpaces() {
        // GIVEN
        String name = "   Jane";
        Mockito.when(service.isEven(name.trim().length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name.trim());

        // THEN
        assertEquals("Hello, Jane", result);
    }

    @Test
    void greeting_shouldHandleNameWithMultipleSpaces() {
        // GIVEN
        String name = "John   Doe";
        Mockito.when(service.isEven(name.trim().length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name.trim());

        // THEN
        assertEquals("HELLO, JOHN   DOE", result);
    }
}
