package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
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
    public void testHighComplexityMethod_WhenAIsZeroAndBAndCArePositive_ThenPrintStatements() {
        Service service = spy(new Service());
        service.highComplexityMethod(0, 1, 1);
        verify(service, times(3)).print(anyString());
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeAndBAndCAreNonPositive_ThenPrintStatements() {
        Service service = spy(new Service());
        service.highComplexityMethod(-1, -1, -1);
        verify(service, times(3)).print(anyString());
    }
}