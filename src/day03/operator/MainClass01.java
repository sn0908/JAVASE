package day03.operator;

public class MainClass01 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// �� ���� ���� ���ؼ� sum�̶�� int�� ������ ����
		// �� ���� �� = ���� + ����
		
		int sum = num1 + num2;
		System.out.println("sum : "+ sum);
		
		// ���� + ���ڿ��� ���ڿ��̴�.
		// ���ڿ� + �� ���Ῥ�����̴�.
		String result = num1 + " + " + num2 + " = " + sum;
		System.out.println(result);
		
		// �μ��� ���� ���ؼ� multiply��� ������ ����
		int multiply = num1 * num2;
		System.out.println("multiply : "+ multiply );
				
		// ������
		int divide = 10/3;
		System.out.println("10 / 3 =" + divide);
		
		int divide2 = num1 / num2;
		System.out.println("num1 / num2 = "+ divide2);
		
		// 9�� 5�� ���� �������� resultNum�� ����
		int resultNum = 9%5;
		System.out.println("9 % 5 = " + resultNum);
		
		// �Ǽ� ��� �ε��Ҽ� ���� ����!!
		double resultDouble = 10/3.0;
		System.out.println("10 / 3.0 = " + resultDouble);
	}
		
}
