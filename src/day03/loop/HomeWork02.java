package day03.loop;

public class HomeWork02 {
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i * 7 + j + 1;
				if (array[i][j] < 10) {
					System.out.print(" " + array[i][j] + "[" + i + "]" + "[" + j + "] ");
				} else {
					System.out.print(array[i][j] + "[" + i + "]" + "[" + j + "] ");
				}
				System.out.println();
			} // for j

			System.out.println();
		} // for i
		
		for (int i = 0; i < 13; i++) {
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(i + ":");

			// ¼÷Á¦ÄÚµå
			if(i < 7) {
				for(int j = 0; j < i + 1; j++) {
					if(i % 2 < 1) { // ÀÎµ¦½º ¹øÈ£ Â¦¼öÀÌ¸ç, 0µµ Æ÷ÇÔ
						System.out.print(array[i-j][j] + " ");
					} else {
						System.out.print(array[j][i-j] + " ");
					}
				}
			} else {
				for(int j=0; j < 13 - i; j++) {
					if (i % 2 < 1) {
						System.out.println("@");
					} else {
						System.out.println("@");
					}
				}
				
				System.out.println();
			} 
		}

	}
}
