package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

**Corrected Code:**

public void highComplexityMethod(int a, int b, int c) {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    if (a > 0) {
        printStream.println("a is positive");
    } else {
        printStream.println("a is non-positive");
    }

    // ... remaining code ...

    System.setOut(printStream);
    service.highComplexityMethod(a, b, c);
    Assertions.assertEquals(expectedOutput, outputStream.toString());
}
