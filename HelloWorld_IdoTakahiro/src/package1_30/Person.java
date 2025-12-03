package package1_30;

class Person {
	// インスタンスフィールドを定義

	private String name;
	private int age;
	private double height;
	private double weight;
	private double BMI;
	static int counter = 0;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBMI() {
		return BMI;
	}

	public void setBMI(double BMI) {
		this.BMI = BMI;
	}

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		counter++;

	}

	public double bmi() {
		double bmi = weight / (height * height);
		return bmi;

	}

	public void print() {
		System.out.println("名前は" + this.getName() + "です。");
		System.out.println("年は" + this.getAge() + "です。");
		System.out.println("BMIは" + this.bmi() + "です。");

	}

	public void count() {
		System.out.println("合計人数は" + counter + "人です。");
	}
}
