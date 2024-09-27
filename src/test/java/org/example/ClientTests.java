package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class ClientTests {

    @Test
    public void greeting_shouldThrowException_whenNameIsNull() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);

        IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(null);
        });

        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }

    @Test
    public void greeting_shouldThrowException_whenNameIsEmpty() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);

        IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            client.greeting("");
        });

        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }

    @Test
    public void greeting_shouldReturnUpperCaseGreeting_whenNameLengthIsEven() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);
        String name = "John";

        when(service.isEven(name.length())).thenReturn(true);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void greeting_shouldReturnLowerCaseGreeting_whenNameLengthIsOdd() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);
        String name = "Alice";

        when(service.isEven(name.length())).thenReturn(false);

        String result = client.greeting(name);

        assertThat(result).isEqualTo("Hello, Alice");
    }
}
