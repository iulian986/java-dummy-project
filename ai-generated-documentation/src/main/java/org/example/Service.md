## Service.java Documentation

**1. Overview**

The `Service` class provides utility methods for basic mathematical operations and string manipulation. It includes a method to check if a given integer is even and a more complex method that prints a series of messages based on the signs of three input integers.

**2. Package/module name:**

`org.example`

**3. Class/file name:**

`Service.java`

**4. Detailed Documentation**

**- Method `isEven(int input)`**

   - **Description:** Determines if a given integer is even.
   - **Parameters:**
     - `input`: An integer to be checked.
   - **Return Values:**
     - `true` if the input integer is even, `false` otherwise.
   - **Important Logic:**
     - Uses the modulo operator (`%`) to check if the remainder of the input integer divided by 2 is equal to 0. If it is, the input is even and the method returns `true`; otherwise, it returns `false`.

**- Method `highComplexityMethod(int a, int b, int c)`**

   - **Description:** Prints a series of messages based on the signs of three input integers (`a`, `b`, and `c`).
   - **Parameters:**
     - `a`: The first integer.
     - `b`: The second integer.
     - `c`: The third integer.
   - **Return Values:**
     - None.
   - **Important Logic:**
     - Uses a series of nested `if` statements to evaluate the signs of `a`, `b`, and `c`.
     - Prints messages indicating whether each integer is positive or non-positive.
     - The messages are structured to provide a clear indication of the relationships between the signs of the three integers.

**5. Pseudo Code**

```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when input is divided by 2 using the modulo operator (%).
  2. If the remainder is equal to 0:
    - Return true.
  3. Else:
    - Return false.

// Method: highComplexityMethod(a, b, c)
  1. Check the sign of a:
    - If a is positive:
      - Print "a is positive".
      - Check the sign of b:
        - If b is positive:
          - Print "b is positive".
          - Check the sign of c:
            - If c is positive:
              - Print "c is positive".
            - Else:
              - Print "c is non-positive".
        - Else:
          - Print "b is non-positive".
          - Check the sign of c:
            - If c is positive:
              - Print "c is positive".
            - Else:
              - Print "c is non-positive".
    - Else if a is non-positive:
      - Print "a is non-positive".
      - Check the sign of b:
        - If b is positive:
          - Print "b is positive".
          - Check the sign of c:
            - If c is positive:
              - Print "c is positive".
            - Else:
              - Print "c is non-positive".
        - Else:
          - Print "b is non-positive".
          - Check the sign of c:
            - If c is positive:
              - Print "c is positive".
            - Else:
              - Print "c is non-positive".



```

**Dependencies:**

- This code does not rely on any external libraries.



