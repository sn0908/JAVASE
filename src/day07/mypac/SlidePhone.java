package day07.mypac;

public class SlidePhone extends Phone {
	
	public SlidePhone() {
		this.model = "�����̵� ��ȭ��";
	}
	
	public void sendMessage() {
		new CellPhone().sendMessage(); // 1ȸ���̴�. �ּҰ��� ������
	}
	
	void telecomInternet() {
		System.out.println("��Ż� ���ͳ� ����!");
	}
}
