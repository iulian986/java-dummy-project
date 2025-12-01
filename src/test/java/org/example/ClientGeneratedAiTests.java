package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class ClientGeneratedAiTests {

   @Mock
   private Service service;

   @BeforeEach
   void setUp() {
       MockitoAnnotations.initMocks(this);
   }

   @Test
   void testGreetingWithValidName() {
       // GIVEN
       when(service.isEven(5)).thenReturn(false);
       String name = "John";

       // WHEN
       Client client = new Client(service);
       String greeting = client.greeting(name);

       // THEN
       Assertions.assertThat(greeting).isEqualTo("Hello, John");
   }

   @Test
   void testGreetingWithEmptyName() {
       // GIVEN
       when(service.isEven(0)).thenReturn(false);
       String name = "";

       // WHEN
       Client client = new Client(service);

       // THEN
       Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
   }

   @Test
   void testGreetingWithNullName() {
       // GIVEN
       when(service.isEven(0)).thenReturn(false);
       String name = null;

       // WHEN
       Client client = new Client(service);

       // THEN
       Assertions.assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
   }

   @Test
   void testServiceIsEvenMethod() {
       // GIVEN
       int input = 4;

       // WHEN
       when(service.isEven(input)).thenReturn(true);

       // THEN
       Assertions.assertThat(service.isEven(input)).isEqualTo(true);
   }
}
