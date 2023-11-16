
package org.example;

public class Client {
    private final Service service;

    public Client(Service service) {
        this.service = service;
    }

    public String greeting(String name) {
        validateName(name);

        boolean even = service.isEven(name.length());
        String greeting = "Hello, %s".formatted(name);
        return even ? greeting.toUpperCase() : greeting;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("'name' must not be null or empty");
        }
    }
}