package curriculum.h;

public abstract class Employee {

    // フィールド
    private String employeeId;
    private String name;

    // コンストラクタ
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    // employeeIdを取得
    public String getEmployeeId() {
        return this.employeeId;
    }

    // nameを取得
    public String getName() {
        return this.name;
    }

    // 抽象メソッド
    public abstract int calculateDailyWage(int hoursWorked);
}