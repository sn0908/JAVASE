package day09.thread;
/*
 * synchronized �����
 * 	����ȭ �����ִ� �����
 * 
 * 
 */



import day09.mypac.Brother;
import day09.mypac.Sister;
import day09.mypac.Wallet;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("���ν����尡 ���۵˴ϴ�.");
		// Wallet ��ü �����ϱ�
		Wallet wallet = new Wallet();
		
		// Sister �����尴ü ����
		Sister sister = new Sister(wallet);
		
		// Brother �����尴ü ����
		Brother brother = new Brother(wallet);
		
		// ������ ��ü�� �̿��ؼ� �ΰ��� ������ ���۽�Ű��
		sister.start();
		brother.start();
		
		System.out.println("���ν����尡 ����˴ϴ�.");
		
	}
}


