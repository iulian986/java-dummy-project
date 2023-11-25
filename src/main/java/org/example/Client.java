package org.example;

public class Client {
    private final Service service;

    public Client(Service service) {
        this.service = service;
    }

    public String greeting(String name) {
        validateName(name);

        boolean even = service.isEven(name.length());
        String greeting = formatGreeting(name);
        return applyFormatting(greeting, even);
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("'name' must not be null or empty");
        }
    }

    private String formatGreeting(String name) {
        return "Hello, %s".formatted(name);
    }

    private String applyFormatting(String greeting, boolean even) {
        if (even) {
            return greeting.toUpperCase();
        } else {
            return greeting;
        }
    }
}