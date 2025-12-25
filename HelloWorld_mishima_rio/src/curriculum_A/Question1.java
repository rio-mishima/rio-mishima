package curriculum_A;

public class Question1 {

    public static void main(String[] args) {

        // 各型の変数宣言と初期値を設定
    	
    	// 変数byteNumの初期値を設定
        byte byteNum = 0;
        // 変数shortNumの初期値を設定
        short shortNum = 0;

        // 変数intNumの初期値を設定
        int intNum = 0;
        // 変数longNumの初期値を設定
        long longNum = 0L;
        
        // 変数floatNumの初期値を設定
        float floatNum = 0.0f;
        // 変数doubleNumの初期値を設定
        double doubleNum = 0.0;
        
        // 変数letterの初期値を設定
        char letter = '\u0000';
        // 変数lettersの初期値を設定
        String letters = null;

        // 変数isBooleanの初期値を設定
        boolean isBoolean = false;
        
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
        
        // Q2の値を代入した変数を用いて出力
        
        // 11110 → 10 + 100 + 1000 + 10000
        System.out.println(byteNum + shortNum + intNum + longNum);

        // 20 → 10 + 10
        System.out.println(byteNum + byteNum);

        // a ハロー true（半角スペース入れる）
        System.out.println(letter + " " + letters + " " + isBoolean);

        // 11130 → 11110 + 20
        System.out.println(byteNum +byteNum + byteNum +  shortNum + intNum + longNum );

        // 1E+10 小数点以外の数字をすべてかける
        long result = (long) byteNum * shortNum * intNum * longNum;
        System.out.println(result); 
        
        // 0.105 → 10.5 / 100
        System.out.println(doubleNum / 100);

        // -90 → 10 - 100
        System.out.println(byteNum - shortNum);
        
        
        // String型の変数 name を宣言して値を代入
        String name = "山田太郎";
        
        // name を使って出力
        System.out.println("こんにちは、" + name + "さん!");
        
        
        // int型の変数 age を宣言して値を代入
        int age = 25;

        // age を使って出力
        System.out.println("年齢: " + age + "歳");
        
        
        // 変数の宣言と代入
        int num1 = 10;
        int num2 = 5;

        // 足した結果を sum に代入
        int sum = num1 + num2;

        // 結果を出力
        System.out.println(sum);
        
        
        // 変数 score を宣言して値を代入
        int score = 80;

        // score に 20 を加える
        score = score + 20;

        // 最終スコアを出力
        System.out.println("最終スコア: " + score);
        
        
        // double型の変数を宣言して代入
        double price = 99.99;

        // int型に変換
        int intPrice = (int) price;

        // 結果を出力
        System.out.println("整数価格: " + intPrice);
        
        
        // String 型の変数に "123" を代入
        String numStr = "123";

        // String を int に変換
        int num = Integer.parseInt(numStr);

        // 変換後の値に 10 を足して出力
        System.out.println("変換後の値: " + (num + 10));
        
       
        // int 型の変数に 50 を代入
        num = 50;
        
        // int を String に変換
        String numStr1= String.valueOf(num);

        // 出力
        System.out.println("得点: " + numStr1 + "点");
        
     
    }
}

