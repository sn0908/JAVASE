package day09.mypac;

public class Brother extends Thread{
	public Wallet wallet;	// ������ü
	public int money;
	
	
	public Brother(Wallet wallet) {
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
			
			System.out.println("Brother �� ��� : " + money);
		}
	}

}




