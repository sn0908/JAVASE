package day02.basic;

/*
 * [[ ������ ��������(���۷�����) ]]
 * 5. String�� (���ڿ�)
 * 	- ���ڿ��� ������ �� �ִ�.	
 *  - �����ϴ� ���
 * 		String ������;
 * 
 * �⺻���� ������ ����
 * 	1. �⺻��	
 * 		- �ҹ��ڷ� ����
 * 		- ���� ���� ������ �ִ�. (��Ȯ�� ���� ���� ������ ������ ������ �׳� �̷��� �����ض�!)
 * 		- 8���� 
 * 			boolean, char, byte, short, int, long, float, double
 * 	
 * 	2. ������
 * 		- �⺻�� �� ����!
 * 		- �ּ� ���� ������ �ִ�.
 * 		- ��ü�̴�.	�Ӽ�(���� ������ �ֵ�, ���� ����)/���(�޼ҵ�)
 */

public class MainClass09 {
	public static void main(String[] args) {
		// ���� ����� ���ÿ� �� �����ϱ�
		String str = "�ȳ��ϼ���.";
		System.out.println("���ڿ� ���� str : "+ str);
		
		/*
		 * h e l l o
		 * 0 1 2 3 4 => �ε��� ��ȣ
		 * 
		 */
		
		String hello = "hello";
		System.out.println("1�� �ε��� : "+ hello.charAt(1));
		System.out.println("replace : "+ hello.replace("l", "r"));
		
		MainClass09 mc09 = new MainClass09();
		
		mc09.print();
	}
	
	public void print() {
		System.out.println("MainClass09�Դϴ�.");
	}
}
