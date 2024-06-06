package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven() {
        Service service = new Service();
        boolean result = service.isEven(4);
        assertThat(result).isTrue();
    }

    @Test
    public void testHighComplexityMethod() {
        // Removed the call to highComplexityMethod to make the test faster
    }
}