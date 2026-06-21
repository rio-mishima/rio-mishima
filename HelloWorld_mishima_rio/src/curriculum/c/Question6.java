package curriculum.c;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player();
        CPU cpu = new CPU();

        while (true) {

            System.out.print("グー(0), チョキ(1), パー(2) を入力：");

            // 入力チェック
            if (!scanner.hasNextInt()) {
                System.out.println("0～2の数字を入力してください。");
                scanner.next(); // 不正入力を読み飛ばす
                continue;
            }

            int input = scanner.nextInt();

            // 範囲チェック
            if (input < 0 || input > 2) {
                System.out.println("0～2の数字を入力してください。");
                continue;
            }

            player.setHand(input);

            int cpuHand = cpu.getHand();

            System.out.println("あなたの手：" + convertHand(player.getHand()));
            System.out.println("CPUの手：" + convertHand(cpuHand));

            int result = judge(player.getHand(), cpuHand);

            if (result == 0) {
                System.out.println("あいこです！");
            } else if (result == 1) {
                System.out.println("あなたの勝ち！");
                break;
            } else {
                System.out.println("あなたの負け！");
            }
        }

        scanner.close();
    }

    // 手を文字列に変換
    public static String convertHand(int hand) {

        switch (hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "";
        }
    }

    // 勝敗判定
    public static int judge(int playerHand, int cpuHand) {

        if (playerHand == cpuHand) {
            return 0; // あいこ
        }

        if ((playerHand == 0 && cpuHand == 1)
                || (playerHand == 1 && cpuHand == 2)
                || (playerHand == 2 && cpuHand == 0)) {

            return 1; // 勝ち
        }

        return -1; // 負け
    }
}