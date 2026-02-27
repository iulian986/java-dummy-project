package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_WithValidName_ReturnsGreetingInUpperCaseWhenLengthIsEven() {
        // GIVEN
        Mockito.when(serviceMock.isEven(4)).thenReturn(true);
        String name = "John";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("HELLO, JOHN", greeting);
    }

    @Test
    void greeting_WithValidName_ReturnsGreetingInLowerCaseWhenLengthIsOdd() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        String name = "Jane";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Jane", greeting);
    }

    @Test
    void greeting_WithNullName_ThrowsIllegalArgumentException() {
        // GIVEN
        String name = null;
        // WHEN
        // THEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
        // GIVEN
        String name = "";
        // WHEN
        // THEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }
}
