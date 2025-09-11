package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

    @Test
    void greeting_WithValidNameAndEvenLength_ReturnsGreetingInUpperCase() {
        // GIVEN
        Mockito.when(mockService.isEven(6)).thenReturn(true);
        // WHEN
        String greeting = client.greeting("Peter");
        // THEN
        assertThat(greeting).isEqualTo("Hello, Peter"); 
    }
