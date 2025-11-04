package org.example;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
class ClientGeneratedAiTests {

    @Mock
    private Service mockService;

    private Client client;

    @BeforeEach
    void setUp() {
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
        assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    void givenValidNameWithEvenLength_whenGreeting_thenReturnsUppercaseGreeting() {
        // GIVEN
        String name = "Jane";
        Mockito.when(mockService.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertThat(result).isEqualTo("HELLO, JANE");
    }

    @Test
    void givenNullName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = null;

        // WHEN & THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    void givenEmptyName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = "";

        // WHEN & THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    void givenBlankName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = "   ";

        // WHEN & THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}
