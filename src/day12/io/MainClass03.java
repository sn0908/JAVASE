package day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * [[ BufferedInputStream / BufferedOutputStream ]]
 * 	���� ������Ʈ��
 * 	���� ���
 * 	�������� ����
 * 
 */

public class MainClass03 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		PrintStream ps = null;
		
		try {
			// hello.txt ������ �б� ���� ��ü ����
			fis = new FileInputStream("./upload/hello.txt");
			// ���� ��Ʈ���� ���μ� ���� ����� �߰���
			bis = new BufferedInputStream(fis);
			
			// hello3.txt ������ ���� ���� ��ü ����
			fos = new FileOutputStream("./upload2/hello3.txt");
			// ���� ��Ʈ���� ���μ� ���� ����� �߰���
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			// ���Ͽ��� ���� �����͸� ���ۿ� ����, ���۰� �������� ���Ͽ� �� ���� ���⸦ ������
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
				}
			
			bos.flush();	// ���ۿ� ���� �����͸� ���Ͽ� ���� ���۸� ���
			
			ps.println();
			ps.println("=================================");
			ps.print("�ȳ��ϼ���.");
			ps.println("PrintStream���� �ۼ��ϼ���.");
			ps.println("=================================");
			
			System.out.println("���� �Ϸ�!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bos != null)bos.close();
			if(fos != null)fos.close();
			if(bis != null)bis.close();
			if(fis != null)fis.close();
		}
	}
}
