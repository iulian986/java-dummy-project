package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            handlePositiveA(b, c);
        } else if (a < 0) {
            handleNegativeA(b, c);
        } else {
            handlePositiveA(b, c);
        }
    }

    private void handlePositiveA(int b, int c) {
        System.out.println("a is positive");
        handleB(b, c);
    }

    private void handleNegativeA(int b, int c) {
        System.out.println("a is non-positive");
        handleB(b, c);
    }

    private void handleB(int b, int c) {
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
