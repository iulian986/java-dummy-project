package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private Service serviceMock;

    @Test
    public void testGreetingUpperCase() {
        Client client = new Client(serviceMock);
        String name = "Alice";
        when(serviceMock.isEven(name.length())).thenReturn(true);
        String result = client.greeting(name);
        assertEquals("HELLO, ALICE", result);
    }

    @Test
    public void testGreetingLowerCase() {
        Client client = new Client(serviceMock);
        String name = "Bob";
        when(serviceMock.isEven(name.length())).thenReturn(false);
        String result = client.greeting(name);
        assertEquals("Hello, Bob", result);
    }

    @Test
    public void testGreetingNullName() {
        Client client = new Client(serviceMock);
        String name = null;
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    public void testGreetingEmptyName() {
        Client client = new Client(serviceMock);
        String name = "";
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }
}
