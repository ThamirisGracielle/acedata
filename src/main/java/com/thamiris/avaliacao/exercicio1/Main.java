package com.thamiris.avaliacao.exercicio1;

import com.thamiris.avaliacao.util.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.print("Informe seu nome: ");
            String name = keyboard.nextLine();

            double hourlyRate = Validator.readPositiveDouble(keyboard, "Informe o valor da hora trabalhada: ");
            double hoursWorked = Validator.readPositiveDouble(keyboard, "Informe a quantidade de horas trabalhadas no mês: ");

            System.out.print("Informe a quantidade de filhos: ");
            int totalChildren = Validator.readPositiveInt(keyboard, "");

            List<Integer> childrenAges = new ArrayList<>();
            for (int i = 1; i <= totalChildren; i++) {
                int age = Validator.readPositiveInt(keyboard, "Informe a idade do filho " + i + ": ");
                childrenAges.add(age);
            }

            Employee employee = new Employee(name, hourlyRate, hoursWorked, childrenAges);

            Payroll payroll = new Payroll(employee);
            payroll.print();
        }
    }
}
