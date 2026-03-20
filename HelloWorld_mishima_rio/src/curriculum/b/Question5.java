package curriculum.b;

public class Question5 {

    public static void main(String[] args) {

        // helloWorldメソッド
        helloWorld();

        // doubleValueメソッド
        int num = 10;
        int result = doubleValue(num);
        System.out.println(num + " を 2 倍すると " + result + " です。");

        // isEvenメソッド
        int num1 = 7;
        int num2 = 10;

        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }

        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }
    }

    // 引数なし・戻り値なし
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    // 引数：int num / 戻り値：numの2倍
    public static int doubleValue(int num) {
        return num * 2;
    }

    // 引数：int num
    // 偶数なら true、奇数なら false
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}