package org.example;

import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = new Service();
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        String name = "John";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, John", greeting);
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EvenLengthName_ReturnsUppercaseGreeting() {
        // GIVEN
        String name = "Alice";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("HELLO, ALICE", greeting.toUpperCase());
    }

    @Test
    void greeting_OddLengthName_ReturnsLowercaseGreeting() {
        // GIVEN
        String name = "Bob";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Bob", greeting);
    }
}