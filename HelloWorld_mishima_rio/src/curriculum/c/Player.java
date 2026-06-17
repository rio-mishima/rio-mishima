package curriculum.c;

public class Player {

    // 手を文字に変換
    public String getHandName(int hand) {

        switch (hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "不明";
        }
    }
}