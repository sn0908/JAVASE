package day07.mypac;

public class Dog extends Animal {
	
	public Dog() {
		System.out.println("Dog �������Դϴ�.");
	}
	
	// �����ε� ������!!
	public Dog(String name) {
		System.out.println(name + "�� Dog �������Դϴ�.");
	}
	
	public void bark() {
		System.out.println("�п�~ bow bow~");
	}

	@Override
	public void move() {
		// �θ� ��� ���ٰ��� ����� super
		System.out.println("Ȱ���ϰ�~");
		super.move();
	}
	
	public String getOwner() {
		return super.owner;
	}
}
