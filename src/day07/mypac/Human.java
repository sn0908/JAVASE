package day07.mypac;

// �߻�Ŭ����
public abstract class Human {
	private String name;
	private int age;

	public void say() {
		System.out.println("���� �ؿ�!");
	}
	
	public abstract void useFire();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}