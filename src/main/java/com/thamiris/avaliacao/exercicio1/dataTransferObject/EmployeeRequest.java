package com.thamiris.avaliacao.exercicio1.dataTransferObject;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;


import java.util.List;

public class EmployeeRequest {

    @NotNull(message = "O nome não pode ser nulo")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String name;

    @Min(value = 1, message = "O salário/hora deve ser maior que zero")
    private double workedHourValue;

    @Min(value = 1, message = "Horas trabalhadas devem ser maiores que zero")
    private double hoursWorked;

    @NotNull
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