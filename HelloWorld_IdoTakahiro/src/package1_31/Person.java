package package1_31;

class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private static int count = 0;
	
	public int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		setCount(getCount() + 1);
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	public void printCount() {
		System.out.println("合計人数は" + getCount() + "人です");
	}

	
}
