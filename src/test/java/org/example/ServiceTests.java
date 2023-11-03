
package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.assertj.core.api.Assertions;

public class ServiceTests {

    @Mock
    private Service service;

    @Test
    public void isEven_withEvenInput_returnsTrue() {
        // Arrange
        int input = 4;
        Mockito.when(service.isEven(input)).thenReturn(true);

        // Act
        boolean result = service.isEven(input);

        // Assert
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void isEven_withOddInput_returnsFalse() {
        // Arrange
        int input = 5;
        Mockito.when(service.isEven(input)).thenReturn(false);

        // Act
        boolean result = service.isEven(input);

        // Assert
        Assertions.assertThat(result).isFalse();
    }
}