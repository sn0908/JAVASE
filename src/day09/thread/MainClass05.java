package day09.thread;

import day09.mypac.InterThread;

/*
 * [[ Runnable ]]
 * 	Thread ��Ӵ�� �������̽� ������� Thread ��ü �����ϱ�
 * 
 */

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("���ν����� ���۵˴ϴ�.");
		
		// ������ Runnable �������̽��� ������ ��ü ����
		Runnable iThread = new InterThread();
		// InterThread ������ ��ü�� Thread ��ü ������ ���ڷ� ����
		Thread thread = new Thread(iThread);
		// Thread ��ü�� start() �޼ҵ� ȣ���Ͽ� ���ο� ������ ����!
		thread.start();
		
		System.out.println("���ν����� ����˴ϴ�.");
	}

}
