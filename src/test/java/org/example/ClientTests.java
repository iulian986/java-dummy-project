package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {
    @Mock
    private Service service;

    @Test
    public void greeting_WithValidName_ReturnsGreeting() {
        // Arrange
        String name = "John";
        when(service.isEven(name.length())).thenReturn(false);
        Client client = new Client(service);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    public void greeting_WithValidNameAndEvenLength_ReturnsUppercaseGreeting() {
        // Arrange
        String name = "Jane";
        when(service.isEven(name.length())).thenReturn(true);
        Client client = new Client(service);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("HELLO, JANE");
    }

    @Test
    public void greeting_WithNullName_ThrowsIllegalArgumentException() {
        // Arrange
        String name = null;
        Client client = new Client(service);

        // Act and Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
        // Arrange
        String name = "";
        Client client = new Client(service);

        // Act and Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}