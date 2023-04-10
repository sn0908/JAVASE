package day10.lang;

/*
 * 1. ���� ����(Shallow Copy, call by reference)
 * 		- ������ ������ �ּҰ��� ����!
 * 		- ������ ��ü�� �����ϰ� �ȴ�.
 * 
 * 2. ���� ����(Deep Copy, call by Value)
 * 		- ��ü�� ����������� ��ü�� �����ϴ� ��ü���� ��� �����ϴ� ���!
 * 		- ���ο�(�ٸ�) ��ü�� �����ϰ� �ȴ�.
 * 
 */

import day10.mypac.Sports;
import day10.mypac.TestRef;

public class MainClass02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		// call by reference (���� ����) - �ּҰ� ����
		Sports sports1 = new Sports("�౸", true);
		Sports sports2 = sports1;
		Object obj1 = sports1;		// ������
		
		Sports sports3 = (Sports) sports1.callClone();
		
		sports2.kind = "��";
		
		System.out.println(sports1.kind);
		System.out.println(sports1.equals(obj1));
				
		if(sports1.equals(sports2)) {
			System.out.println("sports1�� sports2�� ����");
		} else {
			System.out.println("sports1�� sports2�� ���� �ʴ�");
		}
	
		if(sports1.equals(sports3)) {
			System.out.println("sports1�� sports3�� ����");
		} else {
			System.out.println("sports1�� sports3�� ���� �ʴ�");
		}
		
		System.out.println("���� �����? " + sports3.kind);
		
		testRef(sports1);
		
		System.out.println("1. sports1.kind: " + sports1.kind);
		
		TestRef.testRef(sports1);
		
		System.out.println("2. sports1.kind: " + sports1.kind);
		
		Sports sports4 = TestRef.testRef2(sports1);
		
		System.out.println("sports4.kind : " + sports4.kind);
		
	}
	
	public static void testRef(Sports sports) {
		sports.kind = "�߱�";
	}
}
