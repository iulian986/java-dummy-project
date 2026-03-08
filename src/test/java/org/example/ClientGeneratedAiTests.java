package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



class ClientGeneratedAiTests {

    private Client client;
    private Service service;

    @BeforeEach
    void setUp() {
        service = Mockito.mock(Service.class);
        client = new Client(service);
    }

    @Test
    void greeting_withValidName_returnsGreeting() {
        // GIVEN
        Mockito.when(service.isEven(5)).thenReturn(false);
        // WHEN
        String greeting = client.greeting("John");
        // THEN
        assertThat(greeting).isEqualTo("Hello, John");
    }

    @Test
    void greeting_withValidName_returnsUpperCaseGreeting() {
        // GIVEN
        Mockito.when(service.isEven(6)).thenReturn(true);
        // WHEN
        String greeting = client.greeting("Jane");
        // THEN
        assertThat(greeting).isEqualTo("HELLO, JANE");
    }

    @Test
    void greeting_withNullName_throwsIllegalArgumentException() {
        // GIVEN
        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting(null)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void greeting_withEmptyName_throwsIllegalArgumentException() {
        // GIVEN
        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting("")).isInstanceOf(IllegalArgumentException.class);
    }
}
