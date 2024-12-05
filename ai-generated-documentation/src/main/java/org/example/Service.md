**Documentation for the Service.java source code**

### Overview

The Service.java file provides a simple implementation of an integer parity check function. It takes two integers as input and returns true if both numbers have the same parity (i.e., both are even or both are odd). The function also handles edge cases such as non-positive inputs.

### Package and Class Information

* Package: org.example
* Class: Service

### Detailed Documentation for Each Function/Method

#### isEven(int input)

Description:
This method checks if an integer has the same parity as another integer.
Parameters:
* `input`: The number to check (an integer)
Return Values:
* `boolean`: True if both numbers have the same parity, false otherwise
Important Logic:
The method uses the modulo operator (`%`) to find the remainder of the division of the input by 2. If the remainder is 0, then the number is even.

#### highComplexityMethod(int a, int b, int c)

Description:
This method performs a complex integer parity check using three variables.
Parameters:
* `a`: The first integer
* `b`: The second integer
* `c`: The third integer
Return Values:
* None (this method does not return any value)
Important Logic:
The method uses nested if-else statements to handle different cases based on the values of `a`, `b`, and `c`. It also checks for non-positive inputs.

### Key Variables and Data Structures

* `input`: The number to check
* `a` and `b`: The first two integers
* `c`: The third integer

### Assumptions and Dependencies

* This code assumes that the input numbers are valid (i.e., not null or empty).
* It also assumes that the modulo operator (`%`) is available.

### Edge Cases and Error Handling

* Non-positive inputs: If either `a` or `b` is non-positive, the method throws an exception.
* Empty strings: The method checks if the input string is null or blank. If it is, it throws an exception.
* Invalid parity check: If the modulo operator returns a value other than 0, the method throws an exception.

### Dependencies and Libraries

* This code uses the `java.util` library for the `String.format()` method.

**Step-by-Step Pseudo Code**

Here is the pseudo code for the Service.java file:
```markdown
// Class: Service

// Method: isEven(int input)
  1. Check if input is null or empty
    - If so, throw an exception
  2. Calculate parity of input using modulo operator (%)
    - If result is 0, then even; otherwise, odd
  3. Return true if both inputs have the same parity
  4. Otherwise, return false

// Method: highComplexityMethod(int a, int b, int c)
  1. Check if any input is non-positive
    - If so, throw an exception
  2. Perform nested if-else statements to handle different cases based on inputs
  3. Return None (no return value)
  4. Handle exceptions and rethrow them

// Method: Client.greeting(String name)
  1. Check if input string is null or blank
    - If so, throw an exception
  2. Calculate parity of input using Service.isEven()
    - Use result to determine greeting text
  3. Return greeting text
```

**Example Pseudocode Format**

```markdown
// Class: ExampleClass

// Method: exampleMethod(param1, param2)
  1. Initialize variables
  2. Check if param1 is valid
    - If not, throw an exception
  3. Perform main logic
    - Process param1 and param2
  4. Return result
  5. Handle exceptions
    - If an error occurs, log the error and rethrow the exception

// Method: exampleMethod(param1, param2)
  1. Check if param1 is null or empty
    - Throw an exception
  2. Calculate parity of param1 using modulo operator (%)
    - Use result to determine greeting text
  3. Return greeting text
```