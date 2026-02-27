package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
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
    void greeting_withValidNameAndEvenLength_returnsUppercaseGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(4)).thenReturn(true);
        // WHEN
        String greeting = client.greeting("John");
        // THEN
        assertEquals("HELLO, JOHN", greeting);
    }

    @Test
    void greeting_withValidNameAndOddLength_returnsNormalGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        // WHEN
        String greeting = client.greeting("Jane");
        // THEN
        assertEquals("Hello, Jane", greeting);
    }

    @Test
    void greeting_withNullName_throwsIllegalArgumentException() {
        // GIVEN
        // WHEN
        // THEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }

    @Test
    void greeting_withEmptyName_throwsIllegalArgumentException() {
        // GIVEN
        // WHEN
        // THEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }


}
