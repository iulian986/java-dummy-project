package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    public void testGreeting() {
        Service service = new Service();
        Client client = new Client(service);
        String name = "World";
        String greeting = client.greeting(name);
        assertEquals("Hello, World".formatted(name), greeting);
    }

    @Test
    public void testEvenNumber() {
        Service service = new Service();
        Client client = new Client(service);
        String name = "12345";
        boolean even = service.isEven(name.length());
        assertEquals(true, even);
    }

    @Test
    public void testNegativeNumber() {
        Service service = new Service();
        Client client = new Client(service);
        String name = "12345";
        boolean even = service.isEven(name.length());
        assertEquals(false, even);
    }

    @Test
    public void testNullName() {
        Service service = new Service();
        Client client = new Client(service);
        assertEquals("Hello, null".formatted(client.greeting(null)), client.greeting(null));
    }

    @Test
    public void testEmptyName() {
        Service service = new Service();
        Client client = new Client(service);
        assertEquals("Hello, empty".formatted(client.greeting(null)), client.greeting(null));
    }
}
