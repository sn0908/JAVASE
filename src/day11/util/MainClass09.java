package day11.util;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		// 45 ũ�� �迭 ����
		int[] lNum = new int[45];
		
		// 1���� 45���� �迭�� ����
		for(int i = 0; i < lNum.length; i++) {
			lNum[i] = i + 1;
		}
		
		// ���� ���� ��ü
		Random ran = new Random();
		
		for(int i = 0; i < lNum.length; i++) {
			// 0~44���� ���� �� ���ǰ� ��ȯ
			int changeIndex = ran.nextInt(45);
			
			// ������
			int tmp = lNum[i];
			lNum[i] = lNum[changeIndex];
			lNum[changeIndex] = tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lNum[i] + " / ");
		}
	}
}
