package com.thamiris.avaliacao.util;

import java.util.Scanner;

public class Validator {

    /**
     * Reads a positive integer from the user.
     * <p>
     * This method prompts the user to enter a value until a valid integer
     * greater than zero is provided. If the user enters a non-integer
     * or a number less than or equal to zero, it displays an error
     * message and asks for input again.
     * </p>
     *
     * @param scanner The Scanner object used to read user input.
     * @param message The message displayed to prompt the user for input.
     * @return An integer greater than zero entered by the user.
     */
    public static int readPositiveInt(Scanner scanner, String message) {
        int value;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next();
                System.out.print(message);
            }
            value = scanner.nextInt();
            if (value <= 0) {
                System.out.println("Erro: valor deve ser maior que zero!");
            }
        } while (value <= 0);
        return value;
    }

    /**
     * Reads a non-negative integer from the user.
     * <p>
     * This method prompts the user to enter a value until a valid integer
     * greater than or equal to zero is provided. If the user enters a non-integer
     * or a negative number, it displays an error message and asks for input again.
     * </p>
     *
     * @param scanner The Scanner object used to read user input.
     * @param message The message displayed to prompt the user for input.
     * @return An integer greater than or equal to zero entered by the user.
     */
    public static int readNonNegativeInt(Scanner scanner, String message) {
        int value;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next();
                System.out.print(message);
            }
            value = scanner.nextInt();
            if (value < 0) {
                System.out.println("Erro: valor não pode ser negativo!");
            }
        } while (value < 0);
        return value;
    }

    /**
     * Reads a positive double value from the user.
     * <p>
     * This method prompts the user to enter a value until a valid double
     * greater than zero is provided. If the user enters a non-numeric value
     * or a number less than or equal to zero, it displays an error message
     * and asks for input again.
     * </p>
     *
     * @param scanner The Scanner object used to read user input.
     * @param message The message displayed to prompt the user for input.
     * @return A double value greater than zero entered by the user.
     */
    public static double readPositiveDouble(Scanner scanner, String message) {
        double value;
        do {
            System.out.print(message);
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
                System.out.print(message);
            }
            value = scanner.nextDouble();
            if (value <= 0) {
                System.out.println("Erro: valor deve ser maior que zero!");
            }
        } while (value <= 0);
        return value;
    }
}