package org.lessons;

public class Ticket {

    private int kilometers;
    private int age;
    private double basePrice;

    public Ticket(int kilometers, int age) throws IllegalArgumentException {
        checkPositive(kilometers);
        checkPositive(age);

        this.kilometers = kilometers;
        this.age = age;

        this.basePrice = kilometers * 0.21;
    }

    private void checkPositive(int num) throws IllegalArgumentException {
        if (num < 1) {
            throw new IllegalArgumentException("Numero minore o uguale a 0");
        }
    }

    public double calculatePrice() {
        if(age >= 65) {
            return basePrice * 0.6;
        } else if (age < 18) {
            return basePrice * 0.8;
        } else {
            return basePrice;
        }
    }
}
