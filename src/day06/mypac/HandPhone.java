package day06.mypac;

public class HandPhone {
	// public String model = "������s23";
	public String model;
	
	static {
		System.out.println("static �ʱ�ȭ ��");
	}

	{
		System.out.println("�ʱ�ȭ ��");
	}
	
	// ������
	public HandPhone() {
		// model = "������s23+";
		model = "������s23";
		printModel();
	}
	
	// ������ �����ε�
	public HandPhone(String model) {
		this.model = model;
		printModel();
	}
	
	public void printModel() {
		System.out.println(this.model);
	}
}
