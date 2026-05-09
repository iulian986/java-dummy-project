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
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@DisplayName("ServiceGeneratedAiTests")
public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_positiveEvenNumber() {
        assertThat(service.isEven(4)).isTrue();
    }

    @Test
    void testIsEven_positiveOddNumber() {
        assertThat(service.isEven(5)).isFalse();
    }

    @Test
    void testIsEven_zero() {
        assertThat(service.isEven(0)).isTrue();
    }

    @Test
    void testHighComplexityMethod_positiveNumbers() {
        service.highComplexityMethod(1, 2, 3);
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("a is positive");
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("b is positive");
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("c is positive");
    }

    @Test
    void testHighComplexityMethod_mixedPositiveAndNonPositive() {
        service.highComplexityMethod(-1, 2, 0);
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("a is non-positive");
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("b is positive");
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("c is positive");
    }

    @Test
    void testHighComplexityMethod_allNonPositive() {
        service.highComplexityMethod(-1, 0, -2);
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("a is non-positive");
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("b is non-positive");
        assertThat(Objects.requireNonNull(System.out.getLast().toString())).isEqualTo("c is non-positive");
    }
}
