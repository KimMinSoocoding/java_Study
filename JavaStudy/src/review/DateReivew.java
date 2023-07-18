package review;

import java.util.Date;

public class DateReivew {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		date.setDate(1);
		
		// 월별 마지막 날짜
		int[] lastDate = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		// 달력으로 출력할 달 인덱스값 넣기 0부터 ~ 11
		date.setMonth(1);
		// ()인덱스 값에 해당하는  달의 마지막날짜를 배열에 넣음
		System.out.println(lastDate[date.getMonth()]); 
		// i는 요일 0~6사이 숫자 -1 ex)1- = -3 / -3<=0~11 
		for(int i = 1-date.getDay(); i<=lastDate[date.getMonth()]; i++) {
			if(i>=1) {
				System.out.printf("%3d",i);
			}else {
				System.out.println(" ");
			} 
			if(i%7 == (7-date.getDay()) % 7) System.out.println();
		}
		
	}
}
