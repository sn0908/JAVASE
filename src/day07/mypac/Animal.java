package day07.mypac;

public class Animal {
	private String name;
//	public String owner = "������";
	public String owner;
	
	
	public Animal() {
		this.owner = "������";
		System.out.println("Animal �������Դϴ�.");
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void move() {
		System.out.println("�����δ�.");
	}
}
