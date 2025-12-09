package com.thamiris.avaliacao.exercicio1.model;

import java.util.List;

public class Employee {

    private String name;
    private double workedHourValue;
    private double hoursWorked;
    private List<Integer> childrenAges;

    public Employee(String name, double workedHourValue, double hoursWorked, List<Integer> childrenAges) {
        this.name = name;
        this.workedHourValue = workedHourValue;
        this.hoursWorked = hoursWorked;
        this.childrenAges = childrenAges;
    }

    public String getName() {
        return name;
    }
    public double getWorkedHourValue() {
        return workedHourValue;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public List<Integer> getChildrenAges() {
        return childrenAges;
    }

    public int getNumberOfChildrenUnder14() {
        int count = 0;
        for (int age : childrenAges) {
            if (age < 14) {
                count++;
            }
        }
        return count;
    }
}