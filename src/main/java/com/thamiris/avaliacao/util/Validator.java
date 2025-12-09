package com.thamiris.avaliacao.util;

public class Validator {

    public static int validatePositiveInt(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        }
        return value;
    }

    public static int validateNonNegativeInt(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo!");
        }
        return value;
    }

    public static double validatePositiveDouble(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        }
        return value;
    }
}