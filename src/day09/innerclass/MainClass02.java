package day09.innerclass;

import day09.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// MyUtil Ŭ���ȿ� HelloPrinter ����Ŭ���� �����ϱ�
		// ù��° ���
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		// �ι�° ���
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
		
		
		// static ����Ŭ���� ���� 
		MyUtil.Calculator calc = new MyUtil.Calculator();
		calc.calc(10, 20);
		
		
	}

}
