package package1_25_sub;

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

public class Sub {
	private String name;
	private int HP;
	private int MP;
	private int Attack;
	private int Speed;
	private int Deffence;
	private String phrase;
	
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
}
