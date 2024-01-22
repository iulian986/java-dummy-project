package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTests {

    @Test
    public void testIsEven_WhenInputIsEven_ReturnsTrue() {
        Service service = new Service();
        boolean result = service.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ReturnsFalse() {
        Service service = new Service();
        boolean result = service.isEven(5);
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsZeroBIsPositiveCIsPositive_PrintsCorrectMessage() {
        Service service = spy(new Service());
        service.highComplexityMethod(0, 1, 1);
        verify(service).highComplexityMethod(0, 1, 1);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeBIsNonPositiveCIsNonPositive_PrintsCorrectMessage() {
        Service service = spy(new Service());
        service.highComplexityMethod(-1, 0, -1);
        verify(service).highComplexityMethod(-1, 0, -1);
    }
}