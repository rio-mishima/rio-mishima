package curriculum.b;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int 型変数 scoreに 75 を代入
        int score = 75;

        // scoreが 60 以上なら"合格です！”と表示
        if (score >= 60) {
            System.out.println("合格です！");
        }
        
        
        // int 型変数 age に 25 を代入
        int age = 25;

        // age が 20 以上 30 以下なら "適正年齢です"と表示
        // それ以外の場合は"対象外です" と表示
        if (age >= 20 && age <= 30) {
            System.out.println("適正年齢です");
        } else {
            System.out.println("対象外です");
        }
        
        
        // 18 を代入
        age = 18;

        //age が 20 以上なら "成人です" と表示 
        //age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
        //age が 12 以下なら "子供です" と表示
        if (age >= 20) {
            System.out.println("成人です");
        } else if (age >= 13 && age <= 19) {
            System.out.println("ティーンエイジャーです");
        } else {
            System.out.println("子供です");
        }
        
        
        //int 型変数 x, y, z に 30, 15, 50 を代入
        int x = 30;
        int y = 15;
        int z = 50;
        
        //一番大きい数値を判定し表示
        if (x >= y && x >= z) {
            System.out.println("一番大きい数値は " + x + " です");
        } else if (y >= x && y >= z) {
            System.out.println("一番大きい数値は " + y + " です");
        } else {
            System.out.println("一番大きい数値は " + z + " です");
        }
        
        
        System.out.print("数値を入力してください: ");
        int num = Integer.parseInt(sc.nextLine());
        
        // num の値が 0 より大きければ "正の数です" と表示
        // num の値が 0 なら "0 です" と表示
        // num の値が 0 より小さければ "負の数です" と表示
        if (num > 0) {
            System.out.println("正数です");
        } else if (num == 0) {
            System.out.println("0です");
        } else {
            System.out.println("負数です");
        }
        
        
        System.out.print("数値を入力してください（偶数・奇数判定用）: ");
        int value = Integer.parseInt(sc.nextLine());

        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
        
        
        System.out.print("スコアを入力してください（0〜100）: ");
        int score1 = Integer.parseInt(sc.nextLine());
        
        //90 以上なら "優"
        //70 以上なら "良"
        //50 以上なら "可"
        //50 未満なら "不可" を表示
        if (score1 >= 90) {
            System.out.println("優");
        } else if (score1 >= 70) {
            System.out.println("良");
        } else if (score1 >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        System.out.print("文字列を入力してください: ");
        String input = sc.nextLine();

        //コンソール入力が null または空文字（""）のときに「入力が無効です」と表示する処理

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力内容: " + input);
        }
        
        
        System.out.print("曜日番号を入力してください（1〜7）: ");
        //int 型変数 day を用意
        int day = Integer.parseInt(sc.nextLine());
        
        //day の値に応じて曜日を表示
        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            case 7:
                System.out.println("日曜日");
                break;
            default:
                System.out.println("無効の入力です");
                break;
        }
        
        
        System.out.print("月を入力してください（1〜12）: ");
        //int 型の変数 month を用意
        int month = Integer.parseInt(sc.nextLine());
        
        //month の値に応じて季節を表示
        switch (month) {
            case 12: case 1: case 2:
                System.out.println("冬");
                break;

            case 3: case 4: case 5:
                System.out.println("春");
                break;

            case 6: case 7: case 8:
                System.out.println("夏");
                break;

            case 9: case 10: case 11:
                System.out.println("秋");
                break;

            default:
                System.out.println("無効な月です");
                break;
        }
        
        sc.close();
    }
}
