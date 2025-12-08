package com.thamiris.avaliacao.exercicio1;

import com.thamiris.avaliacao.util.Validator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.print("Informe seu nome: ");
            String name = keyboard.nextLine();

            double hourlyRate = Validator.readPositiveDouble(keyboard, "Informe o valor da hora trabalhada: ");
            double hoursWorked = Validator.readPositiveDouble(keyboard, "Informe a quantidade de horas trabalhadas no mês: ");
            int numberOfChildren = Validator.readPositiveInt(keyboard, "Informe a quantidade de filhos menores de 14 anos: ");

            Employee employee = new Employee(name, hourlyRate, hoursWorked, numberOfChildren);

            Payroll payroll = new Payroll(employee);
            payroll.print();
        }
    }
}
