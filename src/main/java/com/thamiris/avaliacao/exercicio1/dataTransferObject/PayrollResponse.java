package com.thamiris.avaliacao.exercicio1.dataTransferObject;

public class PayrollResponse {

    private String employeeName;
    private double grossSalary;
    private double familyAllowance;
    private double netSalary;

    public PayrollResponse(String employeeName, double grossSalary, double familyAllowance, double netSalary) {
        this.employeeName = employeeName;
        this.grossSalary = grossSalary;
        this.familyAllowance = familyAllowance;
        this.netSalary = netSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getFamilyAllowance() {
        return familyAllowance;
    }

    public double getNetSalary() {
        return netSalary;
    }
}