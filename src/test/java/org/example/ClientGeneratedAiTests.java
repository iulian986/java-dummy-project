package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClientGeneratedAiTests {

    @Test
    void testGreeting_ValidName() {
        Service serviceMock = new Service();
        Client client = new Client(serviceMock);
        String greeting = client.greeting("John");
        assertThat(greeting).isEqualTo("Hello, John");
    }

    @Test
    void testGreeting_EvenLengthName() {
        Service serviceMock = new Service();
        Client client = new Client(serviceMock);
        String greeting = client.greeting("Alice");
        assertThat(greeting).isEqualTo("HELLO, ALICE");
    }

    @Test
    void testGreeting_NullName() {
        Service serviceMock = new Service();
        Client client = new Client(serviceMock);
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }

    @Test
    void testGreeting_EmptyName() {
        Service serviceMock = new Service();
        Client client = new Client(serviceMock);
        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }
}
