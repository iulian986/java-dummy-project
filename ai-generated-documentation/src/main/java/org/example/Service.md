## Service.java Documentation

**1. Overview**

The `Service` class provides two methods: `isEven` and `highComplexityMethod`. The `isEven` method determines if a given integer is even, returning `true` if it is and `false` otherwise. The `highComplexityMethod` analyzes three integers (`a`, `b`, and `c`) and prints a series of messages to the console based on their positive or non-positive values.

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
     - `boolean`: Returns `true` if the `input` is even, `false` otherwise.
   - **Important Logic:**
     - Uses the modulo operator (`%`) to calculate the remainder when `input` is divided by 2.
     - Returns `true` if the remainder is 0 (indicating an even number), `false` otherwise.

**- Method `highComplexityMethod(int a, int b, int c)`**

   - **Description:** Analyzes three integers (`a`, `b`, and `c`) and prints messages to the console based on their positive or non-positive values.
   - **Parameters:**
     - `a`: The first integer.
     - `b`: The second integer.
     - `c`: The third integer.
   - **Return Values:**
     - None.
   - **Important Logic:**
     - Uses nested `if` statements to check the values of `a`, `b`, and `c`.
     - Prints messages indicating whether each integer is positive or non-positive.
     - The logic is structured to handle all possible combinations of positive and non-positive values for `a`, `b`, and `c`.

**5. Pseudo Code**

```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when input is divided by 2 (input % 2).
  2. If the remainder is 0, return true (input is even).
  3. Otherwise, return false (input is odd).

// Method: highComplexityMethod(a, b, c)
  1. Check the value of a:
    - If a is 0:
      - Check the value of b:
        - If b is positive:
          - Check the value of c:
            - If c is positive, print "c is positive".
            - Otherwise, print "c is non-positive".
        - Otherwise (b is non-positive):
          - Check the value of c:
            - If c is positive, print "c is positive".
            - Otherwise, print "c is non-positive".
    - If a is non-positive:
      - Check the value of b:
        - If b is positive:
          - Check the value of c:
            - If c is positive, print "c is positive".
            - Otherwise, print "c is non-positive".
        - Otherwise (b is non-positive):
          - Check the value of c:
            - If c is positive, print "c is positive".
            - Otherwise, print "c is non-positive".
    - Otherwise (a is positive):
      - Check the value of b:
        - If b is positive:
          - Check the value of c:
            - If c is positive, print "c is positive".
            - Otherwise, print "c is non-positive".
        - Otherwise (b is non-positive):
          - Check the value of c:
            - If c is positive, print "c is positive".
            - Otherwise, print "c is non-positive".



```



**Dependencies and Libraries:**

- This code does not rely on any external libraries. It is a simple class with basic arithmetic operations.



