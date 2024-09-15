package package_A;

public class curriculum_1_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		下記9個をローカル変数として宣言のみしてください
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean boo;
		
//		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000';
		str = "string";
		boo = false;
		
//		初期化をしたそれぞれの変数に下記の値を代入してください
		b = 10;
		s = 100;
		i = 1000;
		l = 10000;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "ハロー";
		boo = true;
		
//		下記の通りにコンソール出力されるようにしてください
//		上記で作成した変数を必ず使用すること

		System.out.print(b);
		System.out.print(f+d);
		System.out.print(c+str+boo);
		System.out.print(b+s+i+l+f+d);
		System.out.print(b*s*i*l);
		System.out.print(d/s);
		System.out.print(b-s);
		
		
//		次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
//		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。

		int num= 20;
		int num1 = 23;
		System.out.println("ハローJAVA"+(num+num1));
		
//		『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
//		ローカル変数に代入し○○に入れてください
//		『山田太郎 18歳 170.5cm 62.2kg 寿司』
//
//		↓↓format↓↓
//		「初めまして○○です」
//		「年齢は○○歳です」
//		「身長は○○cmです」
//		「体重は○○kgです」
//		「好きな食べ物は○○です」

		String name = "山田　太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favoriteFood = "寿司";
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"です");
		System.out.println("好きな食べ物は"+favoriteFood+"です");
		
//		6で作成した自己紹介に続いてBMIが出力されるようにしてください
//		「BMIは○○です」
//		ただし計算は数値を直書きせず、全て変数を使ってすること

		System.out.println("BMIは"+weight/(height*height)+"です");
		
//		6で宣言した変数に再代入し下記の通りコンソールに出力してください
//		　初めまして鈴木一郎です
//		　年齢は24歳です
//		　身長168.5cmです
//		　体重は64.2kgです
//		　好きな食べ物はオムライスです
//		　BMIは22.6です

		name = "鈴木　一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favoriteFood = "オムライス";
		
//		8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
//		　初めまして鈴木一郎です
//		　年齢は48歳です
//		　身長337.0cmです
//		　体重は128.4kgです
//		　好きな食べ物はオムライスです
//		　BMIは11.31です

		age = age+age;
		height = height+height;
		weight = weight+weight;
		

		//}8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		String ageResult = "string";
		ageResult = age >= 25? "true" : "false";
		System.out.println(ageResult);

		//8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		String age2 = String.valueOf(age);
		String height2 = String.valueOf(height);
		String weight2 = String.valueOf(weight);
		
		System.out.println(age2+height2+weight2);

		//11で変換した【年齢・身長】を整数型に変換して出力してください
		int age3 = Integer.parseInt(age2);
		double height3 = Double.parseDouble(height2);
		int height4 = (int) height3;
		System.out.println(age3);
		System.out.println(height4);


		//12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//ただしif文は使わないでください
		String ageHeightResult = age3 == 25?  "true": (height4 >= 160)? "true":"false"; 
		System.out.println(ageHeightResult);

	}
}
