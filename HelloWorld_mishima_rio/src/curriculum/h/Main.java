package curriculum.h;

public class Main {

    public static void main(String[] args) {

        // 正社員
        FullTimeEmployee full = new FullTimeEmployee("E001", "佐藤太郎");

        // パート社員
        PartTimeEmployee part = new PartTimeEmployee("E002", "田中花子");

        // 9時間勤務の給与
        int fullWage = full.calculateDailyWage(9);
        int partWage = part.calculateDailyWage(9);

        // getterを使って出力
        System.out.println("社員ID: " + full.getEmployeeId()
                + ", 名前: " + full.getName());
        System.out.println("正社員の給与: " + fullWage + " 円");

        System.out.println("社員ID: " + part.getEmployeeId()
                + ", 名前: " + part.getName());
        System.out.println("パート社員の給与: " + partWage + " 円");
    }
}