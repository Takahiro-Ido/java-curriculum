package package1_25_sub;

import java.util.Random;

//名前を入力したら下記がコンソールに出力されるように作ってください
//条件：数値は毎回変わるように作ってください
// 	 サブクラスを使用してください
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
public class Sub extends Main {
	private int MP;
	private int Attack;
	private int Speed;
	private int Deffence;

	public Sub(String name) {
		super(name);
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

	public void random() {
		Random random = new Random();
		super.random();
		MP = random.nextInt(999);
		Attack = random.nextInt(999);
		Speed = random.nextInt(999);
		Deffence = random.nextInt(999);

		setMP(MP);
		setAttack(Attack);
		setSpeed(Speed);
		setDeffence(Deffence);

	}

	public void SOP() {
		super.SOP();
		System.out.println("MP：" + getMP());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDeffence());
		System.out.println("さあ冒険に出かけよう！");
	}

}
