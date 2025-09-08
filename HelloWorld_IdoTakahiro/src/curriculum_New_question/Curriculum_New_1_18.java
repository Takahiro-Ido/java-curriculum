package curriculum_New_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Curriculum_New_1_18 {
	static int[] array1 = { 1, 2, 3 };
	static List<Integer> RandomNumberArray = new ArrayList<Integer>();
	static double ave;

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	public static void Hello(String h) {
		System.out.println(h);
	}

	private static void Hello2(int number) {
		System.out.println(number);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void Number1(int x, int y) {
		int number1 = x * y;
		System.out.println(number1);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	private static void array(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void Number1(double a, double b) {
		double number1 = a + b;
		System.out.println(number1);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	private static List<Integer> random(int times) {
		List<Integer> RandomNumberArray = new ArrayList<Integer>();
		for (int i = 0; i < times; i++) {
			Random random = new Random();
			int RandomNumber = random.nextInt(100) + 1;
			RandomNumberArray.add(RandomNumber);
			System.out.println(RandomNumberArray.get(i));
		}
		return RandomNumberArray;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	private static double average(List<Integer> rna) {
		double ave = 0;
		int sum = 0;
		for (int i = 0; i < rna.size(); i++) {
			sum += rna.get(i);
		}
//		for (int num: rna) {
//			sum += num;
//		}
		
		ave = (double)sum / rna.size();
		System.out.println(ave);
		return ave;

	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	private static void trueFalse(double ave) {
		if ( ave >= 50) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hello("Hello"+"JavaSE");
		Hello2(11);
		Number1(2, 5);
		Number1(2.5, 5.3);
		array(array1);
//		average(random(3));
//		double a = average(random(3));
//		trueFalse(a);
		trueFalse(average(random(3)));

	}}