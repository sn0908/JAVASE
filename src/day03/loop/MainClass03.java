package day03.loop;

/*
 * 	3. for��
 * 	 �ʱ��, ���ǽ�, �������� �̿��Ͽ� �ݺ������� �ڵ� ����� �����ϴ� ���
 * 
 * 	for(�ʱ��; ���ǽ�; ������) {
 * 		�ݺ� ������ �ڵ�	
 * 	}
 * 
 * 	������� : �ʱ�� -> ���ǽ� -> �ݺ������ڵ� -> ������ -> ���ǽ� -> �ݺ������ڵ� ... ���ǽ� false�϶����� �ݺ�
 */

public class MainClass03 {
	public static void main(String[] args) {
		// for���� �̿��Ͽ� 0���� 9������ ���ڸ� ����ϱ�
		for(int i = 0; i < 10; i++) {
			System.out.println(i);	// i ���� ����ϱ�
		}
		
		System.out.println();
		
		int count = 0;
		
		while(count < 10) {
			System.out.println(count);
			count++;
		}
		
	}
}
