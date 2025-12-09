package com.thamiris.avaliacao.exercicio1.service;

import com.thamiris.avaliacao.exercicio1.dataTransferObject.EmployeeRequest;
import com.thamiris.avaliacao.exercicio1.dataTransferObject.PayrollResponse;
import com.thamiris.avaliacao.exercicio1.model.Employee;
import com.thamiris.avaliacao.util.Validator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayrollService {

    private static final double MIN_SALARY_LIMIT = 788.00;
    private static final double MEDIUM_SALARY_LIMIT = 1100.00;

    private static final double CHILD_VALUE_MIN_SALARY = 30.50;
    private static final double CHILD_VALUE_MEDIUM_SALARY = 18.50;
    private static final double CHILD_VALUE_HIGH_SALARY = 11.90;

    /**
    *  Calculates the complete payroll of an employee.
    */
    public PayrollResponse calculatePayroll(EmployeeRequest request) {

        if (request.getName() == null || request.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do funcionário não pode ser vazio!");
        }

        double workedHourValue = Validator.validatePositiveDouble(request.getWorkedHourValue());

        double hoursWorked = Validator.validatePositiveDouble(request.getHoursWorked());

        List<Integer> childrenAges = request.getChildrenAges();
        if (childrenAges == null) {
            throw new IllegalArgumentException("A lista de idades das crianças não pode ser nula!");
        }

        for (Integer age : childrenAges) {
            if (age == null) {
                throw new IllegalArgumentException("Idade de filho não pode ser nula!");
            }
            Validator.validateNonNegativeInt(age);
        }

        Employee employee = new Employee(
                request.getName(),
                workedHourValue,
                hoursWorked,
                childrenAges
        );

        double grossSalary = workedHourValue * hoursWorked;

        int eligibleChildren = employee.getNumberOfChildrenUnder14();

        double valuePerChild;

        if (grossSalary <= MIN_SALARY_LIMIT) {
            valuePerChild = CHILD_VALUE_MIN_SALARY;
        } else if (grossSalary <= MEDIUM_SALARY_LIMIT) {
            valuePerChild = CHILD_VALUE_MEDIUM_SALARY;
        } else {
            valuePerChild = CHILD_VALUE_HIGH_SALARY;
        }

        double familyAllowance = eligibleChildren * valuePerChild;

        double netSalary = grossSalary + familyAllowance;

        return new PayrollResponse(
                employee.getName(),
                grossSalary,
                familyAllowance,
                netSalary
        );
    }
}