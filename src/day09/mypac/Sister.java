package day09.mypac;

public class Sister extends Thread{
	public Wallet wallet; // ������ü
	public int money;
	
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) { 
			// �������� ���� �����ؼ� �����Ѵ�.
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0) // ���� �ܰ� 0�̸�
				break;
			
			money = money + returnedMoney;
		}
		System.out.println("Sister �� ��� : " + money);
	}
}
