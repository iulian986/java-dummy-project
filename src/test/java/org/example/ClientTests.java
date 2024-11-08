package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class ClientTests {

    @Test
    public void greeting_shouldThrowException_whenNameIsNull() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);

        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(null);
        });

        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }

    @Test
    public void greeting_shouldThrowException_whenNameIsEmpty() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);

        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            client.greeting("");
        });

        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }

    @Test
    public void greeting_shouldReturnUpperCaseGreeting_whenNameLengthIsEven() {
        Service service = Mockito.mock(Service.class);
        when(service.isEven(4)).thenReturn(true);
        Client client = new Client(service);

        String result = client.greeting("John");

        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void greeting_shouldReturnLowerCaseGreeting_whenNameLengthIsOdd() {
        Service service = Mockito.mock(Service.class);
        when(service.isEven(5)).thenReturn(false);
        Client client = new Client(service);

        String result = client.greeting("Alice");

        assertThat(result).isEqualTo("Hello, Alice");
    }
}
