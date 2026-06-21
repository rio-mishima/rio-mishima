package curriculum.c;

import java.util.Random;

public class CPU {

    // Randomをフィールドとして保持
    private Random random = new Random();

    public int getHand() {
        return random.nextInt(3);
    }
}