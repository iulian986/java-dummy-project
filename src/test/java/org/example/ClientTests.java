package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private Service service;

    @Test
    public void greeting_WithValidName_ReturnsGreeting() {
        Client client = new Client(service);
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(false);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("Hello, Alice");
    }

    @Test
    public void greeting_WithEvenLengthName_ReturnsUppercaseGreeting() {
        Client client = new Client(service);
        String name = "Bob";
        when(service.isEven(name.length())).thenReturn(true);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("HELLO, BOB");
    }

    @Test
    public void greeting_WithNullName_ThrowsIllegalArgumentException() {
        Client client = new Client(service);
        String name = null;

        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
        Client client = new Client(service);
        String name = "";

        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}