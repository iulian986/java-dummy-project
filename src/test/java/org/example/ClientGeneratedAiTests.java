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



class ClientGeneratedAiTests {

    private Service service;
    private Client client;

    @BeforeEach
    void setUp() {
        service = Mockito.mock(Service.class);
        client = new Client(service);
    }

    @Test
    void greeting_WithValidName_ReturnsGreetingInUpperCaseIfLengthIsEven() {
        // GIVEN
        Mockito.when(service.isEven(4)).thenReturn(true);
        // WHEN
        String greeting = client.greeting("John");
        // THEN
        assertThat(greeting).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_WithValidName_ReturnsGreetingInLowerCaseIfLengthIsOdd() {
        // GIVEN
        Mockito.when(service.isEven(5)).thenReturn(false);
        // WHEN
        String greeting = client.greeting("Jane");
        // THEN
        assertThat(greeting).isEqualTo("Hello, Jane");
    }

    @Test
    void greeting_WithNullName_ThrowsIllegalArgumentException() {
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
    void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
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
