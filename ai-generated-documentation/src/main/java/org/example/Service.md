## Service.java Documentation

**1. Overview**

The `Service` class provides utility methods for basic calculations and conditional logic. It contains two methods: `isEven` to check if a number is even and `highComplexityMethod` to perform a series of conditional checks based on three integer inputs.

**2. Package/module name:**

`org.example`

**3. Class/file name:**

`Service.java`

**4. Detailed Documentation**

* **Class `Service`**

    * **Method `isEven(int input)`**
        * **Description:** Determines if a given integer is even.
        * **Parameters:**
            * `input`: An integer to be checked.
        * **Return Values:**
            * `boolean`: `true` if the input is even, `false` otherwise.
        * **Important Logic:** Uses the modulo operator (`%`) to check if the remainder of the input divided by 2 is equal to 0. If it is, the input is even and the method returns `true`; otherwise, it returns `false`.

    * **Method `highComplexityMethod(int a, int b, int c)`**
        * **Description:** Performs a series of nested conditional checks based on the values of three integer inputs (`a`, `b`, and `c`). It prints messages to the console indicating the sign (positive or non-positive) of each input.
        * **Parameters:**
            * `a`: An integer.
            * `b`: An integer.
            * `c`: An integer.
        * **Return Values:** None.
        * **Important Logic:**
            * The method first checks the sign of `a`.
            * Based on the sign of `a`, it further checks the signs of `b` and `c` and prints corresponding messages.
            * The logic involves multiple nested `if` and `else if` statements to cover all possible combinations of positive and non-positive values for `a`, `b`, and `c`.

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
     - If 'a' is 0:
       - Print "a is positive"
       - Check the sign of 'b':
         - If 'b' is positive:
           - Print "b is positive"
           - Check the sign of 'c':
             - If 'c' is positive:
               - Print "c is positive"
             - Otherwise:
               - Print "c is non-positive"
         - Otherwise:
           - Print "b is non-positive"
           - Check the sign of 'c':
             - If 'c' is positive:
               - Print "c is positive"
             - Otherwise:
               - Print "c is non-positive"
     - If 'a' is less than 0:
       - Print "a is non-positive"
       - Check the sign of 'b':
         - If 'b' is positive:
           - Print "b is positive"
           - Check the sign of 'c':
             - If 'c' is positive:
               - Print "c is positive"
             - Otherwise:
               - Print "c is non-positive"
         - Otherwise:
           - Print "b is non-positive"
           - Check the sign of 'c':
             - If 'c' is positive:
               - Print "c is positive"
             - Otherwise:
               - Print "c is non-positive"
     - Otherwise:
       - Print "a is non-positive"
       - Check the sign of 'b':
         - If 'b' is positive:
           - Print "b is positive"
           - Check the sign of 'c':
             - If 'c' is positive:
               - Print "c is positive"
             - Otherwise:
               - Print "c is non-positive"
         - Otherwise:
           - Print "b is non-positive"
           - Check the sign of 'c':
             - If 'c' is positive:
               - Print "c is positive"
             - Otherwise:
               - Print "c is non-positive"



**Dependencies and Libraries:**

* The `Service` class does not rely on any external libraries.



