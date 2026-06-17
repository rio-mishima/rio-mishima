package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("プレイヤー名を入力してください：");
        String playerName = scanner.nextLine();

        // プレイヤーのステータスをランダム設定
        Character player = new Character(
                playerName,
                random.nextInt(51) + 50, // HP 50～100
                random.nextInt(11) + 10, // AT 10～20
                random.nextInt(11) + 1   // SP 1～11
        );

        // Daemonのステータスを読み込む
        Character daemon = loadDaemon();

        if (daemon == null) {
            System.out.println("Daemonの読み込みに失敗しました。");
            scanner.close();
            return;
        }

        try {

            FileWriter writer =
                    new FileWriter("src/curriculum/d/battle_log.txt");

            writer.write("=== Battle Start ===\n");
            writer.write(player.getName() + " VS " + daemon.getName() + "\n\n");

            Character first;
            Character second;

            // 先攻決定
            if (player.getSp() > daemon.getSp()) {
                first = player;
                second = daemon;
            } else if (player.getSp() < daemon.getSp()) {
                first = daemon;
                second = player;
            } else {
                if (random.nextBoolean()) {
                    first = player;
                    second = daemon;
                } else {
                    first = daemon;
                    second = player;
                }
            }

            writer.write("先攻：" + first.getName() + "\n\n");
            System.out.println("先攻：" + first.getName());

            // バトル開始
            while (player.isAlive() && daemon.isAlive()) {

                // 先攻の攻撃
                second.damage(first.getAt());

                String attack1 =
                        first.getName()
                        + " の攻撃！ "
                        + second.getName()
                        + " に "
                        + first.getAt()
                        + " ダメージ";

                writer.write(attack1 + "\n");
                System.out.println(attack1);

                if (!second.isAlive()) {
                    break;
                }

                // 後攻の攻撃
                first.damage(second.getAt());

                String attack2 =
                        second.getName()
                        + " の攻撃！ "
                        + first.getName()
                        + " に "
                        + second.getAt()
                        + " ダメージ";

                writer.write(attack2 + "\n");
                System.out.println(attack2);
            }

            writer.write("\n=== Battle Result ===\n");

            System.out.println();

            if (player.isAlive()) {

                writer.write(player.getName() + " の勝利！\n");
                System.out.println(player.getName() + " の勝利！");

            } else {

                writer.write(daemon.getName() + " の勝利！\n");
                System.out.println(daemon.getName() + " の勝利！");
            }

            writer.close();

            System.out.println("\nバトル終了！");
            System.out.println("battle_log.txt を確認してください。");

        } catch (IOException e) {

            e.printStackTrace();
        }

        scanner.close();
    }

    // Daemonの情報をテキストファイルから読み込む
    public static Character loadDaemon() {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("src/curriculum/d/daemon_status.txt"));

            String name = br.readLine();
            int hp = Integer.parseInt(br.readLine());
            int at = Integer.parseInt(br.readLine());
            int sp = Integer.parseInt(br.readLine());

            br.close();

            return new Character(name, hp, at, sp);

        } catch (Exception e) {

            return null;
        }
    }
}