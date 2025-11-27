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
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class ClientGeneratedAiTests {
    @InjectMocks
    private Client client;
    @Mock
    private Service service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        String name = "John";
        Mockito.when(service.isEven(name.length())).thenReturn(true);
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertThat(greeting).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";
        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("name must not be null or empty");
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;
        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("name must not be null or empty");
    }

}