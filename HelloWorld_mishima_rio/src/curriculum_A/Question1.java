package curriculum_A;

public class Question1 {

    public static void main(String[] args) {

        // 各型の変数宣言と初期値を設定
        byte byteNum = 10;
        short shortNum = 1000;
        int intNum = 0;
        long longNum = 123456789L;

        float floatNum = 0.0f;
        double doubleNum = 0.0;

        char letter = 'A';
        String letters = "Hello";

        boolean isBoolean = true;
        
        // Q1で宣言した変数に指定された値を代入
        byteNum = 10;
        shortNum = 100;
        intNum = 1000;
        longNum = 10000L;

        floatNum = 9.5f;
        doubleNum = 10.5;

        letter = 'a';       // charなので「'a'」
        letters = "ハロー";  // Stringなので「"ハロー"」

        isBoolean = true;

        // 変数の値を出力して確認
        System.out.println("byteNum = " + byteNum);
        System.out.println("shortNum = " + shortNum);
        System.out.println("intNum = " + intNum);
        System.out.println("longNum = " + longNum);
        System.out.println("floatNum = " + floatNum);
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("letter = " + letter);
        System.out.println("letters = " + letters);
        System.out.println("isBoolean = " + isBoolean);
    }
}

