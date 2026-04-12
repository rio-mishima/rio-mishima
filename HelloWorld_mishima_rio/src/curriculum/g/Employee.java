package curriculum.g;

public class Employee {

    // プライベートフィールド
    private String employeeId;
    private String name;

    // employeeId を設定する
    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    // employeeId を取得する
    public String getEmployeeId() {
        return this.employeeId;
    }

    // name を設定する
    public void setName(String name) {
        this.name = name;
    }

    // name を取得する
    public String getName() {
        return this.name;
    }
}