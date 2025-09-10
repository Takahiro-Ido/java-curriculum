package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		//		インスタンス化
		System.out.println(dog.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(10);
		//		インスタンス化
		System.out.println(dog2.number);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
//		System.out.println(nowDate);
		// 表示形式を指定
				DateTimeFormatter dtf1 =
					DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); // ①表示形式を設定
				String formatNowDate = dtf1.format(nowDate); // ②nowDate(現在時刻)をdtf1に入れる
				System.out.println(formatNowDate); 
	}

}
