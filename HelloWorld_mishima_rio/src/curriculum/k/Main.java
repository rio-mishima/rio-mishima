package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new FullTimeEmployee("山田", 8));
        employees.add(new ContractEmployee("田中", 8));
        employees.add(new FullTimeEmployee("佐藤", 6));
        employees.add(new ContractEmployee("鈴木", 7));

        SalaryCalculator calculator = new SalaryCalculator();

        for (Employee emp : employees) {
            calculator.printSalary(emp);
        }
    }
}