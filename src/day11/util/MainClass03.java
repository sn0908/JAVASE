package day11.util;

import java.util.Vector;

/*
 * [[ Vector Class ]] 
 * 	�����迭 ��ü
 * 	ArrayList�� ����
 * 	Thread safe - synchronized
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		// �߰�
		vec.add("��ī��");
		vec.add("��ī��");
		vec.add("��ī��");

		System.out.println("����� ������ ���� : " + vec.size());
		
		// ������ ��������. stack���� pop�� �ϸ� ���������°�����, vec�� ���� �״�� ����
		System.out.println("1�� �ε��� ������ �������� : " + vec.get(1));
		
		
		
	}
}
