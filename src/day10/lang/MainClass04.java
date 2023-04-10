package day10.lang;

/*
 * [[ String Class ]]
 * 	���ڿ��� �ٷ�� Ŭ����
 *	�Һ�(immutable)�� ��ü - �޸𸮿��� ���ڿ� ���� ������� �ʴ´�. 
 * 		1. �޸� ����
 * 		2. Security Up
 * 		3. Thread Safe
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		str1 = "def";
		System.out.println(System.identityHashCode(str1));
		
		// ���ڿ� ���� length
		String txt = "ABCDEFGHIJK";
		System.out.println("length : " + txt.length());
		
		// ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ�
		String str4 = "apple";
		boolean startsWith = str4.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
		// ���ڿ� �������� ������ ���ڰ� �ִ��� �Ǵ�
		String str5 = "text";
		boolean endsWith = str5.endsWith("t");
		System.out.println("endsWith : " + endsWith);
		
		// ���� �ε�����ȣ ��ȯ
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println("indexOf : " + indexOf);
		
		// ���ڿ��� ������ ���ڰ� ������ ���°�� �ִ��� int�� ��ȯ
		String str7 = "AndroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println("lastIndexOf : " + lastIndexOf);
		
		// ���� ġȯ
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println("replace : " + replace);
		
		// ���ڿ� ������(�迭�� ��ȯ) - ���� �����
		String str9 = "A:B:C:D:abcd";
		String[] splits = str9.split(":");	// {"A", "B", "C", "D", "abcd"}
		for(String split : splits) {
			System.out.println(split);
		}
		
		// ���ڿ� ����
		String str10 = "ABCDEF";
		String substring = str10.substring(0, 2);
		System.out.println("substring : " + substring);
		
		// �ҹ��� ��ȯ
		String str11 = "abcDEf";
		String toLowerCase = str11.toLowerCase();
		System.out.println("toLowerCase : " + toLowerCase);
		
		// �빮�� ��ȯ
		String str12 = "abcDEF";
		String toUpperCase = str11.toUpperCase();
		System.out.println("toUpperCase : " + toUpperCase);
		
		// ��������
		String str13 = "      java java java        ";
		String trim = str13.trim();
		System.out.println("trim : " + trim);
		
		// ���� ���� ��������
		String str14 = "      java java java        ";
		String replace2 = str14.replace(" ", "");
		System.out.println("replace �������� : " + replace2);
		
		// ���ں�
		String str15 = "A";
		String str16 = "B";
		int compareTo = str15.compareTo(str16);
		System.out.println("compareTo : " + compareTo);
		if(compareTo > 0) {
			System.out.println(str15 + " > " + str16);
		} else if(compareTo == 0) {
			System.out.println(str15 + " = " + str16);
		} else {
			System.out.println(str15 + " < " + str16);
		}
		
		// ���� ���Կ���
		String str17 = "abcd";
		String str18 = "c";
		boolean contains = str17.contains(str18);
		System.out.println("contains: " + contains);
		
		// ���ڿ��� �������� �ٷ�� ���� Ŭ����
		// String�� �޸� ����(mutable)�̴�.
		// Thread Safe O!
		StringBuffer sb = new StringBuffer();
		// ���ڿ� �߰�
		sb.append("abc");
		System.out.println("sb : " + sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println("sb : " + sb);
		System.out.println(System.identityHashCode(sb));
		
		// ���ڿ� ����
		sb.insert(6, " java");
		System.out.println("sb : " + sb);
		
		// ���ڿ� ����
		sb.delete(7, 8);
		System.out.println("sb : " + sb);
		
		sb.replace(6, 7, " j");
		System.out.println("sb : " + sb);
		
		sb.reverse();
		System.out.println("sb : " + sb);
		
		
		// StringBuffer ������ ����� �Ѵ�.
		// Thread Safe X �ƴϴ�!
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("abc");
		sBuilder.append("def");
		System.out.println("sBulider : " + sBuilder);
		
		
		
		
		
		
		
		
		
	}

}
