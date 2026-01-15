package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		// int 型変数 scoreに 75 を代入
		int score = 75;
        
		//scoreが 60 以上なら"合格です！”と表示
        if (score >= 60) {
            System.out.println("合格です！"); 
        }
            
        //  int 型変数 intに 25 を代入 
        int age = 25;
        
        // age が 20 以上 30 以下なら "適正年齢です" と表示
        // それ以外の場合は"対象外です" と表示
        if (age >= 20 && age <= 30) {
                System.out.println("適正年齢です");
            } else {
                System.out.println("対象外です");
                
        }
                
        //18 を代入
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
        
        
        Scanner sc = new Scanner(System.in); 
    
        System.out.print("数値を入力してください: ");
        int num = sc.nextInt();
 
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
        int value = sc.nextInt();  
        
        //value が 偶数 なら "偶数です" と表示
        //value が 奇数 なら "奇数です" と表示
        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
        
        
        System.out.print("スコアを入力してください（0〜100）: ");
        int score1 = sc.nextInt();  
        
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
        
        //コンソール入力が null または空文字（""）のときに「入力が無効です」と表示する処理
        try (Scanner scanner = new Scanner(System.in)) { 
            String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力内容: " + input);
            }
        } 

    } 
}     