package day07.extendEx;

import day07.mypac.Dog;

/*
 * [[ ��� (extends) ]]
 *	�θ� Ŭ����(���� Ŭ����)�� �ڽ� Ŭ����(���� Ŭ����)�� ������,
 *	�ڽ� Ŭ������ �θ� Ŭ������ �����ؼ�
 *	�� �θ��� ����� ��� �޾� �״�� �� �� �ְ� �ȴ�.
 *
 *	Ŭ���� 1���� ��� 1�� ����!
 *
 * �������̵�(Overriding)
 * 	��� ���� �޼ҵ带 �ڽ�Ŭ�������� �������Ͽ� ����ϴ� ���� ���Ѵ�.
 * 	
 */

public class MainClass01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.move();
		String owner = dog1.getOwner();
		System.out.println(owner);
		
	}
}
