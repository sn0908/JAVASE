package day08.exception;

/*
 * [[ Exception ���� ]]
 * 	1. Checked Exception
 * 		������ �� �ݵ�� try ~ catch�� ó���ؾ� �Ѵ�.
 * 
 * 	2. UnChecked Exception
 * 		try ~ catch�� ó������ �ʾƵ� ������ �� ������ �߻����� �ʴ´�. (������ ó��)
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);	//	1�� �Ͻ�����
			} catch (InterruptedException e) {
				System.out.println("���� �߻�");
			}
				
		}
	}
}

