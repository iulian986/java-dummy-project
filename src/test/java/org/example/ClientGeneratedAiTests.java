package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @Test
    public void greeting_validName_returnsCorrectGreeting() {
        // GIVEN: Setup the test environment
        Client client = new Client(service);
        String name = "Alice";

        // WHEN: Call the greeting method with a valid name
        String result = client.greeting(name);

        // THEN: Assert that the greeting method returns the expected result
        Assertions.assertThat(result).startsWith("Hello, Alice");
    }

    @Test
    public void greeting_nullName_throwsIllegalArgumentException() {
        // GIVEN: Setup the test environment
        Client client = new Client(service);

        // WHEN: Call the greeting method with a null name
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(null));

        // THEN: Assert that an IllegalArgumentException is thrown
    }

    @Test
    public void greeting_emptyName_throwsIllegalArgumentException() {
        // GIVEN: Setup the test environment
        Client client = new Client(service);

        // WHEN: Call the greeting method with an empty name
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(""));

        // THEN: Assert that an IllegalArgumentException is thrown
    }

    @Test
    public void greeting_evenLengthName_returnsUppercaseGreeting() {
        // GIVEN: Setup the test environment
        Client client = new Client(service);
        String name = "Alice";

        // WHEN: Call the greeting method with an even length name
        String result = client.greeting(name);

        // THEN: Assert that the greeting method returns the expected result
        Assertions.assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void greeting_oddLengthName_returnsLowercaseGreeting() {
        // GIVEN: Setup the test environment
        Client client = new Client(service);
        String name = "Bob";

        // WHEN: Call the greeting method with an odd length name
        String result = client.greeting(name);

        // THEN: Assert that the greeting method returns the expected result
        Assertions.assertThat(result).isEqualTo("Hello, Bob");
    }
}
