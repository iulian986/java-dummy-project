package org.example;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

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
        service = new Service();
    }

    @Test
    public void greeting_validName_returnsFormattedGreeting() {
        // GIVEN: A valid name "John"
        String name = "John";
        // WHEN: The client calls the greeting method with the name
        Client client = new Client(service);
        String result = client.greeting(name);
        // THEN: The greeting method returns "HELLO, JOHN"
        assertThat(result).isEqualTo("HELLO, John");
    }

    @Test
    public void greeting_nullName_throwsIllegalArgumentException() {
        // GIVEN: A null name
        String name = null;
        // WHEN: The client calls the greeting method with the null name
        Client client = new Client(service);
        // THEN: An IllegalArgumentException is thrown with the correct message
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Name cannot be null");
    }

    @Test
    public void greeting_emptyName_throwsIllegalArgumentException() {
        // GIVEN: An empty name
        String name = "";
        // WHEN: The client calls the greeting method with the empty name
        Client client = new Client(service);
        // THEN: An IllegalArgumentException is thrown with the correct message
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Name cannot be null");
    }

    @Test
    public void greeting_evenLengthName_returnsToUpperCaseGreeting() {
        // GIVEN: A name with an even length "John"
        String name = "John";
        // WHEN: The client calls the greeting method with the name
        Client client = new Client(service);
        String result = client.greeting(name);
        // THEN: The greeting method returns "HELLO, JOHN" in uppercase
        assertThat(result).isEqualTo("HELLO, John");
    }

    @Test
    public void greeting_oddLengthName_returnsLowercaseGreeting() {
        // GIVEN: A name with an odd length "Jon"
        String name = "Jon";
        // WHEN: The client calls the greeting method with the name
        Client client = new Client(service);
        String result = client.greeting(name);
        // THEN: The greeting method returns "Hello, Jon" in lowercase
        assertThat(result).isEqualTo("Hello, Jon");
    }

    @Test
    public void highComplexityMethod_positiveValues_callsMethodWithValues() {
        // GIVEN: a, b, and c are positive values
        int a = 1;
        int b = 2;
        int c = 3;
        // WHEN: The client calls the highComplexityMethod with a, b, and c
        Client client = new Client(service);
        client.highComplexityMethod(a, b, c);
        // THEN: The highComplexityMethod is called with a, b, and c
        Mockito.verify(service).highComplexityMethod(a, b, c);
    }

    @Test
    public void highComplexityMethod_mixedValues_callsMethodWithValues() {
        // GIVEN: a is positive, b and c are non-positive
        int a = 1;
        int b = 0;
        int c = 0;
        // WHEN: The client calls the highComplexityMethod with a, b, and c
        Client client = new Client(service);
        client.highComplexityMethod(a, b, c);
        // THEN: The highComplexityMethod is called with a, b, and c
        Mockito.verify(service).highComplexityMethod(a, b, c);
    }

    @Test
    public void highComplexityMethod_allNonPositiveValues_callsMethodWithValues() {
        // GIVEN: a, b, and c are non-positive values
        int a = 0;
        int b = 0;
        int c = 0;
        // WHEN: The client calls the highComplexityMethod with a, b, and c
        Client client = new Client(service);
        client.highComplexityMethod(a, b, c);
        // THEN: The highComplexityMethod is called with a, b, and c
        Mockito.verify(service).highComplexityMethod(a, b, c);
    }
}
