package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mockito;
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
    public void testGreetingWithEvenLength() {
        Client client = new Client(service);
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(true);
        String result = client.greeting(name);
        assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void testGreetingWithOddLength() {
        Client client = new Client(service);
        String name = "Bob";
        when(service.isEven(name.length())).thenReturn(false);
        String result = client.greeting(name);
        assertThat(result).isEqualTo("Hello, Bob");
    }

    @Test
    public void testGreetingWithNullName() {
        Client client = new Client(service);
        String name = null;
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void testGreetingWithEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            Client client = new Client(service);
            String name = "";
            client.greeting(name);
        });
    }
}