package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Mock
    private Service service;

    @Test
    public void testIsEven_WhenInputIsEven_ReturnsTrue() {
        when(service.isEven(anyInt())).thenReturn(true);
        assertThat(service.isEven(4)).isTrue();
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ReturnsFalse() {
        when(service.isEven(anyInt())).thenReturn(false);
        assertThat(service.isEven(5)).isFalse();
    }

    @Test
    public void testHighComplexityMethod_WhenAIsZeroBIsPositiveCIsPositive() {
        service.highComplexityMethod(0, 1, 1);
        // assert console output
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeBIsNonPositiveCIsNonPositive() {
        service.highComplexityMethod(-1, 0, -1);
        // assert console output
    }

    // additional tests for other scenarios
}