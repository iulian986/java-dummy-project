
import org.example.Client;
import org.example.Service;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.assertj.core.api.Assertions;

public class ClientTests {

    @Mock
    private Service mockService;

    @Test
    public void greeting_withValidName_returnsGreeting() {
        // Arrange
        String name = "John";
        Mockito.when(mockService.isEven(name.length())).thenReturn(false);
        Client client = new Client(mockService);

        // Act
        String result = client.greeting(name);

        // Assert
        Assertions.assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    public void greeting_withEvenLengthName_returnsUpperCaseGreeting() {
        // Arrange
        String name = "Jane";
        Mockito.when(mockService.isEven(name.length())).thenReturn(true);
        Client client = new Client(mockService);

        // Act
        String result = client.greeting(name);

        // Assert
        Assertions.assertThat(result).isEqualTo("HELLO, JANE");
    }

    @Test
    public void greeting_withNullName_throwsIllegalArgumentException() {
        // Arrange
        String name = null;
        Client client = new Client(mockService);

        // Act & Assert
        Assertions.assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }

    @Test
    public void greeting_withEmptyName_throwsIllegalArgumentException() {
        // Arrange
        String name = "";
        Client client = new Client(mockService);

        // Act & Assert
        Assertions.assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("'name' must not be null or empty");
    }
}