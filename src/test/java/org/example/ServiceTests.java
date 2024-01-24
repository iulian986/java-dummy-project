import org.example.Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
    public void testHighComplexityMethod_WhenAIsZeroAndBIsPositiveAndCIsPositive_ThenPrintStatements() {
        Service service = new Service();
        service.highComplexityMethod(0, 2, 3);
        // Verify the expected print statements
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeAndBIsNonPositiveAndCIsPositive_ThenPrintStatements() {
        Service service = new Service();
        service.highComplexityMethod(-1, -2, 3);
        // Verify the expected print statements
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNonPositiveAndBIsPositiveAndCIsNonPositive_ThenPrintStatements() {
        Service service = new Service();
        service.highComplexityMethod(-3, 4, -5);
        // Verify the expected print statements
    }
}