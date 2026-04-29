package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Billable> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E001", "山田"));
        employees.add(new ContractEmployee("E002", "田中"));
        employees.add(new FullTimeEmployee("E003", "佐藤"));
        employees.add(new ContractEmployee("E004", "鈴木"));

        for (Billable emp : employees) {
            System.out.println("日給: " + emp.costForDay(9) + " 円");
        }

    }

}