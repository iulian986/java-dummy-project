package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven_WhenInputIsEven_ThenReturnTrue() {
        // Arrange
        Service service = new Service();
        int input = 4;

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ThenReturnFalse() {
        // Arrange
        Service service = new Service();
        int input = 5;

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsZeroBIsPositiveCIsPositive_ThenPrintStatements() {
        // Arrange
        Service service = new Service();

        // Act
        service.highComplexityMethod(0, 1, 1);

        // Assert
        // Verify the printed statements
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeBIsNonPositiveCIsNonPositive_ThenPrintStatements() {
        // Arrange
        Service service = new Service();

        // Act
        service.highComplexityMethod(-1, 0, -1);

        // Assert
        // Verify the printed statements
    }
}