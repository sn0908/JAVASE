package day08.mypac;

public class AkWeapon implements Weapon{

	@Override
	public void attack() {
		System.out.println("���� ������ �ؿ�!");
	}

	public void printType() {
		System.out.println(TYPE);
	}
	
}
