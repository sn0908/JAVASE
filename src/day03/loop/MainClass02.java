package day03.loop;

/*
 * 	2. do ~ while()��
 * 	 while���� ���������, �ּ� �ѹ��� ����ȴ�.
 * 
 * 	 do{
 *		�ݺ� ������ �ڵ� 
 * 	 } while(���ǹ�);
 * 
 */

public class MainClass02 {
	public static void main(String[] args) {
		int count = 0;
		
		do {
			System.out.println(count);
			count++;
		} while(count < 100);
	}
}
