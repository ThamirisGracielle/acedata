package exercicio1;

import com.thamiris.avaliacao.exercicio1.Employee;
import com.thamiris.avaliacao.exercicio1.Payroll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PayrollTest {

    @Test
    void testFamilyAllowanceMinSalary() {
        // Salário bruto ≤ 788
        Employee emp = new Employee("Thamiris", 10.0, 78.8, List.of(5, 8)); // 2 filhos menores de 14 anos
        Payroll payroll = new Payroll(emp);

        assertEquals(788.0, payroll.getGrossSalary(), 0.01);
        assertEquals(61.0, payroll.getFamilyAllowance(), 0.01); // 2 filhos * 30,50
        assertEquals(849.0, payroll.getNetSalary(), 0.01);
    }

    @Test
    void testFamilyAllowanceMediumSalary() {
        // Salário bruto > 788 e ≤ 1100
        Employee emp = new Employee("Joao", 20.0, 50, List.of(10, 12, 15)); // apenas 2 filhos menores de 14
        Payroll payroll = new Payroll(emp);

        assertEquals(1000.0, payroll.getGrossSalary(), 0.01);
        assertEquals(37.0, payroll.getFamilyAllowance(), 0.01); // 2 filhos * 18,50
        assertEquals(1037.0, payroll.getNetSalary(), 0.01);
    }

    @Test
    void testFamilyAllowanceHighSalary() {
        // Salário bruto > 1100
        Employee emp = new Employee("Marcia", 50.0, 30, List.of(13)); // 1 filho menor de 14
        Payroll payroll = new Payroll(emp);

        assertEquals(1500.0, payroll.getGrossSalary(), 0.01);
        assertEquals(11.9, payroll.getFamilyAllowance(), 0.01); // 1 filho * 11,90
        assertEquals(1511.9, payroll.getNetSalary(), 0.01);
    }

    @Test
    void testNoChildren() {
        // Funcionário sem filhos
        Employee emp = new Employee("Lucas", 25.0, 40, List.of());
        Payroll payroll = new Payroll(emp);

        assertEquals(1000.0, payroll.getGrossSalary(), 0.01);
        assertEquals(0.0, payroll.getFamilyAllowance(), 0.01);
        assertEquals(1000.0, payroll.getNetSalary(), 0.01);
    }

    @Test
    void testAllChildrenAbove14() {
        // Funcionário com filhos, mas todos maiores de 14 anos
        Employee emp = new Employee("Carlos", 20.0, 50, List.of(15, 16, 18));
        Payroll payroll = new Payroll(emp);

        assertEquals(1000.0, payroll.getGrossSalary(), 0.01);
        assertEquals(0.0, payroll.getFamilyAllowance(), 0.01);
        assertEquals(1000.0, payroll.getNetSalary(), 0.01);
    }

    @Test
    void testMixedChildrenAges() {
        // Funcionário com filhos menores e maiores de 14 anos
        Employee emp = new Employee("Ana", 20.0, 50, List.of(10, 14, 12));
        Payroll payroll = new Payroll(emp);

        assertEquals(1000.0, payroll.getGrossSalary(), 0.01);
        assertEquals(37.0, payroll.getFamilyAllowance(), 0.01); // 2 filhos * 18,50
        assertEquals(1037.0, payroll.getNetSalary(), 0.01);
    }

    @Test
    void testAllChildrenUnder14() {
        // Todos filhos menores de 14 anos
        Employee emp = new Employee("Camila", 25.0, 40, List.of(5, 8, 3));
        Payroll payroll = new Payroll(emp);

        assertEquals(1000.0, payroll.getGrossSalary(), 0.01);
        assertEquals(55.5, payroll.getFamilyAllowance(), 0.01); // 3 filhos * 18,50
        assertEquals(1055.5, payroll.getNetSalary(), 0.01);
    }
}