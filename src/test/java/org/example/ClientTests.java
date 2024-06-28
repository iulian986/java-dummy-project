package org.example;

import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class ClientTests {

    @Test
    void testGreeting() {
        Service service = mock(Service.class);
        when(service.isEven(5)).thenReturn(true);

        Client client = new Client(service);
        String result = client.greeting("John");

        assertEquals("HELLO, JOHN", result.toUpperCase());
    }

    @Test
    void testGreetingEmptyName() {
        Service service = mock(Service.class);
        when(service.isEven(0)).thenReturn(false);

        Client client = new Client(service);
        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }

    @Test
    void testGreetingNullName() {
        Service service = mock(Service.class);
        when(service.isEven(0)).thenReturn(false);

        Client client = new Client(service);
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }
}
