package day06.constant;

/*
 * [[ ��� ]] 
 *	ó�� �Ҵ�� �� ������� �ʴ´�.
 *	final ����� ��� 
 *	���� �빮�ڷ� �����Ѵ�.
 * 
 */

public class MainClass01 {
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		// ���� ������
		int r = 10;
		
		// ���� ����
		// PI = 3.14; ��� ����Ұ� (������ ����)
		double area = PI * r * r;
		System.out.println("���� ���� : " + area);
		
		area = 0;	// 0���� �ʱ�ȭ
		
		area = Math.PI * Math.pow(r, 2);
		
	}
}
