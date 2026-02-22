package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



class ClientGeneratedAiTests {

    private Service service;
    private Client client;

    @BeforeEach
    void setUp() {
        service = Mockito.mock(Service.class);
        client = new Client(service);
    }

    @Test
    void greeting_withValidName_returnsGreetingInUpperCaseIfLengthIsEven() {
        // GIVEN
        Mockito.when(service.isEven(4)).thenReturn(true);
        // WHEN
        String greeting = client.greeting("John");
        // THEN
        assertThat(greeting).isEqualTo("HELLO, JOHN");
    }

    @Test
    void greeting_withValidName_returnsGreetingInLowerCaseIfLengthIsOdd() {
        // GIVEN
        Mockito.when(service.isEven(5)).thenReturn(false);
        // WHEN
        String greeting = client.greeting("Jane");
        // THEN
        assertThat(greeting).isEqualTo("Hello, Jane");
    }

    @Test
    void greeting_withNullName_throwsIllegalArgumentException() {
        // GIVEN
        // WHEN
        Exception exception =  assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
        // THEN
        assertThat(exception).hasMessage("name must not be null or empty");
    }

    @Test
    void greeting_withEmptyName_throwsIllegalArgumentException() {
        // GIVEN
        // WHEN
        Exception exception =  assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
        // THEN
        assertThat(exception).hasMessage("name must not be null or empty");
    }



}
