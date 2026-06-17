package curriculum.c;

import java.util.Random;

public class CPU {

    // ランダムで手を出す
    public int getRandomHand() {

        Random random = new Random();

        return random.nextInt(3);
    }
}