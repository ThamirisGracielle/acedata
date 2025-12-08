package com.thamiris.avaliacao.util;

import java.util.Scanner;
import java.util.function.Predicate;

public class Validator {

    public static int readPositiveInt(Scanner scanner, String message) {
        return readInt(scanner, message, n -> n > 0, "Erro: valor deve ser maior que zero!");
    }

    public static int readNonNegativeInt(Scanner scanner, String message) {
        return readInt(scanner, message, n -> n >= 0, "Erro: valor não pode ser negativo!");
    }

    public static double readPositiveDouble(Scanner scanner, String message) {
        double value;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) break;
                else System.out.println("Erro: valor deve ser maior que zero!");
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }
        return value;
    }

    private static int readInt(Scanner scanner, String message, Predicate<Integer> condition, String errorMessage) {
        int value;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (condition.test(value)) break;
                else System.out.println(errorMessage);
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next();
            }
        }
        return value;
    }
}
