package org.example;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
class ClientGeneratedAiTests {

    @Mock
    private Service service;

    private Client client;

    @BeforeEach
    void setUp() {
        Mockito.reset(service);
        client = new Client(service);
    }

    @Test
    void shouldReturnUppercaseGreetingWhenNameLengthIsEven() {
        // GIVEN
        String name = "Alice";
        Mockito.when(service.isEven(name.length())).thenReturn(true);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    void shouldReturnNormalGreetingWhenNameLengthIsOdd() {
        // GIVEN
        String name = "Bob";
        Mockito.when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertThat(result).isEqualTo("Hello, Bob");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNameIsNull() {
        // GIVEN
        String name = null;

        // WHEN & THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNameIsEmpty() {
        // GIVEN
        String name = "";

        // WHEN & THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNameIsBlank() {
        // GIVEN
        String name = " ";

        // WHEN & THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}
