import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        org.example.Service service = new org.example.Service();
        boolean result = service.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testHighComplexityMethod() {
        org.example.Service service = new org.example.Service();
        service.highComplexityMethod(1, 2, 3);
        // Add assertions here
    }
}