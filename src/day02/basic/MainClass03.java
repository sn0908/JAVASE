package day02.basic;

/* 
 * [[ �⺻ �ڷ��� ]]
 * 1. ����(boolean)
 * 
 * 	- ������
 * 		boolean ������;
 * 	- ���� �� �ִ� ����
 * 		true, false �ΰ��� �� ���� ����
 * 
 * 	- 1byte
 *	 
 */

public class MainClass03 {
	public static void main(String[] args) {
		// ���� ���� �����ϱ�
		boolean isWait; 
		// ������ ������ �� �����ϱ�
		isWait = true; // boolean isWait = true;
		
		System.out.println("���� ���� �� : "+ isWait);
		
		// ���� ���� ����� ���� �����ϱ�
		boolean canRun = true;
		
		canRun = false;
		
		if(canRun) {
			System.out.println("I Can Run!");
		} else {
			System.out.println("I Can not Run!");
		}
	}
	
	
	
}
