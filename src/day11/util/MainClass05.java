package day11.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * [[ Set ]]
 * 	������ ���� ������ ����
 * 	�ߺ� ������� ����
 * 
 * 	HashSet, TreeSet
 * 
 */

public class MainClass05 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// ������ ����
		set.add("��ī��");
		set.add("������");
		set.add("���̸�");
		
		// �ߺ��� ��� �� ��!!
		set.add("�׾�ŷ");
		set.add("�׾�ŷ");
		
		// ������ ����
		System.out.println("������ ���� : " + set.size());
		
		// Iterator(�ݺ���) ��ü �̿��ؼ� ���
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("name : " + name);
		}
		
		
		
	}
}
