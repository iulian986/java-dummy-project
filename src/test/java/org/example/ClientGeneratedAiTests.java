package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientGeneratedAiTests {

    private Client client;

    @Mock
    private Service service;

    @BeforeEach
    void setUp() {
        client = new Client(service);
    }

    @Test
    public void greeting_whenNameIsNull_throwsIllegalArgumentException() {
        // GIVEN a null name
        String name = null;

        // WHEN calling the greeting method with a null name
        // THEN an IllegalArgumentException is thrown
        assertThatThrownBy(() -> client.greeting(name))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_whenNameIsBlank_throwsIllegalArgumentException() {
        // GIVEN a blank name
        String name = "";

        // WHEN calling the greeting method with a blank name
        // THEN an IllegalArgumentException is thrown
        assertThatThrownBy(() -> client.greeting(name))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_whenNameLengthIsEven_returnsUppercaseGreeting() {
        // GIVEN a name with an even length and service indicating the length is even
        String name = "John";
        when(service.isEven(name.length())).thenReturn(true);

        // WHEN calling the greeting method
        String result = client.greeting(name);

        // THEN the returned greeting should be in uppercase
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void greeting_whenNameLengthIsOdd_returnsNormalGreeting() {
        // GIVEN a name with an odd length and service indicating the length is odd
        String name = "Jane";
        when(service.isEven(name.length())).thenReturn(false);

        // WHEN calling the greeting method
        String result = client.greeting(name);

        // THEN the returned greeting should be in normal case
        assertThat(result).isEqualTo("Hello, Jane");
    }
}
