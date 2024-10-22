package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ServiceTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        assertThat(service.isEven(2)).isTrue();
        assertThat(service.isEven(3)).isFalse();
    }

    @Test
    void testHighComplexityMethod_aPositive() {
        service.highComplexityMethod(1, 1, 1);
        // Assertions for expected output
    }

    @Test
    void testHighComplexityMethod_aNonPositive() {
        service.highComplexityMethod(-1, 1, 1);
        // Assertions for expected output
    }
}
