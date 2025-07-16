package package_B;

import java.util.HashMap;
import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {

		System.out.print("生徒の人数を入力してください :");
		Scanner scanner = new Scanner(System.in);
		String students = scanner.next();
		int studentNo = Integer.parseInt(students);

		int mathSum = 0;
		int scienceSum = 0;
		int socialstudiesSum = 0;
		int englishSum = 0;
		double mathAverage = 0f;
		double socialstudiesAverage = 0f;
		double scienceAverage = 0f;
		double englishAverage = 0f;
		HashMap<String, Integer> score = new HashMap<String, Integer>();

		for (int i = 1; i <= studentNo; i++) {
			System.out.print(i + "人目の『数学』の点数を入力してください :");
			int mathScore = scanner.nextInt();
			score.put(i + "数学", mathScore);

			System.out.print(i + "人目の『理科』の点数を入力してください :");
			int scienceScore = scanner.nextInt();
			score.put(i + "理科", scienceScore);

			System.out.print(i + "人目の『社会』の点数を入力してください :");
			int socialStudiesScore = scanner.nextInt();
			score.put(i + "社会", socialStudiesScore);

			System.out.print(i + "人目の『英語』の点数を入力してください :");
			int englishScore = scanner.nextInt();
			score.put(i + "英語", englishScore);
		}

		for (int j = 1; j <= studentNo; j++) {
			double average = (score.get(j + "数学") + score.get(j + "理科") + score.get(j + "社会") + score.get(j + "英語"))
					/ 4;
			System.out.print(j + "人目の平均点は" + String.format("%.1f", average) + "点です。");
		}
		for (int k = 1; k <= studentNo; k++) {
			mathSum += score.get(k + "数学");
			mathAverage = mathSum / k;
			scienceSum += score.get(k + "理科");
			scienceAverage = scienceSum / k;
			socialstudiesSum += score.get(k + "社会");
			socialstudiesAverage = socialstudiesSum / k;
			englishSum += score.get(k + "英語");
			englishAverage = englishSum / k;
		}

		System.out.print("数学の平均点は" + String.format("%.1f", mathAverage) + "点です。");
		System.out.print("理科の平均点は" + String.format("%.1f", scienceAverage) + "点です。");
		System.out.print("社会の平均点は" + String.format("%.1f", socialstudiesAverage) + "点です。");
		System.out.print("英語の平均点は" + String.format("%.1f", englishAverage) + "点です。");
		System.out.print("全体の平均点は" + String.format("%.1f", ((mathAverage+scienceAverage+socialstudiesAverage+englishAverage)/4)) + "点です。");

		scanner.close();

	}
}
