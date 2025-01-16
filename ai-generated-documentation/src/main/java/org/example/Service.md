## Service.java Documentation

**1. Overview**

The `Service` class provides two methods: `isEven` and `highComplexityMethod`. The `isEven` method determines if an integer is even, while `highComplexityMethod` performs a series of conditional checks and prints messages based on the signs of three input integers.

**2. Package/module name:**

`org.example`

**3. Class/file name:**

`Service.java`

**4. Detailed Documentation**

   - **Method `isEven(int input)`**
     - **Description:** Checks if a given integer is even.
     - **Parameters:**
       - `input`: An integer to be checked.
     - **Return Values:**
       - `boolean`: `true` if the input is even, `false` otherwise.
     - **Important Logic:** Uses the modulo operator (`%`) to check if the remainder of the input divided by 2 is equal to 0.

   - **Method `highComplexityMethod(int a, int b, int c)`**
     - **Description:** Prints messages based on the signs of three input integers.
     - **Parameters:**
       - `a`: An integer.
       - `b`: An integer.
       - `c`: An integer.
     - **Return Values:** None.
     - **Important Logic:**
       - Uses nested `if` statements to check the signs of `a`, `b`, and `c`.
       - Prints messages indicating the signs of each integer and their combinations.

**5. Pseudo Code**

```
// Class: Service

// Method: isEven(int input)
  1. Calculate the remainder when 'input' is divided by 2.
  2. If the remainder is equal to 0, return true.
  3. Otherwise, return false.

// Method: highComplexityMethod(int a, int b, int c)
  1. Check the sign of 'a':
    - If 'a' is positive:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "a is positive, b is positive, c is positive".
            - If 'c' is non-positive, print "a is positive, b is positive, c is non-positive".
        - If 'b' is non-positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "a is positive, b is non-positive, c is positive".
            - If 'c' is non-positive, print "a is positive, b is non-positive, c is non-positive".
    - If 'a' is non-positive:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "a is non-positive, b is positive, c is positive".
            - If 'c' is non-positive, print "a is non-positive, b is positive, c is non-positive".
        - If 'b' is non-positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "a is non-positive, b is non-positive, c is positive".
            - If 'c' is non-positive, print "a is non-positive, b is non-positive, c is non-positive".



**Dependencies and Libraries:**

- The code does not rely on any external libraries.



