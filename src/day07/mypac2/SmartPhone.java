package day07.mypac2;

import day07.mypac.CellPhone;

public class SmartPhone extends CellPhone {
	private String model;
	
	public SmartPhone() {
		this.model = "����Ʈ��";
	}
	
	public void internet() {
		System.out.println("���ͳ��� �ؿ�!");
	}
	
	public void videoMessage() {
		System.out.println("���� ");
		sendMessage();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
