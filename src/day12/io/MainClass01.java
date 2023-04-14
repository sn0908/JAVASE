package day12.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * [[ I/O - Input / Output ]]
 * 	�Է�/��� ���� ��Ű��
 * 
 * 
 * [[ File Class ]]
 * 	��� ������ �޾� ���� �Ǵ� ���丮 ������ ��üȭ
 * 
 */

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		// File ��ü ����
		File f = new File("C:\\");
		
		// C����̺� ������ �ִ� ��� ���丮 �� ���� ��ȯ�Ѵ�.
		String[] list = f.list();
		
		// Calendar ��ü ����
		Calendar c = Calendar.getInstance();
		
		for(String temp : list) {	// ���ϸ�� �ݺ��� �̿� �ϳ��� ��������
			// temp ���� ���丮 �Ǵ� ������ File ��ü�� ����
			File f2 = new File(f, temp);
			
			// 1970�� 1��1�Ϻ��� ���� ������ ��¥�� �и�������� ��ȯ�Ѵ�. (TimeStamp)
			long lastMod = f2.lastModified();
			
			// ���� ���� �Ǵ� ���丮�� ������ ������ ��¥�� calendar ��ü�� �ٽ� ����
			c.setTimeInMillis(lastMod);
			
			// ������ ������ ��¥ ���� ��ȯ�Ͽ� ���ڿ��� ��ȯ
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String today1 = sdf.format(c.getTime());
			
			// isDirectory() - ���丮�̸� true, �����̸� false
			if(f2.isDirectory()) {
				System.out.println(f2.getName()+"(���丮) - ");
				System.out.println(today1);
			}
			
		}
		
		for(String temp : list) {	// ���ϸ�� �ݺ��� �̿� �ϳ��� ��������
			// temp ���� ���丮 �Ǵ� ������ File ��ü�� ����
			File f2 = new File(f, temp);
			
			// 1970�� 1��1�Ϻ��� ���� ������ ��¥�� �и�������� ��ȯ�Ѵ�. (TimeStamp)
			long lastMod = f2.lastModified();
			
			// ���� ���� �Ǵ� ���丮�� ������ ������ ��¥�� calendar ��ü�� �ٽ� ����
			c.setTimeInMillis(lastMod);
			
			// ������ ������ ��¥ ���� ��ȯ�Ͽ� ���ڿ��� ��ȯ
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String today1 = sdf.format(c.getTime());
			
			// isDirectory() - ���丮�̸� true, �����̸� false
			if(f2.isFile()) {
				String size = String.format("%,d", f2.length());
				
				System.out.print(f2.getName()+"(����) - " + size + "byte - ");
				System.out.println(today1);
			}
		}

		/*
		 * ���
		 * 	1. ������
		 * 		OS ��Ʈ ����
		 * 		��) ������ - C:\
		 * 		   ������ - /
		 *		   C:\Users\ITSC\git
		 * 	2. �����
		 * 		���� ��ġ ����
		 * 		. -> ���� ��ġ
		 * 		.. -> ���� ����
		 * 		./java.txt
		 * 
		 */

		File f3 = new File("./","java.txt");
		// createNewFile() - ���� �����ϸ� true ���ϸ� false
		if(f3.createNewFile()) {
			System.out.println("java.txt ������ �����Ǿ����ϴ�.");
		}
		
		// delete() - ���� �����ϸ� true, ���ϸ� false
		if(f3.delete()) {
			System.out.println("java.txt ������ �����Ǿ����ϴ�.");
		}
		
		Calendar c2 = Calendar.getInstance();
		
		
		int year = c2.get(Calendar.YEAR);
		int month = c2.get(Calendar.MONTH) + 1;
		int day = c2.get(Calendar.DAY_OF_MONTH);
		int milliSec = c2.get(Calendar.MILLISECOND);
		
		File f4 = new File("./upload/"+ year + "/" + month + "/"+ day);
		// mkdirs() - ���丮 ����
		if(f4.mkdirs()) {
			System.out.println("./upload/" + year + "/" + month + "/" + day + 
					" ���丮�� �����Ǿ����ϴ�.");
		}
		
		String uploadFile = "upload_" + year + month + day + milliSec;
		File f5 = new File(f4, uploadFile);
		if(f5.createNewFile()) {
			System.out.println(uploadFile + "�� �����Ǿ����ϴ�.");
		}
		
	
	}
}
