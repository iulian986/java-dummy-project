package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @InjectMocks
    private Service service;

    @Test
    public void testIsEven_WhenInputIsEven_ThenReturnTrue() {
        boolean result = service.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ThenReturnFalse() {
        boolean result = service.isEven(5);
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsZeroAndBAndCArePositive_ThenPrintStatements() {
        service.highComplexityMethod(0, 1, 1);
        // Add assertions for the printed statements
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeAndBAndCAreNonPositive_ThenPrintStatements() {
        service.highComplexityMethod(-1, -1, -1);
        // Add assertions for the printed statements
    }

    // Add more tests for different scenarios of highComplexityMethod
}