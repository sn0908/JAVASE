package day08.polymorphism;

import day08.mypac.AkWeapon;
import day08.mypac.M4A1Weapon;
import day08.mypac.Scope;
import day08.mypac.Weapon;

/*
 * [[ ������ (polymorphism) ]]
 * 	�ϳ��� ��ü�� �������� Ÿ���� ���� �� �ִ� ���� �ǹ�
 * 	
 * 	instanceof ������
 * 		��ü�� Ư�� Ŭ���� �Ǵ� �������̽��� �ν��Ͻ����� ���θ� Ȯ���ϴµ� ���
 * 
 * 
 */

public class MainClass01 {

	public static void main(String[] args) {
		AkWeapon ak47 = new AkWeapon();
		ak47.attack();
		ak47.printType();

		Weapon ak47_2 = new AkWeapon();
		ak47_2.attack();
//		ak47_2.printType();
		
		// call by reference (���� ����) : �ּҰ��� ����
		AkWeapon ak47_3 = (AkWeapon) ak47_2;
		ak47_3.printType();
		
		M4A1Weapon m4a1 = new M4A1Weapon();
		System.out.println(System.identityHashCode(ak47));
		System.out.println(System.identityHashCode(ak47_2));
		System.out.println(System.identityHashCode(ak47_3));
		
		classyfiyWeapon(ak47);
		classyfiyWeapon(ak47_2);
		classyfiyWeapon(ak47_3);
		classyfiyWeapon(m4a1);
	}
	
	public static void classyfiyWeapon(Weapon weapon) {
		if(weapon instanceof Scope) {
			System.out.println("���� �����Դϴ�.");
		} else {
			System.out.println("�Ϲ� �����Դϴ�.");
		} 
	}
}
