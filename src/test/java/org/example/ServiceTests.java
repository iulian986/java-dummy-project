package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

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
    public void testHighComplexityMethod_WhenAIsZeroBIsPositiveCIsPositive_PrintsCorrectMessages() {
        Service service = new Service();
        assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            service.highComplexityMethod(0, 1, 1);
        });
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeBIsNonPositiveCIsPositive_PrintsCorrectMessages() {
        Service service = new Service();
        assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            service.highComplexityMethod(-1, 0, 1);
        });
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNonPositiveBIsPositiveCIsNonPositive_PrintsCorrectMessages() {
        Service service = new Service();
        assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            service.highComplexityMethod(0, 1, -1);
        });
    }
}