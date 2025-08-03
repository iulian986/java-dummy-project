package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void testGreeting() {
        Client client = new Client(new Service("Alice"));
        String name = "Bob";
        String greeting = client.greeting(name);
        assertThat(greeting).isEqualTo("Hello, Bob");
    }

    @Test
    public void testEvenNumber() {
        Client client = new Client(new Service("Test"));
        boolean even = 10 % 2 == 0;
        String greeting = client.greeting(null);
        assertTrue(even);
        assertThat(greeting).isEqualTo("Hello, Test");
    }

    @Test
    public void testNonEvenNumber() {
        Client client = new Client(new Service("Test"));
        boolean even = 10 % 2 != 0;
        String greeting = client.greeting(null);
        assertFalse(even);
        assertThat(greeting).isEqualTo("Hello, Test");
    }

    @Test
    public void testHighComplexityMethod() {
        Client client = new Client(new Service("Complex"));
        client.highComplexityMethod(5, 10, 15);
        assertNotNull(client.highComplexityMethod);
        assertEquals(5, client.highComplexityMethod(5, 10, 15));
    }

    @Test
    public void testNullName() {
        Client client = new Client(new Service("Test"));
        assertNull(client.greeting("")););
    }

    @Test
    public void testEmptyName() {
        Client client = new Client(new Service("Test"));
        assertNull(client.greeting("")););
    }
}