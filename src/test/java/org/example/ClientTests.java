package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @InjectMocks
    private Client client;

    @Test
    public void testGreetingUpperCase() {
        // Arrange
        Service service = mock(Service.class);
        when(service.isEven(anyInt())).thenReturn(true);
        client = new Client(service);

        // Act
        String result = client.greeting("John");

        // Assert
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    public void testGreetingLowerCase() {
        // Arrange
        Service service = mock(Service.class);
        when(service.isEven(anyInt())).thenReturn(false);
        client = new Client(service);

        // Act
        String result = client.greeting("Jane");

        // Assert
        assertEquals("Hello, Jane", result);
    }

    @Test
    public void testGreetingNullName() {
        // Arrange
        Service service = mock(Service.class);
        client = new Client(service);

        // Act and Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(null);
        });
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }

    @Test
    public void testGreetingEmptyName() {
        // Arrange
        Service service = mock(Service.class);
        client = new Client(service);

        // Act and Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting("");
        });
        assertEquals("'name' must not be null or empty", exception.getMessage());
    }
}