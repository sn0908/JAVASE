package day03.conditional;

/*
 * 	[[ ���ǹ� ]]
 * 	 �־��� ���ǽ��� ����� ���� ������ ����� �����ϵ��� �����ϴ� ��ɹ�
 * 
 * 	 if�� ����
 * 	
 * 	 if(���ǽ�){
 * 		 ���ǽ� true�� �� �����ɹ�
 * 	 }
 * 
 *   if(���ǽ�)
 *   	 ���ǽ� true�� �� �����ɹ� (��ɹ��� ����;�� �� �߰�ȣ ����)
 *   
 * 	 if(���ǽ�1) {
 * 		���ǽ�1 true�� �� �����ɹ�
 *   } else if(���ǽ�2) {
 *   	���ǽ�1 false, ���ǽ�2 true�� �� �����ɹ�
 * 	 } else {
 * 		��� ���ǽ��� false�� �� �����ɹ�
 * 	 }
 */

public class MainClass01 {
	public static void main(String[] args) {
		int num = 11;
		if(num%2 == 0)
			System.out.println("num�� ¦���Դϴ�.");
		
		if(num%2 !=0)
			System.out.println("num�� Ȧ���Դϴ�.");
		
		if(num%2 == 0) 
			System.out.println("num�� ¦���Դϴ�.");
		else
			System.out.println("num�� Ȧ���Դϴ�.");
		
		double num2 = 13.3;
		if(num2%3 == 0) {
			System.out.println("num2�� �������� 0�Դϴ�.");
		} else if(num2%3 == 1) {
			System.out.println("num2�� �������� 1�Դϴ�.");
		} else if(num2%3 == 2) {
			System.out.println("num2�� �������� 2�Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		
	}
	

}
