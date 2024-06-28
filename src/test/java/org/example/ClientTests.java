package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ClientTests {

    @Mock
    private Service service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGreetingWithEvenLengthName() {
        when(service.isEven(Mockito.anyInt())).thenReturn(true);
        assertThat(new Client(service).greeting("Alice")).isEqualTo("HELLO, ALICE");
    }

    @Test
    void testGreetingWithOddLengthName() {
        when(service.isEven(3)).thenReturn(false); // Assuming '3' is the length of "Bob"
        assertThat(new Client(service).greeting("Bob")).isEqualTo("Hello, Bob");
    }

    @Test
    void testGreetingWithNullName() {
        when(service.isEven(Mockito.anyInt())).thenThrow(new IllegalArgumentException("'name' must not be null or empty"));
        assertThatThrownBy(() -> new Client(service).greeting(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}
