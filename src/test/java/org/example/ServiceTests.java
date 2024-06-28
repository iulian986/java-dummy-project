package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ServiceTests {

    @Test
    public void testIsEven() {
        // Test even number
        assertThat(new Service().isEven(4)).isTrue();

        // Test odd number
        assertThat(new Service().isEven(3)).isFalse();
    }

    @Test
    public void testHighComplexityMethod() {
        // Test when a is positive and b, c are also positive
        new Service().highComplexityMethod(1, 2, 3);
        
        // Test when a is negative but b is positive and c is also positive
        new Service().highComplexityMethod(-1, 2, 3);
        
        // Test when a is non-positive (negative or zero) but b is positive and c is also positive
        new Service().highComplexityMethod(0, 2, 3);
        
        // Test when a is negative and b is non-positive (zero or negative)
        new Service().highComplexityMethod(-1, -2, 3);
        
        // Test when a is non-positive but b is positive and c is also positive
        new Service().highComplexityMethod(0, 2, 3);
        
        // Test when a is negative and b is non-positive (zero or negative)
        new Service().highComplexityMethod(-1, -2, 3);
    }
}
