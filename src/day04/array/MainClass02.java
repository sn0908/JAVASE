package day04.array;

public class MainClass02 {
	public static void main(String[] args) {
		// �迭��ü �����ϱ�
		String[] names = new String[6];
		names[0] = "��ī��";
		names[1] = "������";
		names[2] = "���̸�";
		names[3] = "���α�";
		names[4] = "������";
		names[5] = "�ߵ���";
		
		// �� ��������
		System.out.println(names[3]);
		
		// �迭�� ����
		System.out.println(names.length);
		
		// �迭 for���� ����Ͽ� ��ü ����ϱ�
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
	
	}
}
