package package_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();	
			boolean flag = false;
			int count = 0;
			
			do {

				if (name.length() == 0) {
					System.out.print("名前を入力してください。");
				} else if (name.length() > 10) {
					System.out.print("10文字以内にしてください。");
				} else if (!name.matches("^[0-9a-zA-Z]+$")) {
					System.out.print("半角英数字のみで名前を入力してください。");
				} else {
					System.out.print("入力した「" + name + "」を登録しました。");
					flag = true;
				}
			} while (flag ==true);
					do {
						Random random = new Random();
						int playerRandomNumber = random.nextInt(3); // 1~3までのランダムな数字を出力
						Random random2 = new Random();
						int cpuRandomNumber = random2.nextInt(3); // 1~3までのランダムな数字を出力
						flag = false;

						if (playerRandomNumber == 0 && cpuRandomNumber == 0) {
							System.out.print(name + "の手は「グー」");
							System.out.print("相手の手は「グー」");
							System.out.print("DRAW あいこ もう1回しましょう！");// あいこ
							count++;
						} else if (playerRandomNumber == 1 && cpuRandomNumber == 1) {
							System.out.print(name + "の手は「チョキ」");
							System.out.print("相手の手は「チョキ」");
							System.out.print("DRAW あいこ もう1回しましょう！");// あいこ
							count++;
						} else if (playerRandomNumber == 2 && cpuRandomNumber == 2) {
							System.out.print(name + "の手は「パー」");
							System.out.print("相手の手は「パー」");
							System.out.print("DRAW あいこ もう1回しましょう！");// あいこ
							count++;
						} else if ((playerRandomNumber == 0 && cpuRandomNumber == 2)) {
							System.out.print(name + "の手は「グー」");
							System.out.print("相手の手は「パー」");
							System.out.print("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！"); // 負け
							count++;
						} else if ((playerRandomNumber == 1 && cpuRandomNumber == 0)) {
							System.out.print(name + "の手は「チョキ」");
							System.out.print("相手の手は「グー」");
							System.out.print("俺の勝ち！たかが、じゃんけん、そう思ってないですか？それやったら次も俺が勝ちますよ。"); // 負け
							count++;
						} else if ((playerRandomNumber == 2 && cpuRandomNumber == 1)) {
							System.out.print(name + "の手は「チョキ」");
							System.out.print("相手の手は「グー」");
							System.out.print("俺の勝ち！何で負けたか、明日まで考えといてください。そしたら、何かが見えてくるはずです。"); // 負け
							count++;
						} else if ((playerRandomNumber == 0 && cpuRandomNumber == 1)) {
							System.out.print(name + "の手は「グー」");
							System.out.print("相手の手は「チョキ」");
							System.out.print("やるやん。次は俺にリベンジさせて。"); // 勝ち
							count++;
							System.out.print("勝つまでにかかった合計回数は" + count + "回です。");
							flag = true;
							break;
						} else if ((playerRandomNumber == 1 && cpuRandomNumber == 2)) {
							System.out.print(name + "の手は「チョキ」");
							System.out.print("相手の手は「パー」");
							System.out.print("やるやん。次は俺にリベンジさせて。"); // 勝ち
							count++;
							System.out.print("勝つまでにかかった合計回数は" + count + "回です。");
							flag = true;
							break;
						} else if ((playerRandomNumber == 2 && cpuRandomNumber == 0)) {
							System.out.print(name + "の手は「パー」");
							System.out.print("相手の手は「グー」");
							System.out.print("やるやん。次は俺にリベンジさせて。"); // 勝ち
							count++;
							System.out.print("勝つまでにかかった合計回数は" + count + "回です。");
							flag = true;
							break;
						}
					} while (flag == true);

			scanner.close();
		}
}