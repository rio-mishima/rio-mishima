package curriculum.b;

public class Animal {
	
	// フィールド（メンバ変数）
    private String name;
    private double length;
    private int speed;

    // setter（値をセット）
    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter（値を取得）
    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public int getSpeed() {
        return this.speed;
    }
}

