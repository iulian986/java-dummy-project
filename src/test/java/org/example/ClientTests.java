package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        when(service.isEven(4)).thenReturn(true);
        String result = client.greeting("John");
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void testGreetingWithOddLengthName() {
        when(service.isEven(5)).thenReturn(false);
        String result = client.greeting("Alice");
        assertThat(result).isEqualTo("Hello, Alice");
    }

    @Test
    public void testGreetingWithNullName() {
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }

    @Test
    public void testGreetingWithEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }

}
