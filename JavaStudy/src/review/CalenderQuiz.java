package review;

import java.time.MonthDay;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class CalenderQuiz {
	public static void main(String[] args) {
//		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		
		
		cal.set(Calendar.DATE, 1);
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("======================");
		for(int i = 1 - (cal.get(Calendar.DAY_OF_WEEK)-1) ; i <=cal.getActualMaximum(Calendar.DATE); i++) {
			if(i >=1) {
				System.out.printf("%3d", i);
			}else {
				System.out.print("  ");
			}
			if(i%7 == (7 - cal.get(Calendar.DAY_OF_WEEK)+1) % 7) System.out.println();
		}
		
		
	}
}
