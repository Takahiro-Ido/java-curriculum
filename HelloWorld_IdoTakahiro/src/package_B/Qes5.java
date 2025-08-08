package package_B;

public class Qes5 {
	public static void main(String[] args) {
	for (int i = 1; i < 21; i++) {
		
		for(int j = 1; j < 21; j++) {
			if( j < 20) {
		System.out.print((String.format("%03d", j)) + "*" + (String.format("%03d", i)) + "="
				+ (String.format("%03d", j * i)) + "||");
	
		}else if( j > 19) {
				System.out.print((String.format("%03d", j)) + "*" + (String.format("%03d", i)) + "="
						+ (String.format("%03d", j * i)) + "||"+"\n");
				}
		
	}
	}
	}
}

