package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			
	    // int型の配列を作成し、1, 2, 3, 4, 5 を格納
        int[] numbers = {1, 2, 3, 4, 5};

        // 配列の全要素を順番に表示
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // int型の配列 {10, 20, 30, 40, 50} を作成
        int[] numbers1 = {10, 20, 30, 40, 50};

        // 配列の要素を逆順に表示
        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.println(numbers1[i]);
        }
        
        
        //  配列 {3,5,7,9,11} の合計を求める
        int[] numbers2 = {3, 5, 7, 9, 11};

        int total = 0;

        for (int i = 0; i < numbers2.length; i++) {
            total += numbers2[i];
        }

        System.out.println("合計値: " + total);
        
        
        //　配列 {12, 7, 9, 21, 5, 18} の最大値と最小値を求める
        int[] numbers3 = {12, 7, 9, 21, 5, 18};

        int max = numbers3[0];
        int min = numbers3[0];

        for (int i = 1; i < numbers3.length; i++) {
            if (numbers3[i] > max) {
                max = numbers3[i];
            }
            if (numbers3[i] < min) {
                min = numbers3[i];
            }
        }

        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
        
        
        // 配列の要素を2倍にして表示
        int[] numbers4 = {1, 2, 3, 4, 5};

        // まず配列の値を2倍にする
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = numbers4[i] * 2;
        }

        // 拡張for文で表示
        for (int value : numbers4) {
            System.out.println(value);
        }
        
        
        // 入力値が配列に含まれているか判定 
        int[] numbers5 = {4, 7, 10, 15, 20};

        System.out.print("数値を入力してください: ");
        int target = Integer.parseInt(sc.nextLine());

        boolean found = false;

        for (int n : numbers5) {
            if (n == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("「" + target + "」は配列に含まれています");
        } else {
            System.out.println("「" + target + "」は配列に含まれていません");
        }
             
        sc.close();

	}

}
