package day09.thread;

import day09.mypac.CountThread;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("���ν����尡 ���۵˴ϴ�.");
		
		CountThread cThread = new CountThread();
		cThread.start(); // ī��Ʈ ������ ����!
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i*100);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("���ν����尡 ����˴ϴ�.");
		
	}

}
