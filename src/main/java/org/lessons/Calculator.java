package org.lessons;

public interface Calculator {
    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float divide(float num1, float num2) throws  IllegalArgumentException {
        if (num2 == 0) {
            throw  new IllegalArgumentException("Il dividendo è 0");
        }
        return num1 / num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
