package day11.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * [[ �ݺ��� (Iterator) ]]
 * 	�ڹ� �÷��� �����ӿ�ũ���� �÷��ǿ� ����� ��Ҹ� �о���µ� ���Ǵ� �������̽�
 * 	hasNext() ���� ��Ұ� �ִ��� Ȯ�� boolean ��ȯ
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("���");
		list.add("�׸�");
		list.add("����");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();	// ���� �ε����� �ִ� ���� ��ȯ
			System.out.println("name : " + name);
		}
		
	}
}
