package day08.exception;

import day08.mypac.NumberPrinter;

/*
 * [[ throws ]]
 * 	���ܰ� �߻��ϸ� �����޼ҵ�� ���ܸ� �̷��.
 * 
 */

public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter np = new NumberPrinter();
		
//		try {
//			np.printNumber();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		np.printNumber();
		
		// ������ �ͼ��� �߻���Ű��
		throw new NullPointerException();
		
	}
}
