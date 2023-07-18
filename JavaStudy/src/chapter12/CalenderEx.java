package chapter12;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderEx {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		
		calendar.set(Calendar.YEAR, 2022);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		// add, roll
		calendar.set(2023, 0, 1, 0, 0, 0);
		calendar.add(Calendar.MONDAY, -3);
		calendar.roll(Calendar.MONDAY, 11);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime()));
	}
}
