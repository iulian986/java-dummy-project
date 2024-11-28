## Service.java Documentation

**1. Overview**

The `Service` class provides two methods: `isEven` and `highComplexityMethod`. The `isEven` method determines if a given integer is even, while `highComplexityMethod` performs a series of conditional checks and prints messages based on the values of three input integers.

**2. Package/module name:**

`org.example`

**3. Class/file name:**

`Service.java`

**4. Detailed Documentation**

**- Method `isEven(int input)`**

   - **Description:** Checks if the given integer `input` is even.
   - **Parameters:**
     - `input`: An integer value to be checked.
   - **Return Values:**
     - `true`: If the `input` is even.
     - `false`: If the `input` is odd.
   - **Important Logic:**
     - Uses the modulo operator (`%`) to check if the remainder of the division of `input` by 2 is equal to 0. If it is, the number is even, and `true` is returned; otherwise, `false` is returned.

**- Method `highComplexityMethod(int a, int b, int c)`**

   - **Description:** This method evaluates the signs of three integers (`a`, `b`, and `c`) and prints messages based on their values.
   - **Parameters:**
     - `a`: An integer value.
     - `b`: An integer value.
     - `c`: An integer value.
   - **Return Values:**
     - None.
   - **Important Logic:**
     - Uses a series of nested `if` statements to check the signs of `a`, `b`, and `c`.
     - Prints messages indicating whether each variable is positive or non-positive.
     - The messages are structured to provide a clear indication of the signs of all three variables.

**5. Pseudo Code**

```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when 'input' is divided by 2 using the modulo operator (%).
  2. If the remainder is equal to 0:
    - Return true.
  3. Otherwise:
    - Return false.

// Method: highComplexityMethod(a, b, c)
  1. Check the sign of 'a':
    - If 'a' is positive:
      - Print "a is positive".
      - Check the sign of 'b':
        - If 'b' is positive:
          - Print "b is positive".
          - Check the sign of 'c':
            - If 'c' is positive:
              - Print "c is positive".
            - Otherwise:
              - Print "c is non-positive".
        - Otherwise:
          - Print "b is non-positive".
          - Check the sign of 'c':
            - If 'c' is positive:
              - Print "c is positive".
            - Otherwise:
              - Print "c is non-positive".
    - If 'a' is non-positive:
      - Print "a is non-positive".
      - Check the sign of 'b':
        - If 'b' is positive:
          - Print "b is positive".
          - Check the sign of 'c':
            - If 'c' is positive:
              - Print "c is positive".
            - Otherwise:
              - Print "c is non-positive".
        - Otherwise:
          - Print "b is non-positive".
          - Check the sign of 'c':
            - If 'c' is positive:
              - Print "c is positive".
            - Otherwise:
              - Print "c is non-positive".



```



**Dependencies and Libraries:**

- This code does not rely on any external libraries. It is a simple example of Java code.