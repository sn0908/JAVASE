package day03.loop;

public class HomeWork01 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {
			System.out.print(i+": ");
			for(int j = 0; j < 7; j++) {
				if(i < 3 - j ) {
					System.out.print(" ");
				} else if(j - i > 3) {
					System.out.print(" ");
				} else if(i - j > 3) {
					System.out.print(" ");
				} else if(i + j > 9) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				} 

			}
			System.out.println(); 	//°³Çà
		}
					
	}
}
