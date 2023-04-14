package day11.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * [[ Data Class ]]
 * 	���� ��¥�� �ð��� ���� Date ��ü
 * 
 * 
 *
 */

public class MainClass10 {
	public static void main(String[] args) throws ParseException {
		// ��¥ ��ü ����
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		String strDate = sdf.format(date);
		
		System.out.println("strDate : " + strDate);
		
		String yesterday = "2023.04.13 19:08:00";
		
		// parsing ���� �м�
		Date yDate = sdf.parse(yesterday);
		
		System.out.println("yDate: " +yDate);
		
		
	}
	
}
