package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void testGreetName() {
        Greeting greeting = new Greeting();
        String result = greeting.greet("John");
        assertEquals("Hello, John!", result);
    }

    @Test
    void testGreetEmptyName() {
        Greeting greeting = new Greeting();
        String result = greeting.greet("");
        assertEquals("Hello, Guest!", result);
    }
}
