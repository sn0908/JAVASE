package day07.abstractEx;

import day07.mypac.Man;

/*
 * [[ �߻�Ŭ���� (Abstract Class) ]] 
 * 	�������� ���� �߻� �޼ҵ尡 �����ϴ� Ŭ����
 * 	�޼ҵ� ���� �ϰ� ���� X
 * 	�̿ϼ� Ŭ����
 * 	����� �ް� �ݵ�� �������̵��� �ؾ��Ѵ�!!
 */

public class MainClass01 {
	public static void main(String[] args) {
		Man m1 = new Man();
		m1.useFire();
		m1.say();
		m1.setName("������");
		String name = m1.getName();
		System.out.println("m1 name : " + name);
		
		m1.setAge(25);
		int age = m1.getAge();
		System.out.println("m1 age : " + age);
	}
}
