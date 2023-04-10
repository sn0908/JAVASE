package day09.innerclass;

import day09.mypac.Music;

/*
 * [[ �͸�Ŭ���� (Anonymous Class) ]]
 * 	Ŭ���� ����� ������ ���ÿ� �ϴ� �̸����� Ŭ����
 * 	��ȸ�� Ŭ����
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		Music music = new Music() {	// �͸�Ŭ���� -> Music�� ��� �ް� �ִ� �̸����� Ŭ����
			@Override
			public void listen() {
				System.out.println("������ ����~");
			}

			@Override
			public void sing() {
				System.out.println("�뷡�� �ҷ���~");
				
			}
		};
		
		music.listen();
		
		String genre = new Music() {	// �͸�Ŭ���� -> Music�� ��� �ް� �ִ� �̸����� Ŭ����
			private String genre = "�߶��";
			
			@Override
			public void listen() {
				System.out.println("������ ����~");
			}

			public String getGenre() {
				return genre;
			}

			@Override
			public void sing() {
				System.out.println("�뷡�� �ҷ���~");
				
			}
		}.getGenre();
		
		System.out.println("�帣 : " + genre);
		
	}

}
