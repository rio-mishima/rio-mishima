package curriculum_A;

public class Question1 {

    public static void main(String[] args) {

        // 各型の変数宣言と初期値を設定
    	
    	// 変数byteNumの初期値を設定
        byte byteNum = 10;
        // 変数shortNumの初期値を設定
        short shortNum = 1000;

        // 変数intNumの初期値を設定
        int intNum = 0;
        // 変数longNumの初期値を設定
        long longNum = 123456789L;
        
        // 変数floatNumの初期値を設定
        float floatNum = 0.0f;
        // 変数doubleNumの初期値を設定
        double doubleNum = 0.0;
        
        // 変数letterの初期値を設定
        char letter = 'A';
        // 変数lettersの初期値を設定
        String letters = "Hello";

        // 変数isBooleanの初期値を設定
        boolean isBoolean = true;
        
        // Q1で宣言した変数に指定された値を代入
        
        // 変数byteNumに10を代入
        byteNum = 10;
        // 変数shortNumに100を代入
        shortNum = 100;
        // 変数intNumに1000を代入
        intNum = 1000;
        // 変数longNumに10000を代入
        longNum = 10000L;

        // 変数floatNumに9.5fを代入
        floatNum = 9.5f;
        // 変数doubleNumに10.5を代入
        doubleNum = 10.5;

        // 変数letterに"a"を代入
        letter = 'a';      
        // 変数lettersに"ハロー"を代入
        letters = "ハロー"; 
        
        //変数isBooleanにtrueを代入
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

