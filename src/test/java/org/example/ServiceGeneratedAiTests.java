package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

The error was due to the use of static imports in the test class. In Java, static imports are not allowed inside loops (like for-each) or methods. Here's how you can fix it:

1. Move the static imports outside of the test class.
2. If you still want to use them inside the test class, remove the loops and use the static imports directly in the test methods.

In this case, the static imports were not used inside any methods or loops, so they could be moved outside the class. However, if they were used inside a method or loop, they would need to be moved outside of that method or loop.
