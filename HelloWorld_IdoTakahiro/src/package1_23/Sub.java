package package1_23;

public class Sub {
	//	下記がコンソールに出力されるように作成してください
	// 	※thisとsetterとgetterとフィールドを使ってください
	// 	
	//  	動物名：ライオン
	//	体長：2.1m
	//	速度：80km/h

	private String name;
	private double height;
	private int speed;

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getSpeed() {
		return speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
