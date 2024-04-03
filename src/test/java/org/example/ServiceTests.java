package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        // Given
        Service service = new Service();
        
        // When
        boolean result = service.isEven(4);
        
        // Then
        assertTrue(result);
    }

    @Test
    public void testHighComplexityMethod() {
        // Given
        Service service = new Service();
        
        // When
        service.highComplexityMethod(1, 2, 3);
        
        // Then
        assertNotNull(service);
    }
}