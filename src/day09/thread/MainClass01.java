package day09.thread;

import day09.mypac.MyThread;

/*
 * [[ Thread ]]
 * 	������� ���α׷� ������ ����Ǵ� ���α׷� ���� �帧(�������)�� ���Ѵ�.
 * 	�ϳ��� ���μ��� ���ο��� ���������� ����Ǵ� �ϳ��� �۾�����
 * 	���� ���α׷���
 * 	�񵿱� ���α׷��� 
 * 
 * [[ ���ο� ������ ���� ��� ]]
 * 	1. Thread Ŭ���� ���
 * 	2. run �޼ҵ� �������̵� ����
 *  3. 1�� Ŭ���� ����
 *  4. 3�� ��ü start() �޼ҵ� ȣ��!
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("���� ������ ����!");
		
		MyThread thread1 = new MyThread();
		thread1.start();
		
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
	

}










