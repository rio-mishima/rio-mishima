package curriculum.d;

public class Character {

    private String name;
    private int hp;
    private int at;
    private int sp;

    // コンストラクタ
    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAt() {
        return at;
    }

    public int getSp() {
        return sp;
    }

    // ダメージ処理
    public void damage(int attack) {
        hp -= attack;
    }

    // 生存判定
    public boolean isAlive() {
        return hp > 0;
    }
}