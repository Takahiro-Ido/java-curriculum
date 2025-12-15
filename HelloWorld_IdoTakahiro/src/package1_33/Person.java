package package1_33;

class Person extends Vehicle{
	static int count = 0;
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private int weight;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	Person(String firstName, int age, double height, int weight) {
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	Person(String firstName, String lastName, int age, double height, int weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	public void buy(Car car) {
		car.setOwner(this.fullName());
		 System.out.println(car.getOwner() + "が購入しました");
	}
	
	public  void buy(Bicycle bicycle) {
		 bicycle.setOwner(this.fullName());
		 System.out.println(bicycle.getOwner() + "が購入しました");
		}
}
