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
    public void greeting_WithValidName_ReturnsGreeting() {
        String name = "John";
        when(service.isEven(name.length())).thenReturn(false);
        String result = client.greeting(name);
        assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    public void greeting_WithEvenLengthName_ReturnsUppercaseGreeting() {
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(true);
        String result = client.greeting(name);
        assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void greeting_WithNullName_ThrowsIllegalArgumentException() {
        String name = null;
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
        String name = "";
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}