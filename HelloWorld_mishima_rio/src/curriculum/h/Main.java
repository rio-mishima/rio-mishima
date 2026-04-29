package curriculum.h;

public class Main {

    public static void main(String[] args) {

        // 正社員
        FullTimeEmployee full = new FullTimeEmployee("", "");
        // パート
        PartTimeEmployee part = new PartTimeEmployee("", "");

        // 9時間勤務の給与
        int fullWage = full.calculateDailyWage(9);
        int partWage = part.calculateDailyWage(9);

        // 出力
        System.out.println("正社員の給与: " + fullWage + " 円");
        System.out.println("パート社員の給与: " + partWage + " 円");
    }
}