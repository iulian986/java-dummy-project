## Service.java Documentation

**1. Overview:**

This Java class `Service` provides two methods: `isEven` to determine if a given integer is even and `highComplexityMethod` which performs a series of conditional checks based on three input integers. 

**2. Package/module name:**

org.example

**3. Class/file name:**

Service.java

**4. Detailed Documentation:**

   - **Function/Method: `isEven(int input)`**
     - **Description:** This method takes an integer as input and returns `true` if the input is even (divisible by 2), otherwise it returns `false`.
     - **Parameters:**
       - `input`: An integer value.
     - **Return Values:**
       - A boolean value (`true` or `false`) indicating whether the input is even.
     - **Important Logic:** The method uses the modulo operator (`%`) to check if the remainder of dividing the input by 2 is equal to 0. If it is, the input is even and the method returns `true`; otherwise, it returns `false`.

   - **Function/Method: `highComplexityMethod(int a, int b, int c)`**
     - **Description:** This method takes three integers as input (`a`, `b`, and `c`) and prints various messages to the console based on the signs of these integers. It uses nested if-else statements to check all possible combinations of positive and non-positive values for `a`, `b`, and `c`.
     - **Parameters:**
       - `a`: An integer value.
       - `b`: An integer value.
       - `c`: An integer value.
     - **Return Values:**
       - This method does not return any value (void).
     - **Important Logic:** The method first checks the sign of `a`. Based on its sign, it enters different branches of if-else statements to check the signs of `b` and `c`, printing messages accordingly.

**5. Pseudo Code:**


```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when input is divided by 2 (input % 2).
  2. If the remainder is equal to 0, return true (input is even).
  3. Otherwise, return false (input is odd).

// Method: highComplexityMethod(a, b, c)
  1. Check the sign of 'a':
     - If 'a' is positive:
        - Check the sign of 'b':
           - If 'b' is positive:
              - Check the sign of 'c':
                 - If 'c' is positive, print "a, b, and c are positive".
                 - Otherwise, print "a and b are positive, c is non-positive".
           - Otherwise (b is non-positive):
              - Check the sign of 'c':
                 - If 'c' is positive, print "a is positive, b is non-positive, and c is positive".
                 - Otherwise, print "a and b are non-positive, c is non-positive".
     - If 'a' is non-positive:
        - Check the sign of 'b':
           - If 'b' is positive:
              - Check the sign of 'c':
                 - If 'c' is positive, print "a is non-positive, b is positive, and c is positive".
                 - Otherwise, print "a is non-positive, b is positive, and c is non-positive".
           - Otherwise (b is non-positive):
              - Check the sign of 'c':
                 - If 'c' is positive, print "a and b are non-positive, c is positive".
                 - Otherwise, print "a and b are non-positive, c is non-positive".



```

**Dependencies and Libraries:**


This code does not rely on any external libraries. It uses standard Java built-in functionalities. 




