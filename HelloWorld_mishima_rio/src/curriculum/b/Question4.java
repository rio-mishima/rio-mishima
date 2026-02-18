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
        
        
        // 2次元配列の全要素を表示 
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
        
        
        //  2次元配列の合計値を求める 
        int[][] array2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int sum2 = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 += array2[i][j];
            }
        }

        System.out.println("合計値: " + sum2);
        
        
        //  2次元配列の最大値と最小値
        int[][] array3 = {
            {12, 15, 8},
            {6, 19, 25},
            {30, 2, 10}
        };

        int max2 = array3[0][0];
        int min2 = array3[0][0];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {

                if (array3[i][j] > max2) {
                    max2 = array3[i][j];
                }

                if (array3[i][j] < min2) {
                    min2 = array3[i][j];
                }
            }
        }

        System.out.println("最大値: " + max2);
        System.out.println("最小値: " + min2);

        
        // 3次元配列の全要素を表示 
        int[][][] array4 = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                for (int k = 0; k < array4[i][j].length; k++) {
                    System.out.println(array4[i][j][k]);
                }
            }
        }

             
        sc.close();

	}

}
