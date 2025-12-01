package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClientGeneratedAiTests {

    private Service mockService;
    private Client client;

    @BeforeEach
    void setUp() {
        mockService = Mockito.mock(Service.class);
        client = new Client(mockService);
    }

    @Test
    void givenValidName_whenGreetingCalled_thenReturnsProperGreeting() {
        // GIVEN
        String name = "John";
        Mockito.when(mockService.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, John", result);
    }

    @Test
    void givenValidNameWithEvenLength_whenGreetingCalled_thenReturnsUppercaseGreeting() {
        // GIVEN
        String name = "Jane";
        Mockito.when(mockService.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, JANE", result);
    }

    @Test
    void givenNullName_whenGreetingCalled_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = null;

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void givenEmptyName_whenGreetingCalled_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = "";

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void givenBlankName_whenGreetingCalled_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = "   ";

        // WHEN & THEN
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    void givenNameWithSpecialCharacters_whenGreetingCalled_thenReturnsProperGreeting() {
        // GIVEN
        String name = "@John!";
        Mockito.when(mockService.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, @John!", result);
    }

    @Test
    void givenNameWithSpecialCharactersAndEvenLength_whenGreetingCalled_thenReturnsUppercaseGreeting() {
        // GIVEN
        String name = "@Jane!";
        Mockito.when(mockService.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, @JANE!", result);
    }

    @Test
    void givenNameWithWhitespace_whenGreetingCalled_thenReturnsProperGreeting() {
        // GIVEN
        String name = "John Doe";
        Mockito.when(mockService.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, John Doe", result);
    }

    @Test
    void givenNameWithWhitespaceAndEvenLength_whenGreetingCalled_thenReturnsUppercaseGreeting() {
        // GIVEN
        String name = "Jane Doe";
        Mockito.when(mockService.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, JANE DOE", result);
    }

    @Test
    void givenNameWithSingleCharacter_whenGreetingCalled_thenReturnsProperGreeting() {
        // GIVEN
        String name = "A";
        Mockito.when(mockService.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("Hello, A", result);
    }

    @Test
    void givenNameWithSingleCharacterAndEvenLength_whenGreetingCalled_thenReturnsUppercaseGreeting() {
        // GIVEN
        String name = "AA";
        Mockito.when(mockService.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertEquals("HELLO, AA", result);
    }
}
