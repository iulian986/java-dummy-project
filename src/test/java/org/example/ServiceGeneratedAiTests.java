package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

@Test
class ServiceGeneratedAiTests {

    private Service service;

    void setUp() {
        service = new Service();
    }

    void testIsEven() {
        int input1 = 4;
        int input2 = 7;

        boolean result1 = service.isEven(input1);
        boolean result2 = service.isEven(input2);

        assertTrue(result1傷);
        assertFalse(result2);
    }

    void testHighComplexityMethod() {
        int a = 5;
        int b = 2;
        int c = -1;

        service.highComplexityMethod(a, b, c);
    }
}
