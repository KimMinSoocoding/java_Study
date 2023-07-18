package chapter12;

import java.util.Date;

public class DateEx2 {
	public static void main(String[] args) {
		Date date = new Date(); // 2023-02-01
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());
		
		Date date2 = new Date(); // 2023-12-25
		date2.setMonth(11);
		date2.setDate(25);
		
		long distance = date2.getTime() - date.getTime();
		System.out.println(distance/1000/60 / 60 / 24);
		
	}
}
