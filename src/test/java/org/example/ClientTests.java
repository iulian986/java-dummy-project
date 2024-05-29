package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private Service serviceMock;

    @Test
    public void testGreetingUpperCase() {
        Client client = new Client(serviceMock);
        String name = "John";
        when(serviceMock.isEven(name.length())).thenReturn(true);

        String result = client.greeting(name);

        assertEquals("HELLO, JOHN", result);
    }

    @Test
    public void testGreetingLowerCase() {
        Client client = new Client(serviceMock);
        String name = "Alice";
        when(serviceMock.isEven(name.length())).thenReturn(false);

        String result = client.greeting(name);

        assertEquals("Hello, Alice", result);
    }

    @Test
    public void testGreetingEmptyName() {
        Client client = new Client(serviceMock);
        String name = "";
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });

        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    public void testGreetingNullName() {
        Client client = new Client(serviceMock);
        String name = null;
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });

        assertEquals("'name' must not be null or empty", exception.getMessage());
    }
}