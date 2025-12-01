package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

    package org.example;
    import static org.assertj.core.api.Assertions.*;
    import org.junit.jupiter.api.*;
    import org.mockito.Mock;
    import static org.mockito.Mockito.mock;
    import org.example.*;

    public class ClientGeneratedAiTests {
        private Service service;
        private Client client;

        @BeforeEach
        void setUp() {
            service = mock(Service.class);
            client = new Client(service);
        }

        // Test for greeting method with even length name
        @Test
        void testGreeting_EvenLengthName() {
            // GIVEN
            String name = "John";
            when(service.isEven(name.length())).thenReturn(true);

            // WHEN
            String result = client.greeting(name);

            // THEN
            assertThat(result).isEqualTo("HELLO, JOHN");
        }

        // Test for greeting method with odd length name
        @Test
        void testGreeting_OddLengthName() {
            // GIVEN
            String name = "Jane";
            when(service.isEven(name.length())).thenReturn(false);

            // WHEN
            String result = client.greeting(name);

            // THEN
            assertThat(result).isEqualTo("Hello, Jane");
        }

        // Test for greeting method with null name
        @Test
        void testGreeting_NullName() {
            // GIVEN
            String name = null;

            // WHEN & THEN
            assertThatThrownBy(() -> client.greeting(name))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("'name' must not be null or empty");
        }

        // Test for greeting method with empty name
        @Test
        void testGreeting_EmptyName() {
            // GIVEN
            String name = "";

            // WHEN & THEN
            assertThatThrownBy(() -> client.greeting(name))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("'name' must not be null or empty");
        }
    }
