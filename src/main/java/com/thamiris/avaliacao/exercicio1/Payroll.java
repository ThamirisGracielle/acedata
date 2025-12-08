package com.thamiris.avaliacao.exercicio1;

public class Payroll {

    private Employee employee;
    private double grossSalary;
    private double familyAllowance;
    private double totalSalary;

    private static final double MIN_SALARY_LIMIT = 788.00;
    private static final double MEDIUM_SALARY_LIMIT = 1100.00;

    private static final double CHILD_VALUE_MIN_SALARY = 30.50;
    private static final double CHILD_VALUE_MEDIUM_SALARY = 18.50;
    private static final double CHILD_VALUE_HIGH_SALARY = 11.90;

    public Payroll(Employee employee) {
        this.employee = employee;
        calculate();
    }

    private void calculate() {
        grossSalary = calculateGrossSalary();
        familyAllowance = calculateFamilyAllowance();
        totalSalary = grossSalary + familyAllowance;
    }

    private double calculateGrossSalary() {
        return employee.getHourlyRate() * employee.getHoursWorked();
    }

    private double calculateFamilyAllowance() {
        double valuePerChild;

        if (grossSalary <= MIN_SALARY_LIMIT) {
            valuePerChild = CHILD_VALUE_MIN_SALARY;
        } else if (grossSalary <= MEDIUM_SALARY_LIMIT) {
            valuePerChild = CHILD_VALUE_MEDIUM_SALARY;
        } else {
            valuePerChild = CHILD_VALUE_HIGH_SALARY;
        }

        return employee.getNumberOfChildren() * valuePerChild;
    }

    public void print() {
        System.out.println("=--=-= Folha de Pagamento =-=-=-=");
        System.out.println("Nome do funcionário: " + employee.getName());
        System.out.println("Salário bruto: R$ " + String.format("%.2f", grossSalary));
        System.out.println("Salário-família: R$ " + String.format("%.2f", familyAllowance));
        System.out.println("Salário total: R$ " + String.format("%.2f", totalSalary));
    }
}
