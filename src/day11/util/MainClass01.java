package day11.util;

import java.util.Stack;

/*
 * [[ Stack Class ]]
 * 	��������(FILO) : ���� ���� ���� �������� ������.
 *	 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		// ������ ��ü�� �ڷ� �����ϱ�
		stack.push("��ī��");
		stack.push("������");
		stack.push("���̸�");
		stack.push("���α�");
		stack.push("����Ǯ");
		stack.push("�ߵ���");
		
		// ���� �����ϰ� �ִ� ������ ����
		System.out.println("������ ���� : " + stack.size());
		
		// �����͸� �ϳ��� ������
		System.out.println("1�� : " + stack.pop());	// �ߵ���
		System.out.println("2�� : " + stack.pop());	// ����Ǯ
		System.out.println("3�� : " + stack.pop());	// ���α�
		
		System.out.println("���� ���� �ִ� ������ : " + stack.peek()); // �ߵ���~���α� ���� �־ ���̸��� ����
		
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println("pop ������ : " + name);
			
			
		}
		
		
	}
}
