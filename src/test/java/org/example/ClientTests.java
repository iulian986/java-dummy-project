package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @Test
    public void greeting_shouldReturnUpperCase_whenNameLengthIsEven() {
        // Arrange
        String name = "John";
        when(service.isEven(name.length())).thenReturn(true);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void greeting_shouldReturnLowerCase_whenNameLengthIsOdd() {
        // Arrange
        String name = "Jane";
        when(service.isEven(name.length())).thenReturn(false);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("Hello, Jane");
    }

    @Test
    public void greeting_shouldThrowException_whenNameIsNull() {
        // Arrange
        String name = null;

        // Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_shouldThrowException_whenNameIsEmpty() {
        // Arrange
        String name = "";

        // Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}