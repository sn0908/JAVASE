package day09.mypac;

public class CountThread extends Thread {

	@Override
	public void run() {
		System.out.println("CountThread ����!");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);		// 1�� �Ͻ�����
			} catch (InterruptedException e) {
				System.out.println("���� �߻�!");
			}
		}
		System.out.println("CountThread ����!");
	}
}
