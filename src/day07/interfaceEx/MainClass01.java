package day07.interfaceEx;

import day07.mypac.DanceMusic;

/*
 * [[ �������̽� (interface) ]]
 * 	�߻�޼ҵ���� ����
 * 	�������̽������� ���������� �ص� ������ �ƴ� ����� �ȴ�.
 * 	���߻�� ����!
 * 
 * 	��ü ����(����)�� ������ش�!
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		DanceMusic dm = new DanceMusic();
		String groupName = dm.getGroupName();
		
		System.out.println("groupName : " + groupName);
	
		dm.listen();
		dm.sing();
		
		System.out.println(dm.LABEL);
		
//		dm.LABEL = "YG";	// �������̽� ���� ��� (������ ����!)
	}	
}
