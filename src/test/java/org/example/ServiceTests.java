package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        Service service = new Service();
        boolean result = service.isEven(3);
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod() {
        Service service = new Service();
        service.highComplexityMethod(1, 2, 3);
        // Add assertions here
    }
}