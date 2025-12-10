package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
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
    void greeting_ShouldReturnUppercaseGreeting_WhenNameLengthIsEven() {
        // GIVEN: Name length is even
        Mockito.when(serviceMock.isEven(4)).thenReturn(true); 
        // WHEN: Greeting is called with "John"
        String greeting = client.greeting("John");
        // THEN: Greeting should be in uppercase
        assertEquals("HELLO, JOHN", greeting);
    }

    @Test
    void greeting_ShouldReturnLowercaseGreeting_WhenNameLengthIsOdd() {
        // GIVEN: Name length is odd
        Mockito.when(serviceMock.isEven(5)).thenReturn(false); 
        // WHEN: Greeting is called with "Jane"
        String greeting = client.greeting("Jane");
        // THEN: Greeting should be in lowercase
        assertEquals("Hello, Jane", greeting);
    }

    @Test
    void greeting_ShouldThrowIllegalArgumentException_WhenNameIsNull() {
        // GIVEN: Name is null
        // WHEN: Greeting is called with null
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null)); 
    }

    @Test
    void greeting_ShouldThrowIllegalArgumentException_WhenNameIsEmpty() {
        // GIVEN: Name is empty string
        // WHEN: Greeting is called with ""
        assertThrows(IllegalArgumentException.class, () -> client.greeting("")); 
    }
}
