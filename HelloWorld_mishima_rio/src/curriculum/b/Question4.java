package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
	
		
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

	}

}
