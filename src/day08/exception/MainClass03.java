package day08.exception;

public class MainClass03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
				
		try {
			System.out.println("DB�� �����մϴ�.");
			
			result = num1 / num2;
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
		} finally {	// �ݵ�� ����
			System.out.println("DB ������ �����մϴ�.");
		}
	}
}
