package day09.thread;

import day09.mypac.CountThread;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("���ν����� ����!");
		
		new CountThread().start();
		
		System.out.println("���ν����� ����!");
	}

}
