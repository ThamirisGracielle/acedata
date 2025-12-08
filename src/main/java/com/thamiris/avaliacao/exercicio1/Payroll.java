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
     * Calculates the employee's salary.
     *
     * - gets the gross salary using calculateGrossSalary()
     * - gets the family allowance using calculateFamilyAllowance()
     * - calculates the net salary by adding gross salary and family allowance
     *
     * Does not take any parameters and does not return anything.
     */

    private void calculate() {
        grossSalary = calculateGrossSalary();
        familyAllowance = calculateFamilyAllowance();
        netSalary = grossSalary + familyAllowance;
    }

    /**
     * Calculates the employee's gross salary.
     *
     * - multiplies the value of one worked hour by the total hours worked
     *
     * Does not take any parameters.
     * Returns the gross salary as a double.
     */

    private double calculateGrossSalary() {
        return employee.getWorkedHourValue() * employee.getHoursWorked();
    }


    /**
     * Calculates the employee's family allowance.
     *
     * - counts the number of children under 14 years old
     * - defines the value per child based on the employee's gross salary
     * - multiplies the number of eligible children by the value per child
     *
     * Does not take any parameters.
     * Returns the family allowance as a double.
     */
    private double calculateFamilyAllowance() {
        int eligibleChildren = employee.getNumberOfChildrenUnder14(); // apenas filhos menores de 14 anos
        double valuePerChild;

        if (grossSalary <= MIN_SALARY_LIMIT) {
            valuePerChild = CHILD_VALUE_MIN_SALARY;
        } else if (grossSalary <= MEDIUM_SALARY_LIMIT) {
            valuePerChild = CHILD_VALUE_MEDIUM_SALARY;
        } else {
            valuePerChild = CHILD_VALUE_HIGH_SALARY;
        }

        return eligibleChildren * valuePerChild;
    }

    public Employee getEmployee() {
        return employee;
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

    public void print() {
        System.out.println("=--=-= Folha de Pagamento =-=-=-=");
        System.out.println("Nome do funcionário: " + employee.getName());
        System.out.println("Salário bruto: R$ " + String.format("%.2f", grossSalary));
        System.out.println("Salário-família: R$ " + String.format("%.2f", familyAllowance));
        System.out.println("Salário total: R$ " + String.format("%.2f", netSalary));
    }
}
