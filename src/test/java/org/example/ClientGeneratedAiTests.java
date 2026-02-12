package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreetingInUppercase() {
        // GIVEN
        Mockito.when(serviceMock.isEven(4)).thenReturn(true);

        // WHEN
        String greeting = client.greeting("John");

        // THEN
        assertThat(greeting).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_ValidName_ReturnsGreetingInLowercase() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);

        // WHEN
        String greeting = client.greeting("Jane");

        // THEN
        assertThat(greeting).isEqualTo("Hello, Jane");
    }

    @Test
    void greeting_NullName_ThrowsIllegalArgumentException() {
        // GIVEN

        // WHEN
        try {
            client.greeting(null);
        } catch (IllegalArgumentException e) {
            // THEN
            assertThat(e.getMessage()).isEqualTo("'name' must not be null or empty");
        }
    }

    @Test
    void greeting_EmptyName_ThrowsIllegalArgumentException() {
        // GIVEN

        // WHEN
        try {
            client.greeting("");
        } catch (IllegalArgumentException e) {
            // THEN
            assertThat(e.getMessage()).isEqualTo("'name' must not be null or empty");
        }
    }
}
