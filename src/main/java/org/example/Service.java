package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            handlePositiveA(b, c);
        } else if (a < 0) {
            handleNonPositiveA(b, c);
        } else {
            handleNonPositiveA(b, c);
        }
    }

    private void handlePositiveA(int b, int c) {
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
    }

    private void handleNonPositiveA(int b, int c) {
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
