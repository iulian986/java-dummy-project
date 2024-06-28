package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

public class ServiceTests {

    @ExtendWith(MockitoExtension.class)
    @Test
    void testIsEven() {
        Service service = new Service();
        boolean result = service.isEven(4);
        assertThat(result).isTrue();
    }

    @Test
    void testHighComplexityMethod_A_Positive_B_Positive_C_Positive() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(1, 2, 3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(1, 2, 3);
    }

    @Test
    void testHighComplexityMethod_A_Negative_B_Positive_C_Positive() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(-1, 2, 3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(-1, 2, 3);
    }

    @Test
    void testHighComplexityMethod_A_Negative_B_Negative_C_Positive() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(-1, -2, 3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(-1, -2, 3);
    }

    @Test
    void testHighComplexityMethod_A_Negative_B_Positive_C_Negative() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(-1, 2, -3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(-1, 2, -3);
    }

    @Test
    void testHighComplexityMethod_A_Negative_B_Negative_C_Negative() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(-1, -2, -3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(-1, -2, -3);
    }

    @Test
    void testHighComplexityMethod_A_Positive_B_Negative_C_Negative() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(1, -2, -3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(1, -2, -3);
    }

    @Test
    void testHighComplexityMethod_A_Positive_B_Negative_C_Positive() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(1, -2, 3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(1, -2, 3);
    }

    @Test
    void testHighComplexityMethod_A_Positive_B_Positive_C_Negative() {
        Service service = Mockito.spy(new Service());
        service.highComplexityMethod(1, 2, -3);
        Mockito.verify(service, Mockito.times(1)).highComplexityMethod(1, 2, -3);
    }

}
