package day09.mypac;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("MyThread���� �۾��� �ؿ�!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("MyThread�� ����˴ϴ�.");
		
	}
}
