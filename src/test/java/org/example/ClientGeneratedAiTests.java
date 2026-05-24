package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;

To address the requirements, we need to ensure that the `Client` class is correctly implemented with proper handling of edge cases and exceptions. Additionally, we should add a simple test case to verify that the method works as expected.

Here's the updated code:

```java
package org.example;

public class Client {
    private final Service service;

    public Client(Service service) {
        this.service = service;
    }

    public String greeting(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("'name' must not be null or empty");
        }

        boolean even = service.isEven(name.length());
        String greeting = "Hello, %s".formatted(name);
        return even ? greeting.toUpperCase() : greeting;
    }
}
