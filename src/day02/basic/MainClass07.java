package day02.basic;

import java.math.BigDecimal;

/*
 * [[ �⺻ �ڷ��� ]]
 * 	! �ε��Ҽ��� ����
 * 		��ǻ�Ͱ� �Ǽ� ����� �� ���ؿ�!!
 * 		
 * �Ǽ��� �ε��Ҽ��� ����ó�� �ʼ�!!!
 */

public class MainClass07 {
	public static void main(String[] args) {
		
		float f = 0.0f;
		for(int i = 0; i < 100; i++) { // �ݺ���
			// �����ڵ� �ݺ�
			f += 0.1f;
		}
		
		System.out.println(f);
		
		double d = 0.0d;
		for(int i = 0; i < 100; i++) { // �ݺ���
			// �����ڵ� �ݺ�
			d += 0.1d;
		}
		
		System.out.println(d);
		
		BigDecimal bd = new BigDecimal(0.0);
		for(int i = 0; i < 100; i++) { // �ݺ���
			// �����ڵ� �ݺ�
			bd = bd.add(new BigDecimal(0.1));
		}
		
		System.out.println(bd);
	}
	
}


