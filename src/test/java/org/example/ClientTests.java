package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @InjectMocks
    private Client client;

    @Mock
    private Service service;

    @Test
    public void testGreetingWithEvenLengthName() {
        when(service.isEven(anyInt())).thenReturn(true);
        String result = client.greeting("John");
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    public void testGreetingWithOddLengthName() {
        when(service.isEven(anyInt())).thenReturn(false);
        String result = client.greeting("Jane");
        assertEquals("Hello, Jane", result);
    }

    @Test
    public void testGreetingWithNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(null);
        });
    }

    @Test
    public void testGreetingWithEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            client.greeting("");
        });
    }
}