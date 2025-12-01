package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

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
    void testGreetingWithValidNameAndEvenLength() {
        // GIVEN: A valid name with even length
        String name = "John";
        Mockito.when(service.isEven(name.length())).thenReturn(true);

        // WHEN: Greeting method is called
        String result = client.greeting(name);

        // THEN: The greeting should be in uppercase
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void testGreetingWithValidNameAndOddLength() {
        // GIVEN: A valid name with odd length
        String name = "Jane";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN: Greeting method is called
        String result = client.greeting(name);

        // THEN: The greeting should be in original case
        assertEquals("Hello, Jane", result);
    }

    @Test
    void testGreetingWithNullName() {
        // GIVEN: A null name
        String name = null;

        // WHEN: Greeting method is called
        // THEN: An IllegalArgumentException should be thrown
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void testGreetingWithEmptyName() {
        // GIVEN: An empty name
        String name = "";

        // WHEN: Greeting method is called
        // THEN: An IllegalArgumentException should be thrown
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void testGreetingWithBlankName() {
        // GIVEN: A blank name
        String name = "   ";

        // WHEN: Greeting method is called
        // THEN: An IllegalArgumentException should be thrown
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void testGreetingWithServiceException() {
        // GIVEN: A valid name but the service throws an exception
        String name = "John";
        Mockito.when(service.isEven(name.length())).thenThrow(new RuntimeException("Service error"));

        // WHEN: Greeting method is called
        // THEN: A RuntimeException should be thrown
        RuntimeException exception = assertThrows(RuntimeException.class, () -> client.greeting(name));
        assertEquals("Service error", exception.getMessage());
    }

    @Test
    void testGreetingWithWhitespaceName() {
        // GIVEN: A name with only whitespace
        String name = "   ";

        // WHEN: Greeting method is called
        // THEN: An IllegalArgumentException should be thrown
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void testGreetingWithSingleCharacterName() {
        // GIVEN: A valid name with a single character
        String name = "A";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN: Greeting method is called
        String result = client.greeting(name);

        // THEN: The greeting should be in original case
        assertEquals("Hello, A", result);
    }

    @Test
    void testGreetingWithLongName() {
        // GIVEN: A valid name with a long length
        String name = "Alexander";
        Mockito.when(service.isEven(name.length())).thenReturn(true);

        // WHEN: Greeting method is called
        String result = client.greeting(name);

        // THEN: The greeting should be in uppercase
        assertEquals("HELLO, ALEXANDER", result);
    }

    @Test
    void testGreetingWithSpecialCharactersName() {
        // GIVEN: A valid name with special characters
        String name = "@John!";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN: Greeting method is called
        String result = client.greeting(name);

        // THEN: The greeting should be in original case
        assertEquals("Hello, @John!", result);
    }

    @Test
    void testGreetingWithEmptySpacesAroundName() {
        // GIVEN: A valid name with leading and trailing spaces
        String name = "  John  ";
        Mockito.when(service.isEven(name.trim().length())).thenReturn(true);

        // WHEN: Greeting method is called
        String result = client.greeting(name.trim());

        // THEN: The greeting should be in uppercase
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void testGreetingWithNameContainingNumbers() {
        // GIVEN: A valid name containing numbers
        String name = "John123";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN: Greeting method is called
        String result = client.greeting(name);

        // THEN: The greeting should be in original case
        assertEquals("Hello, John123", result);
    }
}
