package package1_25_main;

import java.util.Random;
import java.util.Scanner;

import package1_25_sub.Sub;

public class Main extends Sub {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomHP = random.nextInt(999);
		int randomMP = random.nextInt(999);
		int randomAttack = random.nextInt(999);
		int randomSpeed = random.nextInt(999);
		int randomDeffence = random.nextInt(999);
		
		Sub sub = new Sub();
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		sub.setName(name);
		sub.setHP(randomHP);
		sub.setMP(randomMP);
		sub.setAttack(randomAttack);
		sub.setSpeed(randomSpeed);
		sub.setDeffence(randomDeffence);
		
		
		System.out.println("こんにちは「" + sub.getName()+"」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + sub.getHP());
		System.out.println("MP：" + sub.getMP());
		System.out.println("攻撃力：" + sub.getAttack());
		System.out.println("素早さ：" + sub.getSpeed());
		System.out.println("防御力：" + sub.getDeffence());
		

	}

}
