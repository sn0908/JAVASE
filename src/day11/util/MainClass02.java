package day11.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * [[ List ]]
 * 	�����迭 ��ü
 * 	���� �迭
 * 	�ε������� �ִ�.
 */

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// ������ �����ϱ�
		list.add("��ī��");	//	index: 0
		list.add("������");	//	index: 1
		list.add("���̸�");	//	index: 2
		
		// ����� �������� Ư�� �ε����� ������
		String str = list.get(0);
		System.out.println("list 0 �ε����� : " +  str);
		
		// ����� �����Ϳ��� Ư�� �ε��� ���� �����ϱ�
		list.remove(1);
		
		System.out.println("����� �������� ���� : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list[" + i + "]: " + list.get(i));
		}
		
		// Ȯ�� for��
		for(String name : list) {
			System.out.println("name : " + name);
			
		}
		
		List<String> list2 = new ArrayList<>();
		
		// ���� ����
		List<String> list3 = (List<String>) list.clone();
		
		// LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("�Ḹ��");
		linkedList.add("�̺���");
		linkedList.add(1, "��Ű");
		
		for(String name : linkedList) {
			System.out.println("Linked name : " + name);
		}
		
	}
}
