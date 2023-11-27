
package org.example;

public class Client {
    private final Service service;

    public Client(Service service) {
        this.service = service;
    }

    public String greeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("'name' must not be null or empty");
        }

        boolean isNameLengthEven = service.isEven(name.length());
        String greeting = "Hello, %s".formatted(name);
        if (isNameLengthEven) {
            return greeting.toUpperCase();
        } else {
            return greeting;
        }
    }
}
