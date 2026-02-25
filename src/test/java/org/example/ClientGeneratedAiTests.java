package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;




class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        String name = "John";

        // WHEN
        String greeting = client.greeting(name);

        // THEN
        assertThat(greeting).isEqualTo("Hello, John");
    }

    @Test
    void greeting_ValidName_ReturnsUpperCaseGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(6)).thenReturn(true);
        String name = "Jane";

        // WHEN
        String greeting = client.greeting(name);

        // THEN
        assertThat(greeting).isEqualTo("HELLO, JANE");
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;

        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting(name)).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("name must not be null or empty");
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";

        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting(name)).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("name must not be null or empty");
    }
}
