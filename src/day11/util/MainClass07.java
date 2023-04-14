package day11.util;

import java.util.LinkedList;
import java.util.Queue;

/*
 * [[ Queue ]]
 * 	���Լ���(FIFO) : ���� ���� ���� ���� ������.
 * 	
 *  
 *   
 */

public class MainClass07 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("��ī��");
		queue.offer("������");
		queue.offer("���̸�");
		
		LinkedList<String> list = (LinkedList<String>) queue;
		
		
		// ������ ��������		
		// System.out.println(queue.get(0));	// queue���� get �޼ҵ尡 ����.
		System.out.println(list.get(0));		// ���� �������� �ʰ� �������⸸ ��
		
		System.out.println("1�� poll : " + queue.poll());	// ���� �������� ����
		System.out.println("2�� poll : " + queue.poll());	
		System.out.println("3�� poll : " + queue.poll());

		System.out.println("list size : " + list.size());
	}
}

