package package1_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import package1_22_2.Sub;

public class Main {

	public static void main(String[] args) {
		//		下記がコンソールに出力されるように作成してください
		//		
		//		こんにちは！ここは日本です！
		//		この寿司はうまい
		//		寿司は和食です

		Sub sub = new Sub();
		System.out.println(sub.greeting);
		System.out.println(sub.sushi1);
		System.out.println(sub.sushi2);

		//		今の現在日時は2023/03/09 10:23:39です
		LocalDateTime nowDate = LocalDateTime.now();
		// 表示形式を指定
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd H:mm:ss"); // ①表示形式を設定
		String formatNowDate = dtf1.format(nowDate); // ②nowDate(現在時刻)をdtf1に入れる
		System.out.println("今の現在日時は" + formatNowDate + "です");

		//
		//	【条件】
		//		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		//		・適切なファイルにフィールドで変数を必要な数作ってください。
		//		・thisを使って作成してください。
		//		・日時は今日の日付を取得してください。

	}

}
