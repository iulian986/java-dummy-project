package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Mock
    private SomeDependency someDependency;

    @Test
    void testMethod() {
        // Arrange
        Mockito.when(someDependency.someMethod()).thenReturn("mocked result");

        // Act
        String result = service.methodUnderTest(someDependency);

        // Assert
        assertThat(result).isEqualTo("mocked result");
    }
}
