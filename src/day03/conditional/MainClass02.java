package day03.conditional;

/* 
 *	null - ������ ���� ����!
 *		��Ȯ���� ������ ������ �������� ����!!
 * 
 */


public class MainClass02 {
	public static void main(String[] args) {
		int score = 75;
		String result = null;		// (���� ǥ��) String result = "";
		
		
		if(score >= 90) {
			result = "��";
		} else if(score >= 80) {
			result = "��";
		} else if(score >= 70) {
			result = "��";
		} else if(score >= 60) {
			result = "��";
		} else {
			result = "��";
		}
		System.out.println("���� : " + result);
		}
}
