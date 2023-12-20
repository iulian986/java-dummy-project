package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @InjectMocks
    private Service service;

    @Test
    public void testIsEven_WhenInputIsEven_ThenReturnTrue() {
        // Arrange
        int input = 4;

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ThenReturnFalse() {
        // Arrange
        int input = 5;

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertThat(result).isFalse();
    }
}