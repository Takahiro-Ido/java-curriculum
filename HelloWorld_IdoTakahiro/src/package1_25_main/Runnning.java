package package1_25_main;

import java.util.Scanner;

import package1_25_sub.Sub;

public class Runnning {

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();

		Sub sub = new Sub(name);
		sub.random();
		sub.SOP();
		scanner.close();

	}

}
