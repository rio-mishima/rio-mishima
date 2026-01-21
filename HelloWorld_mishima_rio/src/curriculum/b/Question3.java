package curriculum.b;

public class Question3 {

	public static void main(String[] args) {
	
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
	}

}
