package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = Mockito.mock(Service.class);
    }

    @Test
    void isEven_positiveEvenNumber_returnsTrue() {
        // GIVEN: A positive even number
        int input = 4;

        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);

        // THEN: The result should be true
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void isEven_positiveOddNumber_returnsFalse() {
        // GIVEN: A positive odd number
        int input = 5;

        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);

        // THEN: The result should be false
        Assertions.assertThat(result).isFalse();
    }

    @Test
    void isEven_negativeEvenNumber_returnsTrue() {
        // GIVEN: A negative even number
        int input = -4;

        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);

        // THEN: The result should be true
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void isEven_negativeOddNumber_returnsFalse() {
        // GIVEN: A negative odd number
        int input = -5;

        // WHEN: The isEven method is called with the input
        boolean result = service.isEven(input);

        // THEN: The result should be false
        Assertions.assertThat(result).isFalse();
    }
}
