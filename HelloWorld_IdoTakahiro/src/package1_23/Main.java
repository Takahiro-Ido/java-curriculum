package package1_23;

public class Main {

	public static void main(String[] args) {

		Sub sub = new Sub();
		sub.setName("ライオン");
		sub.setHeight(2.1);
		sub.setSpeed(80);

		System.out.println("動物名：" + sub.getName());
		System.out.println("体長：" + sub.getHeight() + "m");
		System.out.println("速度：" + sub.getSpeed() + "km/h");
	}

}
