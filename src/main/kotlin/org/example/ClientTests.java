package org.example

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;

class Client(private val service: Service) {

    fun greeting(name: String): String {
        require(!name.isNullOrBlank()) { "'name' must not be null or empty" }

        val even = service.isEven(name.length)
        val greeting = "Hello, $name"
        return if (even) {
            greeting.toUpperCase()
        } else {
            greeting
        }
    }
}
