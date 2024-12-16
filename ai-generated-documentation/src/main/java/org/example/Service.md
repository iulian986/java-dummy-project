You are given the following source code from a repository. Your task is to document the code comprehensively. This includes:
1. A brief overview of what the entire code does.
2. Detailed explanations of each function or method, including its purpose, parameters, return values, and any important logic within it.
3. Descriptions of key variables and data structures used.
4. Any assumptions or dependencies the code has.

After documenting the code, generate a step-by-step pseudocode that describes the logic and flow of the program.
Ensure the pseudocode is clear and detailed enough to be understood without referencing the original code.
Edge cases and error handling:
Ensure that all edge cases and error handling present in the original code are preserved in the documentation.
This includes proper exception handling and validation logic.
Dependencies and Libraries: Identify and document or suggest equivalent libraries in various languages.
For example, if the source code uses a specific Cobol library, then recommend the closest equivalent library in Java, Python, C++ etc.

Here is file name: Service.java

Here is the source code:
package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else if (a < 0) {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        }
    }
}

Output should be structured as follows:
1. Overview
2. Package/module name
3. Class/file name
4. Detailed Documentation
   - Function/Method 1
     - Description
     - Parameters
     - Return Values
     - Important Logic
   - Function/Method 2
     - Description
     - Parameters
     - Return Values
     - Important Logic
   - ...
5. Pseudo Code
    - Include all identified edge cases and details
    - Format the pseudocode as follows:
          - Use bullet points for each step.
          - Indent nested steps for clarity.
          - Use consistent terminology and structure throughout.
          - Format the pseudocode in a code block.
          - Ensure the pseudocode is not written in any specific programming language syntax.


Example Pseudocode Format:
```
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
```
