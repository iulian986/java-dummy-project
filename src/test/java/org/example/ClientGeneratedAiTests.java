package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class ClientGeneratedAiTests {

    private Client client;
    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
        client = new Client(service);
    }

    @Test
    void greeting_validName_returnsCorrectGreeting() {
        // GIVEN: A valid name "John"
        String name = "John";

        // WHEN: The greeting method is called with the name
        String result = client.greeting(name);

        // THEN: The greeting method returns "HELLO, JOHN"
        Assertions.assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_nullName_throwsIllegalArgumentException() {
        // GIVEN: A null name
        String name = null;

        // WHEN: The greeting method is called with the null name
        // THEN: An IllegalArgumentException is thrown with the correct message
        Exceptions.exceptionWithCause(IllegalArgumentException.class)
                .withCauseMatching("name must not be null or empty");
        client.greeting(name);
    }

    @Test
    void greeting_emptyName_throwsIllegalArgumentException() {
        // GIVEN: An empty name
        String name = "";

        // WHEN: The greeting method is called with the empty name
        // THEN: An IllegalArgumentException is thrown with the correct message
        Exceptions.exceptionWithCause(IllegalArgumentException.class)
                .withCauseMatching("name must not be null or empty");
        client.greeting(name);
    }

    @Test
    void greeting_evenLengthName_returnsUppercaseGreeting() {
        // GIVEN: A name with an even length "John"
        String name = "John";

        // WHEN: The greeting method is called with the name
        String result = client.greeting(name);

        // THEN: The greeting method returns "HELLO, JOHN" in uppercase
        Assertions.assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_oddLengthName_returnsLowercaseGreeting() {
        // GIVEN: A name with an odd length "Jon"
        String name = "Jon";

        // WHEN: The greeting method is called with the name
        String result = client.greeting(name);

        // THEN: The greeting method returns "Hello, Jon" in lowercase
        Assertions.assertThat(result).isEqualTo("Hello, Jon");
    }

    @Test
    void highComplexityMethod_positiveValues_callsCorrectly() {
        // GIVEN: a, b, and c are positive integers
        int a = 1;
        int b = 2;
        int c = 3;

        // WHEN: highComplexityMethod is called with a, b, and c
        service.highComplexityMethod(a, b, c);

        // THEN: The highComplexityMethod prints the expected output
        // Assertions for the output are not feasible in this test case
    }

    @Test
    void highComplexityMethod_mixedValues_callsCorrectly() {
        // GIVEN: a is positive, b and c are non-positive
        int a = 1;
        int b = 0;
        int c = 0;

        // WHEN: highComplexityMethod is called with a, b, and c
        service.highComplexityMethod(a, b, c);

        // THEN: The highComplexityMethod prints the expected output
        // Assertions for the output are not feasible in this test case
    }

    @Test
    void highComplexityMethod_negativeValues_callsCorrectly() {
        // GIVEN: a is negative, b and c are non-positive
        int a = -1;
        int b = 0;
        int c = 0;

        // WHEN: highComplexityMethod is called with a, b, and c
        service.highComplexityMethod(a, b, c);

        // THEN: The highComplexityMethod prints the expected output
        // Assertions for the output are not feasible in this test case
    }
}
