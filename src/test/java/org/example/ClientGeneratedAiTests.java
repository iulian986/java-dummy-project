package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.*;

import static org.powermock.api.mockito.PowerMockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ClientGeneratedAiTests {

    @Test
    public void testGreeting_evenNameLength() {
        // GIVEN
        Service service = mock(Service.class);
        when(service.isEven(10)).thenReturn(true);

        Client client = new Client(service);

        // WHEN
        String result = client.greeting("Hello");

        // THEN
        assertThat(result).isEqualTo("Hello, Hello");
    }

    @Test
    public void testGreeting_oddNameLength() {
        // GIVEN
        Service service = mock(Service.class);
        when(service.isEven(10)).thenReturn(false);

        Client client = new Client(service);

        // WHEN
        String result = client.greeting("Hello");

        // THEN
        assertThat(result).isEqualTo("Hello, Hello");
    }

    @Test
    public void testGreeting_blankName() {
        // GIVEN
        Service service = mock(Service.class);
        when(service.isEven(0)).thenReturn(true);

        Client client = new Client(service);

        // WHEN
        String result = client.greeting("");

        // THEN
        assertThat(result).isEqualTo("Hello, ");
    }

    @Test
    public void testGreeting_nullName() {
        // GIVEN
        Service service = mock(Service.class);
        when(service.isEven(0)).thenReturn(true);

        Client client = new Client(service);

        // WHEN
        String result = client.greeting(null);

        // THEN
        assertThat(result).isEqualTo("Hello, ");
    }
}
