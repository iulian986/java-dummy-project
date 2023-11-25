
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private Service service;

    private Client client;

    @BeforeEach
    public void setup() {
        client = new Client(service);
    }

    @Test
    public void greeting_WithValidName_ReturnsGreeting() {
        // Arrange
        String name = "John";
        when(service.isEven(name.length())).thenReturn(false);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    public void greeting_WithEvenLengthName_ReturnsUppercaseGreeting() {
        // Arrange
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(true);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void greeting_WithNullName_ThrowsIllegalArgumentException() {
        // Arrange
        String name = null;

        // Act & Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
        // Arrange
        String name = "";

        // Act & Assert
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}
