package curriculum.g;

public class Main {

    public static void main(String[] args) {

        // Employeeオブジェクトを生成
        Employee emp = new Employee();

        // setメソッドで値を設定
        emp.setEmployeeId("E002");
        emp.setName("田中花子");

        // getメソッドで取得して出力
        System.out.println("社員ID: " + emp.getEmployeeId() + ", 名前: " + emp.getName());
    }
}