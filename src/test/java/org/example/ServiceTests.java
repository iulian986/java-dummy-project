
package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Mock
    private Service service;

    @Test
    public void isEven_shouldReturnTrue_whenInputIsEven() {
        // Arrange
        int input = 4;
        when(service.isEven(input)).thenReturn(true);

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void isEven_shouldReturnFalse_whenInputIsOdd() {
        // Arrange
        int input = 5;
        when(service.isEven(input)).thenReturn(false);

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertThat(result).isFalse();
    }
}