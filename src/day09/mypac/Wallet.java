package day09.mypac;

public class Wallet {
	
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	// Thread safe �޼ҵ�
//	public synchronized int getMoney() {
//		if(totalMoney == 0) {
//			return 0;
//		}
//		
//		totalMoney = totalMoney - 1;
//		
//		System.out.println("���� ������ �ݾ�: " + totalMoney);
//		return 1;
//	}
	
	public int getMoney() {
		if(totalMoney == 0) {
			return 0;
		}
		
		synchronized (this) {	// ����ȭ ��
			totalMoney = totalMoney - 1;
		}
		
		System.out.println("���� ������ �ݾ�: " + totalMoney);
		return 1;
	}

}
