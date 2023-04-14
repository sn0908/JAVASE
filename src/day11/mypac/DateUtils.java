package day11.mypac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	/**
	 * getDate()
	 * 	- ���� ��¥ yyyy�� MM�� dd�� ���ڿ� ��ȯ 
	 * @return
	 */
	public String getDate() {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String strDate = sdf.format(date);
		
		return strDate;
		
	}
	
	/**
	 * getDateAndDay()
	 * 	- yyyy�� MM�� dd�� (����)
	 * 
	 * @return
	 */
	public String getDateAndDay() {
		String strDate = getDate();
		
		// ���ϰ� ��ȯ 0~6(��~��)
		int iDay = new Date().getDay();
		switch(iDay) {
			case 0 : strDate += " (��)"; break;
			case 1 : strDate += " (��)"; break;
			case 2 : strDate += " (ȭ)"; break;
			case 3 : strDate += " (��)"; break;
			case 4 : strDate += " (��)"; break;
			case 5 : strDate += " (��)"; break;
			case 6 : strDate += " (��)"; break;
		}
		
		return strDate;
	}
	
	/**
	 * getDateTimeAndDay()
	 * - yyyy�� MM�� dd�� HH:mm:ss (����)
	 * 
	 * @return
	 */	
	public String getDateTimeAndDay() {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String strDate = sdf.format(date);
		
		// ���ϰ� ��ȯ 0~6(��~��)
		int iDay = new Date().getDay();
		switch(iDay) {
			case 0 : strDate += " (��)"; break;
			case 1 : strDate += " (��)"; break;
			case 2 : strDate += " (ȭ)"; break;
			case 3 : strDate += " (��)"; break;
			case 4 : strDate += " (��)"; break;
			case 5 : strDate += " (��)"; break;
			case 6 : strDate += " (��)"; break;
		}
		return strDate;		
	}
	
	public String dateCalc(
				String strDate,
				String format,
				int addYear,
				int addMonth,
				int addDate,
				int addHour,
				int addMinute,
				int addSecond
			) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		cal.add(Calendar.YEAR, + addYear);
		cal.add(Calendar.MONTH, + addMonth);
		cal.add(Calendar.DATE, + addDate);
		cal.add(Calendar.HOUR_OF_DAY, + addHour);
		cal.add(Calendar.MINUTE, + addMinute);
		cal.add(Calendar.SECOND, + addSecond);
		
		return sdf.format(cal.getTime());
		
		
		
		
		
		
		
	}
	
	
}
