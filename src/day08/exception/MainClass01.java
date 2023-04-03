package day08.exception;

/*
 * [[ ���� (Exception) ]]
 * 	���α׷� ���൵�� �߻��Ǵ� �����ڰ� �ذ� ������ ������ �ش�ȴ�.
 * 	
 * 	����ó�� ���
 * 	try {
 * 		�����ڵ�
 * 	} catch(�ͼ���Ŭ������ ������) {
 * 		�ش� ���ܰ� �߻����� ��� ������ �ڵ�
 * 	} finally {
 * 		���� �Ǵ� ���ܰ� �߻��ص� ����Ǵ� ��
 * 	}
 */

public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 10;	// ����
		int num2 = 0;	// ������
		int result = 0;
		
		/*
		if(num2 != 0) {
			result = num1 / num2;	// Exception: / by Zero
			System.out.println("result : " + result);
		} else {
			System.out.println("��� ���� 0���� ���� �� �����ϴ�.");
		}	
		*/
		
		try {
			// ���� �����ڵ� 
			result = num1 / num2;
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.out.println("�����ڿ��� ���� �ٶ��ϴ�. 1544-1234");
			
			System.out.println("��� ���� 0���� ���� �� �����ϴ�.");
			e.printStackTrace();
			System.out.println("�����޼��� : " + e.getMessage());
		}
	}
}
