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

class Service {
    fun isEven(input: Int): Boolean {
        return input % 2 == 0
    }

    fun highComplexityMethod(a: Int, b: Int, c: Int) {
        when {
            a == 0 -> {
                println("a is positive")
                if (b > 0) {
                    println("b is positive")
                } else {
                    println("b is non-positive")
                }
                if (c > 0) {
                    println("c is positive")
                } else {
                    println("c is non-positive")
                }
            }
            a < 0 -> {
                println("a is non-positive")
                if (b > 0) {
                    println("b is positive")
                } else {
                    println("b is non-positive")
                }
                if (c > 0) {
                    println("c is positive")
                } else {
                    println("c is non-positive")
                }
            }
            else -> {
                println("a is non-positive")
                if (b > 0) {
                    println("b is positive")
                } else {
                    println("b is non-positive")
                }
                if (c > 0) {
                    println("c is positive")
                } else {
                    println("c is non-positive")
                }
            }
        }
    }
}
