package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
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
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        // WHEN
        String greeting = client.greeting("John");
        // THEN
        assertEquals("Hello, John", greeting);
    }

    @Test
    void greeting_ValidNameEvenLength_ReturnsUpperCaseGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(4)).thenReturn(true);
        // WHEN
        String greeting = client.greeting("John");
        // THEN
        assertEquals("HELLO, JOHN", greeting);
    }

    @Test
    void greeting_NullName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
        // THEN
    }

    @Test
    void greeting_EmptyName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
        // THEN
    }



}
