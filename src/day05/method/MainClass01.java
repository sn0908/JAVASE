package day05.method;

/*
 *	[[ �޼ҵ�(Method) ]] 
 * 	 � Ư�� �۾��� �����ϱ� ���� ��ɹ��� ����
 * 	 ��ü�� ��� ������ �Ѵ�.
 * 
 * 	 �޼ҵ� ����
 * 	 (����������) (����) ��ȯŸ�� �޼ҵ��̸�(�Ű�����Ÿ�� �Ű�������) {	// �����
 *		������ �ڵ�(��ɹ�)	// ������
 *		...
 *		
 *		return ��ȯ��;
 * 	 }
 * 
 * 	 �����ε�(Overloading)
 * 		Ŭ���� ������ ���� �̸��� ���� �޼ҵ带 ������ �����ϴ� ���� ���Ѵ�.
 * 		�Ű����� ���� �Ǵ� Ÿ���� �ٸ��� �ȴ�.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		hello();	// �޼ҵ� ȣ��
		printName("��ī��");
		printMember("F**k", "��", 29);
		
		String[] poketMon = {"��ī��", "������", "���̸�", "���α�"};
		printPoketmon(poketMon);
		
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.3));
	}
	
	// void�� �ѹ� �����ϰ� ����. ����(�Ű�����) X, ��ȯ��(���ϰ�)�� ����. -> ȣ�� �� �����ϰ� ������ �޼ҵ� 
	public static void hello(){
		System.out.println("Hello, World!");
	}
	
	// ���� O, ���� X -> ���ڰ��� �޾� �����ϰ� ������ �޼ҵ�
	public static void printName(String name) {	// String name = "��ī��";
		System.out.println("�̸� : " + name);
	}
	
	// ���� O ����Ÿ�� ������, ���� X
	public static void printMember(String id, String name, int age) {
		System.out.println("ID : " + id);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	} 
	
	// �����ε�(overloading) �޼ҵ�
	// ���� O ����Ÿ�� ������ ����X
	public static void printMember(String id, String name, int age, String job) {
		System.out.println("ID : " + id);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + job);
	}
	
	// ���� O �迭, ���� X
	public static void printPoketmon(String[] mons) {
		for(String mon : mons) {
			System.out.println(mon);
		}
	}
}
