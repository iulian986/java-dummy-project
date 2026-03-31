package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @Test
    public void greeting_validName_returnsFormattedGreeting() {
        // GIVEN: A valid name is provided
        String name = "Alice";
        Client client = new Client(service);

        // WHEN: The greeting method is called with the name
        String result = client.greeting(name);

        // THEN: The greeting method returns the formatted greeting in uppercase
        Assertions.assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void greeting_nullName_throwsIllegalArgumentException() {
        // GIVEN: A null name is provided
        Client client = new Client(service);

        // WHEN: The greeting method is called with a null name
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }

    @Test
    public void greeting_emptyName_throwsIllegalArgumentException() {
        // GIVEN: An empty string is provided as the name
        Client client = new Client(service);

        // WHEN: The greeting method is called with an empty string
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }

    @Test
    public void greeting_evenLengthName_returnsToUpperCasedGreeting() {
        // GIVEN: A name with an even length
        String name = "Alice";
        Client client = new Client(service);

        // WHEN: The greeting method is called with the name
        String result = client.greeting(name);

        // THEN: The greeting method returns the formatted greeting in uppercase
        Assertions.assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void greeting_oddLengthName_returnsFormattedGreeting() {
        // GIVEN: A name with an odd length
        String name = "Bob";
        Client client = new Client(service);

        // WHEN: The greeting method is called with the name
        String result = client.greeting(name);

        // THEN: The greeting method returns the formatted greeting in lowercase
        Assertions.assertThat(result).isEqualTo("Hello, Bob");
    }
}
