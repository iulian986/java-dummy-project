package org.example;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

public class ServiceGeneratedAiTests {

    @Test
    void testIsEven() {
        assertThat(new Service().isEven(2)).isTrue();
        assertThat(new Service().isEven(3)).isFalse();
        assertThat(new Service().isEven(-4)).isFalse();
    }

    @Test
    void testHighComplexityMethod() {
        Service service = new Service();
        service.highComplexityMethod(1, 2, 3);
        service.highComplexityMethod(0, 2, 3);
        service.highComplexityMethod(-1, 2, 3);
        service.highComplexityMethod(1, 0, 3);
        service.highComplexityMethod(1, 0, -1);
    }
}