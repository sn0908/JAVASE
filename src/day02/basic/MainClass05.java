package day02.basic;

/*
 * [[ �⺻ �ڷ��� ]]
 * 3. ������
 * 	- �����ϴ� ���
 * 		byte ������;
 * 			1byte
 * 			-128 ~ 127			
 * 		short ������;
 * 			2byte
 * 			-32,768 ~ 32,767
 * 		int ������;
 * 			4byte
 * 			-2,147,483648 ~ 2,147,483,647
 * 		long ������;
 * 			8byte
 * 			�ſ� ũ��
 * 
 */

public class MainClass05 {
	public static void main(String[] args) {
		// ������ ���� ����� ���ÿ� �� �����ϱ�
		byte iByte = 10;
		short iShort = 100;
		int iInt = 1000;
		long iLong = 10000;
		
		// ����� ���� ���ڿ��� ����ϱ�
		System.out.println("Byte ��:"+ iByte);
		System.out.println("iShort ��:"+ iShort);
		System.out.println("iInt ��:"+ iInt);
		System.out.println("iLong ��:"+ iLong);
		
		iByte = (byte) (iByte + 120);
		
		iInt += 10;	// iInt = iInt + 10;
				
		System.out.println(iByte);
		System.out.println(iInt);
		
		String str = iInt + "10";
		System.out.println(str);
		
		
	}
	

}
