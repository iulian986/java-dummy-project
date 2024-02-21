import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @InjectMocks
    private org.example.Client client;

    @Mock
    private org.example.Service service;

    @Test
    public void testGreetingWithEvenLengthName() {
        // Arrange
        String name = "John";
        when(service.isEven(name.length())).thenReturn(true);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void testGreetingWithOddLengthName() {
        // Arrange
        String name = "Jane";
        when(service.isEven(name.length())).thenReturn(false);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("Hello, Jane");
    }

    @Test
    public void testGreetingWithNullName() {
        // Arrange
        String name = null;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    public void testGreetingWithEmptyName() {
        // Arrange
        String name = "";

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }
}