package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private Service service;

    @Test
    public void testGreetingUpperCase() {
        Client client = new Client(service);
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(true);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void testGreetingLowerCase() {
        Client client = new Client(service);
        String name = "Bob";
        when(service.isEven(name.length())).thenReturn(false);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("Hello, Bob");
    }

    @Test
    public void testGreetingEmptyName() {
        Client client = new Client(service);
        String name = "";
        
        assertThatThrownBy(() -> client.greeting(name))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void testGreetingNullName() {
        Client client = new Client(service);
        String name = null;
        
        assertThatThrownBy(() -> client.greeting(name))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("'name' must not be null or empty");
    }
}
