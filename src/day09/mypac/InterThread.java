package day09.mypac;

public class InterThread implements Runnable{

	@Override
	public void run() {
		System.out.println("InterThread�� ���۵Ǿ����ϴ�.");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("InterThread�� ����Ǿ����ϴ�.");
		
	}

}
