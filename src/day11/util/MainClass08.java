package day11.util;

import java.util.Random;

/*
 * [[ Random Class ]]
 * 	���� ���� Ŭ����
 * 	
 * 
 */

public class MainClass08 {
	public static void main(String[] args) {
		Random ran = new Random();

		// 0~9 ���� ���� �� ���� �߻�
		int ranNum = ran.nextInt(10);
		System.out.println("���� : " + ranNum);
		
	}	
	
}
