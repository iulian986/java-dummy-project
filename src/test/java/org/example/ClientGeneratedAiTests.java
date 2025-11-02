package org.example;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

public class ClientGeneratedAiTests {

    private Service service;

    private Client client;

    @BeforeEach
    void setUp() {
        service = mock(Service.class);
        client = new Client(service);
    }

    @Test
    void givenValidNameWithEvenLength_whenGreeting_thenReturnsUpperCaseGreeting() {
        // GIVEN
        String name = "John";
        when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    void givenValidNameWithOddLength_whenGreeting_thenReturnsNormalGreeting() {
        // GIVEN
        String name = "Bob";
        when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertThat(result).isEqualTo("Hello, Bob");
    }

    @Test
    void givenNullName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = null;

        // WHEN / THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    void givenBlankName_whenGreeting_thenThrowsIllegalArgumentException() {
        // GIVEN
        String name = "   ";

        // WHEN / THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}
