package com.thamiris.avaliacao.exercicio1;

public class Employee {

    private String name;
    private double worked_hour_value;
    private double hoursWorked;
    private int numberOfChildren;

    public Employee(String name, double worked_hour_value, double hoursWorked, int numberOfChildren) {
        this.name = name;
        this.worked_hour_value = worked_hour_value;
        this.hoursWorked = hoursWorked;
        this.numberOfChildren = numberOfChildren;
    }

    public String getName() {

        return name;
    }

    public double getworked_hour_value() {

        return worked_hour_value;
    }

    public double getHoursWorked() {

        return hoursWorked;
    }

    public int getNumberOfChildren() {

        return numberOfChildren;
    }
}
