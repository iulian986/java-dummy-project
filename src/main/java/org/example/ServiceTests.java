package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTests {

    @Test
    public void testIsEven_WhenInputIsEven_ThenReturnTrue() {
        Service service = new Service();
        boolean result = service.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ThenReturnFalse() {
        Service service = new Service();
        boolean result = service.isEven(5);
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsZeroAndBIsPositiveAndCIsPositive_ThenPrintStatements() {
        Service service = new Service();
        service.highComplexityMethod(0, 2, 3);
        // Verify the expected print statements using Mockito
        verify(System.out, times(1)).println("a is positive");
        verify(System.out, times(1)).println("b is positive");
        verify(System.out, times(1)).println("c is positive");
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeAndBIsNonPositiveAndCIsNonPositive_ThenPrintStatements() {
        Service service = new Service();
        service.highComplexityMethod(-1, -2, -3);
        // Verify the expected print statements using Mockito
        verify(System.out, times(1)).println("a is non-positive");
        verify(System.out, times(1)).println("b is non-positive");
        verify(System.out, times(1)).println("c is non-positive");
    }
}