package day08.mypac;

public class M4A1Weapon implements Weapon, Scope {

	@Override
	public void attack() {
		System.out.println("80������ �����ؿ�!");
	}

	@Override
	public void dosnip() {
		System.out.println("3000 �Ÿ� ���� �����ؿ�!");
	}
	
}
