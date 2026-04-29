package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ① 社員リスト作成
        List<Employee> employees = new ArrayList<>();

        // ② 複数追加
        employees.add(new FullTimeEmployee("E001", "山田"));
        employees.add(new ContractEmployee("E002", "田中"));
        employees.add(new FullTimeEmployee("E003", "佐藤"));
        employees.add(new ContractEmployee("E004", "鈴木"));

        // ③ for-eachで給与計算
        for (Employee emp : employees) {
            int wage = emp.calculateDailyWage(9);
            System.out.println(emp.getName() + " の給与: " + wage + " 円");
        }
    }
}