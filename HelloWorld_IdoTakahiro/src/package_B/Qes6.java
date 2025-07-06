package package_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		
//		コンソールに出力して「、」ごとに要素をとる
		Scanner scanner = new Scanner(System.in);
		String searchWords = scanner.next();
		String[] searchWordsAry = searchWords.split("、");
		
        
        for (int i = 0; i < searchWordsAry.length; i++){
        	
        	switch(searchWordsAry[i]) {
        	
        	case "パソコン":
        	case "冷蔵庫":
        	case "洗濯機":
        	case "扇風機":
        	case "加湿器":
        	case "テレビ":
        	case "ディスプレイ":
        		
    		Random random = new Random();
            int Stock = random.nextInt(11);
        	  System.out.println(searchWordsAry[i]+"の残り台数は"+Stock+"台です。");
        	
        	 break;
        	
        	default:
        		System.out.println("『"+searchWordsAry[i]+"』は指定の商品ではありません。");
        	
        	}
        }

	}
}
