package day04.array;

public class MainClass03 {
	public static void main(String[] args) {
		// new �����ڸ� ������� �ʰ� ���� �迭 �� �����ϱ�
		String[] names = {"��ī��", "������", "���̸�", "���α�", "������", "�ߵ���"};
		
		// �迭�� ���� ����غ���
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("=============================================");
		
		// �迭�� �����ϱ�
		names[5] = "�Ḹ��";
		
		// Ȯ�� for��
		for(String name : names) {
			System.out.println(name);
		}
	}
}
