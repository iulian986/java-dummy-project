## Service.java Documentation

**1. Overview**

The `Service` class provides two methods: `isEven` and `highComplexityMethod`. 

* `isEven` determines if an integer is even. 
* `highComplexityMethod` analyzes three integers (`a`, `b`, and `c`) and prints a series of messages based on their positive or non-positive values.

**2. Package/module name:**

`org.example`

**3. Class/file name:**

`Service.java`

**4. Detailed Documentation**

* **Class `Service`**

    * **Method `isEven(int input)`**
        * **Description:** Checks if the given integer `input` is even.
        * **Parameters:**
            * `input`: An integer to be checked.
        * **Return Values:**
            * `true`: If the `input` is even.
            * `false`: If the `input` is odd.
        * **Important Logic:**
            * Uses the modulo operator (`%`) to check if the remainder of `input` divided by 2 is equal to 0. If it is, the number is even and `true` is returned; otherwise, `false` is returned.

    * **Method `highComplexityMethod(int a, int b, int c)`**
        * **Description:**  Analyzes three integers (`a`, `b`, and `c`) and prints messages based on their positive or non-positive values.
        * **Parameters:**
            * `a`: The first integer.
            * `b`: The second integer.
            * `c`: The third integer.
        * **Return Values:** None.
        * **Important Logic:**
            * Uses nested `if` statements to check the values of `a`, `b`, and `c`.
            * Prints messages indicating whether each integer is positive or non-positive.
            * The logic is structured to handle all possible combinations of positive and non-positive values for `a`, `b`, and `c`.

**5. Pseudo Code**

```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when input is divided by 2 (input % 2).
  2. If the remainder is 0, return true (input is even).
  3. Otherwise, return false (input is odd).

// Method: highComplexityMethod(a, b, c)
  1. Check the value of 'a':
     - If 'a' is 0:
        - Check the value of 'b':
           - If 'b' is positive:
              - Check the value of 'c':
                 - If 'c' is positive: Print "c is positive".
                 - Otherwise: Print "c is non-positive".
           - Otherwise: Print "b is non-positive".
     - If 'a' is less than 0:
        - Check the value of 'b':
           - If 'b' is positive:
              - Check the value of 'c':
                 - If 'c' is positive: Print "c is positive".
                 - Otherwise: Print "c is non-positive".
           - Otherwise: Print "b is non-positive".
     - Otherwise: Print "a is non-positive".



```



**Dependencies and Libraries:**

* This code does not rely on any external libraries. It uses standard Java language features. 


