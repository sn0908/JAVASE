package day02.basic;

/*
 * 
 * [[ ����ȯ(cast) ]]
 * 	1. ��ĳ����(���θ��)
 * 		- ǥ�� ������ �� ū ������������ ��ȯ�ϱ�
 * 		- �ڵ����� �ȴ�.
 * 		- ������ �ս��� ����.
 * 
 * 2. �ٿ�ĳ����(����)
 * 		- ǥ�� ������ �� ���� ������������ ��ȯ�ϱ�
 * 		- ��������� �ؾ��Ѵ�.
 * 		- ������ �ս��� ���� �� �ִ�.
 */

public class MainClass08 {
	public static void main(String[] args) {
		// ��ĳ���� ��	
		byte iByte = 10;
		int iInt = iByte;	// �ڵ����� ����ȯ�� �ȴ�.
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // �ڵ����� ����ȯ�� �ȴ�.
		
		// �ٿ�ĳ���� ��
		iDouble = 10.1234567891234d;
		System.out.println("iDouble : "+ iDouble);
		
		float iFloat2 = (float)iDouble;
		System.out.println("iFloat2 : "+ iFloat2);
		int iInt2 = (int)iDouble;
		System.out.println("iInt2 : "+ iInt2);
	}
}
