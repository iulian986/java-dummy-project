package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

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
    public void greetingShouldReturnUpperCaseWhenNameLengthIsEven() {
        // Given
        String name = "John";
        when(service.isEven(name.length())).thenReturn(true);

        // When
        String result = client.greeting(name);

        // Then
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void greetingShouldReturnLowerCaseWhenNameLengthIsOdd() {
        // Given
        String name = "Jane";
        when(service.isEven(name.length())).thenReturn(false);

        // When
        String result = client.greeting(name);

        // Then
        assertThat(result).isEqualTo("Hello, Jane");
    }

    @Test
    public void greetingShouldThrowExceptionWhenNameIsNull() {
        // Given
        String name = null;

        // When/Then
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greetingShouldThrowExceptionWhenNameIsEmpty() {
        // Given
        String name = "";

        // When/Then
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}