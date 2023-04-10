package day09.mypac;

public class MyUtil {
	public String name = "MyUtil";
	public static String staticName = "������ƿ";
	
	// 1. �ν��Ͻ� ����Ŭ����
	public class HelloPrinter{
		public void printHello() {
			System.out.println(name + " ���� Ŭ���� HelloPrinter �Դϴ�.");
			System.out.println(staticName + " ���� Ŭ���� HelloPrinter �Դϴ�.");
		}
	}
	
	// 2. static ���� Ŭ����
	public static class Calculator {
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("���� ���� �� ������ �� : " + result);
//			System.out.println(name + " ���� Ŭ���� Calculator �Դϴ�.");
			System.out.println(staticName + " ���� Ŭ���� Calculator �Դϴ�.");
			
		}
	}

}
