package day03.loop;

/*
 *	5. continue��
 *	 �ݺ������� �ش� �ݺ��� �ǳ� �ٰ� ���� �ݺ��� �����ϵ��� �����ϴ� ������ �Ѵ�.
 * 
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {
		// for���� �̿��Ͽ� 0���� 4���� ���� ����ϱ�
		for(int i = 0; i < 5; i++) {
			// ���� i�� 3�̸� �ݺ����� �ǳʶڴ�.
			if(i == 3) {
				continue;	// �ݺ��� �ǳʶٱ�
			}
			System.out.println("i : " + i);
		}
	}
}
