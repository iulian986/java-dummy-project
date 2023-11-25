
package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Mock
    private Service service;

    @Test
    public void testIsEven_WhenInputIsEven_ReturnsTrue() {
        // Arrange
        int input = 4;
        when(service.isEven(input)).thenReturn(true);

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ReturnsFalse() {
        // Arrange
        int input = 5;
        when(service.isEven(input)).thenReturn(false);

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertThat(result).isFalse();
    }
}
