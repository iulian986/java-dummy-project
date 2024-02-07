package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven_WhenInputIsEven_ThenReturnTrue() {
        Service service = new Service();
        int input = 4;
        boolean result = service.isEven(input);
        assertTrue(result);
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ThenReturnFalse() {
        Service service = new Service();
        int input = 5;
        boolean result = service.isEven(input);
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsPositiveAndBIsPositiveAndCIsPositive_ThenPrintStatements() {
        Service service = new Service();
        service.highComplexityMethod(1, 2, 3);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeAndBIsNonPositiveAndCIsNonPositive_ThenPrintStatements() {
        Service service = new Service();
        service.highComplexityMethod(-1, 0, -1);
    }
}