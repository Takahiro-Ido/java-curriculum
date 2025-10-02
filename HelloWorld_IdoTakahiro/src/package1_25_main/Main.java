package package1_25_main;

import java.util.Random;
import java.util.Scanner;

//名前を入力したら下記がコンソールに出力されるように作ってください
//条件：数値は毎回変わるように作ってください
//	 サブクラスを使用してください
//	 スーパークラスを使用してください
//	 getterとsetterを使用してください
//	 packageを2つ作ってメインと処理を分けてください
//	 命名する場合は規則にのっとってください
//	 コンストラクタを使用してください
//
//こんにちは 「 名前 」 さん
//ステータス
//HP：849
//MP：862
//攻撃力：375
//素早さ：937
//防御力：24
//
//さあ冒険に出かけよう！

public class Main {
	private String name;
	private int HP;
	private int MP;
	private int Attack;
	private int Speed;
	private int Deffence;
	private String phrase;
	private int randomHP;
	private int randomMP;
	private int randomAttack;
	private int randomSpeed;
	private int randomDeffence;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int MP) {
		this.MP = MP;
	}

	public int getAttack() {
		return Attack;
	}

	public void setAttack(int Attack) {
		this.Attack = Attack;
	}

	public int getDeffence() {
		return Deffence;
	}

	public void setDeffence(int Deffence) {
		this.Deffence = Deffence;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	public int getRandomHP(int randomHP) {
		return randomHP;
	}

	public void setRandomHP(int randomHP) {
		this.randomHP = randomHP;
	}

	public int getRandomMP(int randomMP) {
		return randomMP;
	}

	public void setRandomMP(int randomMP) {
		this.randomMP = randomMP;
	}

	public int getRandomAttack(int randomAttack) {
		return randomAttack;
	}

	public void setRandomAttack(int randomAttack) {
		this.randomAttack = randomAttack;
	}

	public int getRandomSpeed(int randomSpeed) {
		return randomSpeed;
	}

	public void setRandomSpeed(int randomSpeed) {
		this.randomSpeed = randomSpeed;
	}

	public int getRandomDeffence(int randomDeffence) {
		return randomDeffence;
	}

	public void setRandomDeffence(int randomDeffence) {
		this.randomDeffence = randomDeffence;
	}

	public Main() {
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();

		Random random = new Random();
		randomHP = random.nextInt(999);
		randomMP = random.nextInt(999);
		randomAttack = random.nextInt(999);
		randomSpeed = random.nextInt(999);
		randomDeffence = random.nextInt(999);

		setName(name);
		setHP(randomHP);
		setMP(randomMP);
		setAttack(randomAttack);
		setSpeed(randomSpeed);
		setDeffence(randomDeffence);

		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHP());
		System.out.println("MP：" + getMP());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDeffence());
		scanner.close();

	}

}







//	元々使っていたやつ
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		
//		Random random = new Random();
//		int randomHP = random.nextInt(999);
//		int randomMP = random.nextInt(999);
//		int randomAttack = random.nextInt(999);
//		int randomSpeed = random.nextInt(999);
//		int randomDeffence = random.nextInt(999);
//		
//		Sub sub = new Sub();
//		
//	
//		sub.setName(name);
//		sub.setHP(randomHP);
//		sub.setMP(randomMP);
//		sub.setAttack(randomAttack);
//		sub.setSpeed(randomSpeed);
//		sub.setDeffence(randomDeffence);
//		
//		
//		System.out.println("こんにちは「" + sub.getName()+"」さん");
//		System.out.println("ステータス");
//		System.out.println("HP：" + sub.getHP());
//		System.out.println("MP：" + sub.getMP());
//		System.out.println("攻撃力：" + sub.getAttack());
//		System.out.println("素早さ：" + sub.getSpeed());
//		System.out.println("防御力：" + sub.getDeffence());
//		scanner.close();
//
//	}