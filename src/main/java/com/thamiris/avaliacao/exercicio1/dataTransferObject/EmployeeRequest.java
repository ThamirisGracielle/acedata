package com.thamiris.avaliacao.exercicio1.dataTransferObject;

import java.util.List;

public class EmployeeRequest {

    private String name;
    private double workedHourValue;
    private double hoursWorked;
    private List<Integer> childrenAges;


    public EmployeeRequest() {
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

}