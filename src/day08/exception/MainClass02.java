package day08.exception;

import day08.mypac.AkWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		AkWeapon ak = null;
		
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			ak.attack();
			result = num1 / num2;
		} catch(NullPointerException e) {
			System.out.println("null ������ �ͼ��� �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("��� ���� 0���� ���� �� �����ϴ�.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
		
	}
}
