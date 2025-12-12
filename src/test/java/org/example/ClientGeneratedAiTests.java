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



class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_WhenNameIsNull_ThrowsIllegalArgumentException() {
        String name = null;
        try {
            client.greeting(name);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("'name' must not be null or empty");
        }
    }

    @Test
    void greeting_WhenNameIsEmpty_ThrowsIllegalArgumentException() {
        String name = "";
        try {
            client.greeting(name);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("'name' must not be null or empty");
        }
    }

    @Test
    void greeting_WhenNameLengthIsEven_ReturnsUpperCaseGreeting() {
        Mockito.when(serviceMock.isEven(4)).thenReturn(true);
        String name = "John";
        String result = client.greeting(name);
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_WhenNameLengthIsOdd_ReturnsLowerCaseGreeting() {
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        String name = "Jane";
        String result = client.greeting(name);
        assertThat(result).isEqualTo("Hello, Jane");
    }

}
