package day09.innerclass;

import day09.mypac.Music;
import day09.mypac.Singer;

public class MainClass04 {
	public static void main(String[] args) {
		Singer s = new Singer(new Music() {
			@Override
			public void listen() {
				System.out.println("������ ����~");
			}

			@Override
			public void sing() {
				System.out.println("�뷡�� �ҷ���~");
				
			}
		});
		
		s.m.sing();
		
		
		DanceMusic dMusic = new DanceMusic();
		Singer s2 = new Singer(dMusic);
		s2.m.sing();
		
	}
}

class DanceMusic implements Music {

	String genre = "��";
	
	@Override
	public void listen() {
		System.out.println(genre +" ������ ����~");
	}

	@Override
	public void sing() {
		System.out.println(genre + " �뷡�� �ҷ���~");
	}
	
}




