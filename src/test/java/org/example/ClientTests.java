package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @InjectMocks
    private Client client;

    @Test
    public void testGreetingWithEvenLengthName() {
        // Arrange
        String name = "John";
        Service service = mock(Service.class);
        when(service.isEven(name.length())).thenReturn(true);
        client = new Client(service);

        // Act
        String result = client.greeting(name);

        // Assert
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    public void testGreetingWithOddLengthName() {
        // Arrange
        String name = "Jane";
        Service service = mock(Service.class);
        when(service.isEven(name.length())).thenReturn(false);
        client = new Client(service);

        // Act
        String result = client.greeting(name);

        // Assert
        assertEquals("Hello, Jane", result);
    }

    @Test
    public void testGreetingWithNullName() {
        // Arrange
        String name = null;

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    public void testGreetingWithEmptyName() {
        // Arrange
        String name = "";

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }
}