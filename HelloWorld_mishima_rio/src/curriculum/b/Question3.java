package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// for文を使って1から10まで表示
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        
         // for文を使って2から20までの偶数を表示
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        
        
         // for文を使って10から1までカウントダウン
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        
        
        int sum = 0;

        // for文を使って1から100まで加算
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        // 合計を表示
        System.out.println("合計: " + sum);
        
        
         // 三角形を出力
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 改行
            System.out.println();
        }
        
        
        int i = 1;

        // while文を使って1から10まで表示
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
        
        i = 2;

        // while文を使って2から20までの偶数を表示
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
        
        
        // 10から1までカウントダウン
        i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        
        
        // 1から100までの合計
        i = 1;
        sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("合計: " + sum);
        
        
         // 0が入力されるまで繰り返す
        int input;

        while (true) {
            System.out.print("数値を入力してください（0で終了）: ");
            input = Integer.parseInt(sc.nextLine());

            if (input == 0) {
                System.out.println("終了しました");
                break;
            }
        }
        
        
        // 九九を指定フォーマットで表示
        for (int a = 1; a <= 9; a++) {

            for (int b = 1; b <= 9; b++) {

        // 01 * 01 = 01 のように表示
            System.out.printf("%02d * %02d = %02d", a, b, a * b);

        // 最後以外は区切りを表示
            if (b != 9) {
                System.out.print(" || ");
                }
            }

            // 段ごとに改行
            System.out.println();
        }
        
        
        // 商品在庫

        Random rand = new Random();

        System.out.print("商品名を「、」区切りで入力してください: ");
        String productInput = sc.nextLine();

        // 「、」で分割
        String[] products = productInput.split("、");

        // テレビ・ディスプレイ用（合計11固定）
        int tvStock = rand.nextInt(12); // 0〜11
        int displayStock = 11 - tvStock;

        // 拡張for文
        for (String product : products) {

            product = product.trim();

            switch (product) {

                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":

                    int stock = rand.nextInt(12);
                    System.out.println(product + "の残り台数は " + stock + "台です");
                    break;

                // テレビとディスプレイをまとめる
                case "テレビ":
                case "ディスプレイ":

                    // 条件演算子
                    int result = product.equals("テレビ") ? tvStock : displayStock;

                    System.out.println(product + "の残り台数は " + result + "台です");
                    break;

                default:
                    System.out.println("『 " + product + " 』は指定の商品ではありません");
                    break;
            }
        }
        
        sc.close();

	}

}
