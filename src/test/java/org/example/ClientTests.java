package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

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
        assertThat(result).isEqualTo("HELLO, JOHN");
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
        assertThat(result).isEqualTo("Hello, Jane");
    }

    @Test
    public void testGreetingWithNullName() {
        // Arrange
        String name = null;

        // Act and Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void testGreetingWithEmptyName() {
        // Arrange
        String name = "";

        // Act and Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}