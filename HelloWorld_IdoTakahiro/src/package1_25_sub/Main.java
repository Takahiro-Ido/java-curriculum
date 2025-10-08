package package1_25_sub;

import java.util.Random;

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

	public Main(String name) {
		this.name = name;

	}

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

	public void random() {
		Random random = new Random();
		HP = random.nextInt(999);

		setHP(HP);
	}

	public void SOP() {
		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHP());

	}

}
