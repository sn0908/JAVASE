package day03.operator;

/*
 *	8. ���׿�����(���ǹ��� ���)
 *	 ���ǽ� ? ���ǽ��� ���� ��� : ���ǽ��� ������ ���
 * 
 */

public class MainClass07 {
	public static void main(String[] args) {
		int num = 10;
		String result = num > 0 ? "num�� ���" : "num�� ����";
		System.out.println(result + "�Դϴ�.");
		
		if(num > 0) {
			result = "num�� ���";
		} else {
			result = "num�� ����";
		}
		System.out.println(result + "�Դϴ�.");
	}
}
