package day12.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * [[ InputStream / OutputStream ]]
 * 	����Ʈ ��� �Է°� ����� �ٷ�� �߻� Ŭ�����̴�.
 * 
 * [[ FileInputStream ]]
 * 	������ �д� ��ü
 * [[ FileOutputStream ]]
 * 	������ ���� ��ü
 * 
 */

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// hello.txt ������ �б� ���� ��ü
			fis = new FileInputStream("./upload/hello.txt");
			
			File f1 = new File("./upload2");
			if(f1.mkdir()) {
				System.out.println("upload2 ���丮 �����Ǿ����ϴ�.");
			}
			
			File f2 = new File(f1, "hello2.txt");
			if(f2.createNewFile()) {
				System.out.println("hello2.txt ���� �����Ǿ����ϴ�.");
			}
			
			// hello2.txt�� ���� ���� ��ü ����
			// FileOutputStream ���丮 ��δ� �����ؾ� �Ѵ�.
			// ������ ������ �ڵ����� �����ȴ�.
			fos = new FileOutputStream(f2);
			
			int readByteCnt = 0;
			byte[] b = new byte[100];
			
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("���� �Ϸ�!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fos!=null) fos.close();
			if(fis!=null) fis.close();
		}
		
		
	}
	
}
