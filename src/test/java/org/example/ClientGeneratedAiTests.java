package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;




class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setup() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        // WHEN
        String result = client.greeting("John");
        // THEN
        assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    void greeting_ValidNameEvenLength_ReturnsUpperCaseGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(4)).thenReturn(true);
        // WHEN
        String result = client.greeting("John");
        // THEN
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_NullName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting(null)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void greeting_EmptyName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting("")).isInstanceOf(IllegalArgumentException.class);
    }


}
