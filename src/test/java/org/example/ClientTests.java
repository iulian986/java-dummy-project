package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private Service service;

    private Client client;

    @BeforeEach
    public void setUp() {
        client = new Client(service);
    }

    @Test
    public void testGreetingWithEvenLengthName() {
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(true);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void testGreetingWithOddLengthName() {
        String name = "Bob";
        when(service.isEven(name.length())).thenReturn(false);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("Hello, Bob");
    }

    @Test
    public void testGreetingWithNullName() {
        String name = null;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });

        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }

    @Test
    public void testGreetingWithEmptyName() {
        String name = "";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });

        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }
}