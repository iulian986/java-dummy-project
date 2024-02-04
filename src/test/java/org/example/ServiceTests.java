package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        Service service = new Service();
        boolean result = service.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testHighComplexityMethod() {
        Service service = new Service();
        // Test case 1
        service.highComplexityMethod(1, 2, 3);
        // Add assertions here
        // Test case 2
        service.highComplexityMethod(-1, -2, -3);
        // Add assertions here
        // Test case 3
        service.highComplexityMethod(0, 0, 0);
        // Add assertions here
    }
}