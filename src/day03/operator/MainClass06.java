package day03.operator;

/*
 * 	6. ��Ʈ������ - 2������ ǥ���� �� ��Ʈ ������
 * 	 & : And ������
 * 	 | : Or ������
 * 	 ^ : XOR ������
 * 	 ~ : Not ������
 * 
 * 	7. ����Ʈ������
 * 	 << : �������� ��Ʈ �̵�
 * 	 >> : ���������� ��Ʈ �̵�
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println(3&4);
		System.out.println(3|4); 
		System.out.println(3^4);
		System.out.println(~3);
				//  3 : 0011
				//	~ 
				//		1100 ==> 12�� �Ǿ�� �ϴµ� -4�� ��� (2�� ���� ���䶧���� -4�� ���)
				// ���� 2�Ǻ��� �� ���
		
		System.out.println(1<<2);
		System.out.println(2>>1);
	}
}
