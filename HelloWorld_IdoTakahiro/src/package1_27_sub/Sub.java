package package1_27_sub;

import java.util.Scanner;

public class Sub {


		private String input;
		private String[] Array2;
		
		public String getInput() {
			return input;
		}

		public void setInput(String input) {
			this.input = input;
		}
		
		public String[] getArray2() {
			return Array2;
		}

		public void setArray2(String[] Array2) {
			this.Array2 = Array2;
		}

		public void scanner() {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextLine();
			scanner.close();

		}

		public void splitSysOut() {
			String[] Array1 = input.split(",");
			for (String array2 : Array1) {
				String[] Array2 = array2.split(":");
				System.out.println("動物名：" + Array2[0]);
				System.out.println("体長：" + Array2[1]);
				System.out.println("速度：" + Array2[2]);
				if ("ライオン".equals(Array2[0])) {
					System.out.println("学名：パンテラ レオ");
				} else if ("ゾウ".equals(Array2[0])) {
					System.out.println("学名：ロキソドンタ・サイクロティス");
				} else if ("パンダ".equals(Array2[0])) {
					System.out.println("学名：アイルロポダ・メラノレウカ");
				} else if ("チンパンジー".equals(Array2[0])) {
					System.out.println("学名：パン・トゥログロディテス");
				} else if ("シマウマ".equals(Array2[0])) {
					System.out.println("学名：チャップマンシマウマ");
				} else if ("インコ".equals(Array2[0])) {
					System.out.println("学名：不明");
				}

		}


		}
	}


