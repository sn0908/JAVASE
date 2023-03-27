package day03.loop;

/*
  
 *  
 ** 
 ***
 ****
 *****
 ******
 *******
    
    
    
    
    
 */


public class MainClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {	
			for(int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			
			System.out.println();		//	°³Çà
		}
		
		System.out.println();
		
		for(int i = 0; i < 7; i++) {	
			System.out.print(i+": ");
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < 7; i++) {	
			System.out.print(i+": ");
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
