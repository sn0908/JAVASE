package day03.conditional;

public class MainClass05 {
	public static void main(String[] args) {
		// 01 : ȯ�ҽ�û��
		// 02 : ȯ��ó����
		// 03 : ȯ�����
		// 04 : ������ü��
		// 05 : ȯ�ҿϷ�
		// 01, 02, 04 ������ �� ȯ�� �Ұ�!
		
		String rtCd = "02";
		switch(rtCd) {
		case "01" : 
		case "02" :  
		case "04" : 
			System.out.println("ȯ�ҺҰ�!");
			System.out.println("ȯ�һ����ڵ�: " + rtCd);
			break;		// break �� �ᵵ �ȴ�. ������ ������ ������.
		}
		
		if(rtCd.equals("01") || 
			rtCd.equals("02") ||
			rtCd.equals("04")
			) {
			System.out.println("ȯ�ҺҰ�!");
			System.out.println("ȯ�һ����ڵ�: " + rtCd);
			}
	}
}
