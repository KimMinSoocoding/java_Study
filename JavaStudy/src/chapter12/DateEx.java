package chapter12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toLocaleString());
		date.setDate(1);
		
		
		System.out.println(date.getYear()); // 123 이라 나오는 이유 : 100 + 23년도 이기 때문 
		System.out.println(date.getMonth()); // 0이라 나오는이유 Month는 0부터 시작함 
		System.out.println(date.getDate());
		
		System.out.println(date.getDay()); // 0 부터시작 일요일 시작 0 1 2(화요일) 이라는 뜻 
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		// 1. 연도, 월 
		// 2. 시작 날짜의 요일 
		// 3. 마지막 날짜 
	
		int[] lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		date.setMonth(1);
		System.out.println(lastDate[date.getMonth()]);
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("=================");
		for(int i = 1 - date.getDay(); i <=lastDate[date.getMonth()]; i++) {
			if(i >=1) {
				System.out.printf("%3d", i);
			}else {
				System.out.print(" ");
			}
			if(i%7 == (7 - date.getDay()) % 7) System.out.println();
		}
		
		// 주민등록번호 생성기 
		// 스랜덤, 조건식, 문자열, 메서드 형식으로 만들기 , 
		
	}
}
