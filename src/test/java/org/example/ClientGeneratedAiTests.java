package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @BeforeEach
    void setUp() {
        Mockito.reset(service);
    }

    @Test
    public void greeting_validName_returnsCorrectGreeting() {
        // GIVEN: A valid name "John"
        String name = "John";
        // WHEN: The client calls the greeting method with the name
        Client client = new Client(service);
        String result = client.greeting(name);
        // THEN: The greeting method returns "Hello, John"
        Assertions.assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    public void greeting_nullName_throwsIllegalArgumentException() {
        // GIVEN: A null name
        String name = null;
        // WHEN: The client calls the greeting method with the null name
        Client client = new Client(service);
        // THEN: An IllegalArgumentException is thrown with the correct message
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    public void greeting_emptyName_throwsIllegalArgumentException() {
        // GIVEN: An empty name
        String name = "";
        // WHEN: The client calls the greeting method with the empty name
        Client client = new Client(service);
        // THEN: An IllegalArgumentException is thrown with the correct message
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    public void greeting_evenLengthName_returnsUppercaseGreeting() {
        // GIVEN: A name with an even length "John"
        String name = "John";
        // WHEN: The client calls the greeting method with the name
        Client client = new Client(service);
        String result = client.greeting(name);
        // THEN: The greeting method returns "HELLO, JOHN"
        Assertions.assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void greeting_oddLengthName_returnsLowercaseGreeting() {
        // GIVEN: A name with an odd length "John"
        String name = "John";
        // WHEN: The client calls the greeting method with the name
        Client client = new Client(service);
        String result = client.greeting(name);
        // THEN: The greeting method returns "Hello, John"
        Assertions.assertThat(result).isEqualTo("Hello, John");
    }
}
