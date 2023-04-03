package day06.oop;

// import ����Ű -> Ctrl + Shift + o
import day06.mypac.Card;

/*
 *	[[ OOP(Object Oriented Programing) ]]
 *	 - ��ü���� ���α׷���
 *	 - ���α׷��� �ۼ��� �� �����Ϳ� �����͸� �����ϴ� �޼ҵ�(�Լ�)��
 *	   �ϳ��� ���� ������ ��ü�� ���� ���
 *	 
 *	[[ ��ü(Object) ]]
 *	 - ���������� �����ϰų� �߻������� ������ �� �ִ� �� �߿���
 *	   ���� �����ϰ� �ĺ� ������ ���� ���Ѵ�.
 *
 *	 ��) �������� �� - ���, �����, ��ǻ��, �л�
 *	    �߻����� �� -�ֹ�, ȸ�����, ���� ��...
 *
 *	[[ Class ]]
 *	 - ��ü�� ����� ���� ���赵
 *	 - Class�� �ۼ��� �ڵ带 �о� �ν��Ͻ�ȭ(��üȭ) �Ѵ�. => �޸𸮿� �ø���!!
 *	 ��) ���ñ��
 *
 * 	Ŭ���� ����
 * 	(����������) class Ŭ������ (extends ���) (implements �������̽� ���) { // Ŭ���� �����
 *	 	(������) => �ʱ�ȭ
 * 		����(�������, ����ʵ�) => �Ӽ�
 * 		�޼ҵ�(����޼ҵ�) => ���
 *  }
 *  
 *  ��üȭ - new �����ڷ� �̽��Ͻ�ȭ ����!
 *  Ŭ������(Ÿ��) ������ = new Ŭ������();
 *  
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		Card card = new Card();
		Card card2 = new Card();
		
		System.out.println("card type : " + card.type);
		System.out.println("card tnumber : " + card.number);
		
		System.out.println("card2 type : " + card2.type);
		System.out.println("card2 number : " + card2.number);
		
		System.out.println("card width : " + card.width);
		System.out.println("card2 width : " + card2.width);
		
		
		card.number = "10";
		card.width = 72;
		
		// ���� ��
		System.out.println(card.number);
		System.out.println(card2.number);
		
		System.out.println("card width : " + card.width);
		System.out.println("card2 width : " + card2.width);
	}
}
