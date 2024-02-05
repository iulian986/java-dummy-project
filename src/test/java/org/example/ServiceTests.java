package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

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
        // Mocking System.out.println() method
        System.setOut(mock(java.io.PrintStream.class));
        
        service.highComplexityMethod(1, 2, 3);
        verify(System.out, times(3)).println(anyString());
    }
}