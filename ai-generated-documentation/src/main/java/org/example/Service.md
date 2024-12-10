## Service.java Documentation

**1. Overview**

The `Service` class provides utility methods for basic calculations and logical operations. It contains two methods: `isEven` to check if a number is even and `highComplexityMethod` to analyze the signs of three integers.

**2. Package/module name:**

`org.example`

**3. Class/file name:**

`Service.java`

**4. Detailed Documentation**

   - **Method `isEven(int input)`**
     - **Description:** Determines if a given integer is even.
     - **Parameters:**
       - `input`: An integer to be checked.
     - **Return Values:**
       - `boolean`: `true` if the `input` is even, `false` otherwise.
     - **Important Logic:** Uses the modulo operator (`%`) to check if the remainder of dividing `input` by 2 is 0. If the remainder is 0, the number is even.

   - **Method `highComplexityMethod(int a, int b, int c)`**
     - **Description:** Prints a series of messages based on the signs of three integers (`a`, `b`, and `c`).
     - **Parameters:**
       - `a`: An integer.
       - `b`: An integer.
       - `c`: An integer.
     - **Return Values:** None.
     - **Important Logic:**
       - Uses nested `if` statements to analyze the signs of `a`, `b`, and `c`.
       - Prints messages indicating whether each integer is positive or non-positive.
       - The logic is repetitive and could be simplified using a more structured approach.

**5. Pseudo Code**

```
// Class: Service

// Method: isEven(int input)
  1. Calculate the remainder when 'input' is divided by 2 using the modulo operator (%).
  2. If the remainder is 0, return true (the number is even).
  3. Otherwise, return false (the number is odd).

// Method: highComplexityMethod(int a, int b, int c)
  1. Check the sign of 'a':
    - If 'a' is 0:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "c is positive".
            - Otherwise, print "c is non-positive".
        - Otherwise, print "b is non-positive".
    - If 'a' is negative:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "c is positive".
            - Otherwise, print "c is non-positive".
        - Otherwise, print "b is non-positive".
    - Otherwise, print "a is non-positive".



```



**Dependencies and Libraries:**

- The code does not rely on any external libraries.



