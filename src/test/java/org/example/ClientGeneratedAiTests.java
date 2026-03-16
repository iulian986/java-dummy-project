package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org. junit. jupiter. api. Assertions. assertEquals;
import org. junit. jupiter. api. Test;

public class ClientGeneratedAiTests {

    @Test
    public void testGreeting() {
        Client client = new Client( new Service()); // Corrected line
        String result = client. greeting("Alice");
        assertEquals("Hello, Alice!", result);
    }
}
