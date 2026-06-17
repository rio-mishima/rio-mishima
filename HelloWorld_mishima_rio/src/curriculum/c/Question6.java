package curriculum.c;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player();
        CPU cpu = new CPU();

        boolean win = false;

        while (!win) {

            System.out.print("グー(0), チョキ(1), パー(2) を入力: ");

            int userHand = scanner.nextInt();

            int cpuHand = cpu.getRandomHand();

            System.out.println("あなたの手: " + player.getHandName(userHand));
            System.out.println("CPUの手: " + player.getHandName(cpuHand));

            // 勝敗判定
            if ((userHand == 0 && cpuHand == 1)
                    || (userHand == 1 && cpuHand == 2)
                    || (userHand == 2 && cpuHand == 0)) {

                System.out.println("あなたの勝ち！");
                win = true;

            } else if (userHand == cpuHand) {

                System.out.println("あいこです");

            } else {

                System.out.println("あなたの負け！");
            }

            System.out.println();
        }

        scanner.close();
    }
}