package day11.generic;

/*
 * [[ ���׸� (Generic) ]]
 * 	������ �ð��� Ÿ�� �������� �����ϸ鼭 �������� ���뼺�� ���̱� ���� ���
 * 	1. �߸��� Ÿ�� ������ �� ����
 * 	2. ��ȯ(cast) �ʿ����.
 *  
 */

public class MainClass01 {
	public static void main(String[] args) {
		MyClass<String> stringObj = new MyClass<>();
		stringObj.setData("Hello, World");
		String data = stringObj.getData();
		System.out.println(data);
		
		MyClass stringObj2 = new MyClass();
		stringObj2.setData("Hello, World!");	// ������������!!
		String data2 = (String) stringObj2.getData();
		
	}
}
