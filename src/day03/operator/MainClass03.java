package day03.operator;

/*
 *	4. �� ������
 *	 &&	: And ����, ������ ����, ���� ��� true�� ���� true
 * 	 ||	: Or ����, �������� ����, ��� ������ true�̸� true
 * 	 !	: Not ����, ������ ����, ������ ������Ų��.
 *  
 */

public class MainClass03 {
	public static void main(String[] args) {
		boolean result = true && false ;
		System.out.println("&& : " + result);
		
		result = true || false;
		System.out.println("|| : " + result);
		
		result = !false;
		System.out.println("! : " + result);
		
		if(10<20 || 5==4 || 1==0) {
			System.out.println("���� �� �ϳ��̻� �� true�Դϴ�.");
		}
		
		String order = "��ȭ����";
		
		if(order.equals("��ǰ")
				|| order.equals("��ȭ����")
				|| order.equals("�Ƿ�")
				) {
			System.out.println("��ǰ/��ȭ����/�Ƿ� ī�װ����� �ֹ��Ͽ����ϴ�.");
		} else {
			System.out.println("��ǰ/��ȭ����/�Ƿ� �� ī�װ����� �ֹ��Ͽ����ϴ�.");
		}
		
		result = true || false || false || false;
		System.out.println(result);
		
		result = !(true && true && true) || false;
		System.out.println(result);
		
		
	}
}
