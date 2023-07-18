package review;

import java.time.Month;
import java.util.Scanner;

public class ResidentIdReivew {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int yyyy;
		int mon;
		int day;
//		Resident re = new Resident(yyyy,mon,day);
		while(true) {
			System.out.println("태어난 년도를 입력해주세요 > ");
			yyyy = sc.nextInt();
			if(yyyy < 1900 || yyyy > 2023) {
				System.out.println("잘못된 년도를 기입하였습니다 프로그램을 종료하고 다시 시작합니다");
				continue;
			}
			
			System.out.println("태어난 달을 입력해주세요");
			mon = sc.nextInt();
			if(mon <=0 || mon >12 ) {
				System.out.println("잘못된 달을 입력하셨습니다 프로그램을 종료하고 다시 시작합니다");
				continue;
			}
			System.out.println("태어난 일을 입력해주세요");
			day = sc.nextInt();
			if(day < 0 || mon > 31) {
				System.out.println("잘못된 일을 입력하셨습니다 프로그램을 종료하고 다시 시작합니다");
				continue;
			}
			break;
		}
		Resident re = new Resident(yyyy,mon,day);
		
		
		// 검증용번호 
		// X=(11−(2A+3B+4C+5D+6E+7F+8G+9H+2I+3J+4K+5L)mod11)mod10 
	}

}
class Resident {
	
	// main scanner 에서 출생년도(4자리), 월(1~12), 일(1~31) 입력 받았을때 처리해줄 생성자 
	public Resident(int yyyy, int mon, int day) {
	// 문자열 연결 
//	StringBuilder sb = new StringBuilder();
	StringBuilder by = new StringBuilder();
	// 출생년도 월 일 연결 
//	sb.append(Integer.toString(yyyy).substring(2,4)).append(if(mon>=10){mon;}else{System.out.printf("%02d", mon)});
	by.append(Integer.toString(yyyy).substring(2,4)).append(mon>=10 ? mon : String.format("%02d",mon)) // 받은년도에서 substring + 1자리수 일때 앞에 0
		.append(day >= 10 ? day : String.format("%02d",day)); // 참이면 day그대로 거짓이면 format 앞에 0
	
		System.out.println(by);
	}
}
