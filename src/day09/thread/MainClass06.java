package day09.thread;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("���ν����尡 ���۵Ǿ����ϴ�.");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("�͸����尡 ���۵Ǿ����ϴ�.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("�͸����尡 ����Ǿ����ϴ�.");
			}
		}).start();
		
		System.out.println("���ν����尡 ����Ǿ����ϴ�.");
	}

}
