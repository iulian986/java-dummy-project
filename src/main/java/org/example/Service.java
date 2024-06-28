package org.example;

public class Service {
    /**
     * Checks if the given integer is even.
     *
     * @param input The integer to check.
     * @return true if 'input' is even, false otherwise.
     */
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    /**
     * Prints information about the signs of three integers based on their values.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     */
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
