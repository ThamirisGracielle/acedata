package com.thamiris.avaliacao.exercicio1;

public class Employee {

    private String name;
    private double hourlyRate;
    private double hoursWorked;
    private int numberOfChildren;

    public Employee(String name, double hourlyRate, double hoursWorked, int numberOfChildren) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.numberOfChildren = numberOfChildren;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }
}
