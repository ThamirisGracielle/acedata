package com.thamiris.avaliacao.exercicio1;

public class Payroll {

    private Employee employee;
    private double grossSalary;
    private double familyAllowance;
    private double netSalary;

    private static final double MIN_SALARY_LIMIT = 788.00;
    private static final double MEDIUM_SALARY_LIMIT = 1100.00;

    private static final double CHILD_VALUE_MIN_SALARY = 30.50;
    private static final double CHILD_VALUE_MEDIUM_SALARY = 18.50;
    private static final double CHILD_VALUE_HIGH_SALARY = 11.90;

    public Payroll(Employee employee) {
        this.employee = employee;
        calculate();
    }

    /**
     * Calculates the employee's salary values.
     *
     * This method does the following:
     * - grossSalary: gets value from calculateGrossSalary()
     * - familyAllowance: gets value from calculateFamilyAllowance()
     * - netSalary: sum of grossSalary and familyAllowance
     *
     * It does not take any parameters and does not return anything.
     */

    private void calculate() {
        grossSalary = calculateGrossSalary();
        familyAllowance = calculateFamilyAllowance();
        netSalary = grossSalary + familyAllowance;
    }

    /**
     * Calculates the employee's gross salary.
     *
     * This method multiplies:
     * - the value of one worked hour (employee.getworked_hour_value())
     * - by the number of hours worked (employee.getHoursWorked())
     *
     * It returns the result as a double.
     */

    private double calculateGrossSalary() {
        return employee.getworked_hour_value() * employee.getHoursWorked();
    }

    /**
     * Calculates the family allowance for the employee.
     *
     * This method does the following:
     * - Checks the gross salary to decide the value per child:
     *   * MIN_SALARY_LIMIT → CHILD_VALUE_MIN_SALARY
     *   * MEDIUM_SALARY_LIMIT → CHILD_VALUE_MEDIUM_SALARY
     *   * Higher than MEDIUM_SALARY_LIMIT → CHILD_VALUE_HIGH_SALARY
     * - Multiplies the value per child by the number of children (employee.getNumberOfChildren())
     *
     * It returns the total family allowance as a double.
     */
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
        System.out.println("Salário total: R$ " + String.format("%.2f", netSalary));
    }
}
