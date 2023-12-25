package org.example;

public class Client {
    private final Service service;

    /**
     * Constructor for Client class
     * @param service the service to be used
     */
    public Client(Service service) {
        this.service = service;
    }

    /**
     * Generates a greeting message based on the length of the name
     * @param name the name of the person to greet
     * @return the greeting message
     * @throws IllegalArgumentException if the name is null or empty
     */
    public String greeting(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("'name' must not be null or empty");
        }

        boolean even = service.isEven(name.length());
        String greeting = "Hello, %s".formatted(name);
        if (even) {
            return greeting.toUpperCase();
        } else {
            return greeting;
        }
    }
}