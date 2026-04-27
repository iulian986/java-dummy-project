package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org. junit. jupiter. api. Assertions. assertEquals;
import static org. mockito. Mockito. when;

import org. junit. jupiter. api. BeforeEach;
import org. junit. jupiter. api. Test;
import org. junit. jupiter. api. extension. ExtendWith;
import org. mockito. InjectMocks;
import org. mockito. Mock;
import org. mockito. junit. jupiter. MockitoExtension;

@ExtendWith( MockitoExtension. class)
public class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @BeforeEach
    public void setUp() {
        // No need to open mocks, as MockitoExtension will handle it
    }

    @Test
    public void testGreeting() {
        // Arrange
        when( service. greet()).thenReturn( "Hello, World!");

        // Act
        String result = client. greet();

        // Assert
        assertEquals( "Hello, World!", result);
    }

    @Test
    public void testGreetingWithEmptyString() {
        // Arrange
        when( service. greet()).thenReturn( "");

        // Act
        String result = client. greet();

        // Assert
        assertEquals( "", result);
    }

    @Test
    public void testGreetingWithNull() {
        // Arrange
        when( service. greet()).thenReturn( null);

        // Act
        String result = client. greet();

        // Assert
        assertEquals( null, result);
    }
}
