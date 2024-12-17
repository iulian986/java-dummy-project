## Service.java Documentation

**1. Overview**

The `Service` class provides two functionalities:

- `isEven`: Determines if a given integer is even.
- `highComplexityMethod`:  Analyzes the signs of three integers (a, b, c) and prints a series of messages based on their combinations.

**2. Package/module name:**

`org.example`

**3. Class/file name:**

`Service.java`

**4. Detailed Documentation**

   - **Method `isEven(int input)`**
     - **Description:** Checks if the provided integer `input` is even.
     - **Parameters:**
       - `input`: An integer to be checked.
     - **Return Values:**
       - `boolean`: Returns `true` if the `input` is even, `false` otherwise.
     - **Important Logic:**
       - Uses the modulo operator (`%`) to check if the remainder of `input` divided by 2 is equal to 0. If it is, the number is even and the method returns `true`; otherwise, it returns `false`.

   - **Method `highComplexityMethod(int a, int b, int c)`**
     - **Description:**  Prints messages based on the signs of three integers (`a`, `b`, `c`).
     - **Parameters:**
       - `a`: An integer.
       - `b`: An integer.
       - `c`: An integer.
     - **Return Values:**
       - None.
     - **Important Logic:**
       - Uses a series of nested `if` statements to analyze the signs of `a`, `b`, and `c`.
       - Prints messages indicating whether each integer is positive or non-positive.
       - The messages are structured to provide a detailed breakdown of the signs of all three integers.

**5. Pseudo Code**

```
// Class: Service

// Method: isEven(int input)
  1. Calculate the remainder when 'input' is divided by 2 using the modulo operator (%).
  2. If the remainder is equal to 0, return true (the number is even).
  3. Otherwise, return false (the number is odd).

// Method: highComplexityMethod(int a, int b, int c)
  1. Check the sign of 'a':
    - If 'a' is 0:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is positive, b is positive, c is positive"
            - If 'c' is non-positive: Print "a is positive, b is positive, c is non-positive"
        - If 'b' is non-positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is positive, b is non-positive, c is positive"
            - If 'c' is non-positive: Print "a is positive, b is non-positive, c is non-positive"
    - If 'a' is less than 0:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is non-positive, b is positive, c is positive"
            - If 'c' is non-positive: Print "a is non-positive, b is positive, c is non-positive"
        - If 'b' is non-positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is non-positive, b is non-positive, c is positive"
            - If 'c' is non-positive: Print "a is non-positive, b is non-positive, c is non-positive"
    - If 'a' is not 0 and not less than 0:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is positive, b is positive, c is positive"
            - If 'c' is non-positive: Print "a is positive, b is positive, c is non-positive"
        - If 'b' is non-positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is positive, b is non-positive, c is positive"
            - If 'c' is non-positive: Print "a is positive, b is non-positive, c is non-positive"



**Dependencies and Libraries:**

- This code does not rely on any external libraries. It uses built-in language functionalities for arithmetic operations and input/output.



