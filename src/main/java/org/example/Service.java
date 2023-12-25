package org.example;

public class Service {
    /**
     * Check if the input is even
     * @param input the number to check
     * @return true if the input is even, false otherwise
     */
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    /**
     * Perform a high complexity method
     * @param a the first number
     * @param b the second number
     * @param c the third number
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