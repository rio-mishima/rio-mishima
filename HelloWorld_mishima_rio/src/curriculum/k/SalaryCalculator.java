package curriculum.k;

public class SalaryCalculator {

    public void printSalary(Employee employee) {
        System.out.println(
            employee.getName() + " の給料は "
            + employee.calculateSalary()
            + " 円"
        );
    }
}