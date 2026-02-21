package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_WithValidName_ReturnsGreetingInUpperCaseIfLengthIsEven() {
        // GIVEN
        Mockito.when(serviceMock.isEven(4)).thenReturn(true);
        // WHEN
        String result = client.greeting("John");
        // THEN
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void greeting_WithValidName_ReturnsGreetingInLowerCaseIfLengthIsOdd() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        // WHEN
        String result = client.greeting("Jane");
        // THEN
        assertEquals("Hello, Jane", result);
    }

    @Test
    void greeting_WithNullName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        try {
            client.greeting(null);
        } catch (IllegalArgumentException e) {
            // THEN
            assertEquals("'name' must not be null or empty", e.getMessage());
        }
    }

    @Test
    void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        try {
            client.greeting("");
        } catch (IllegalArgumentException e) {
            // THEN
            assertEquals("'name' must not be null or empty", e.getMessage());
        }
    }


}
