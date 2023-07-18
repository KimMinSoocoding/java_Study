package studyQuiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		
		// 해당 문자의 대소문자 구분하기 
		String a = "ab";
		String pass = a == a.toLowerCase() ? "소문자 입니다" : a == a.toUpperCase() ? "대문자 입니다" : "알 수 없는 문자입니다";
		System.out.println(pass);
		
		//해당 문자의 영문자인지 숫자인지 구분하기 
		Scanner scn = new Scanner(System.in);
		char ch = ' ';
		
//		String str = " ";
//		str = scn.nextLine()
		
		System.out.println("아무거나 입력해보세요~ 숫자인지 문자인지 판별 해드립니다 ~!");
		String str = scn.nextLine(); // nextLine도 사용가능 : next와 nextLine과 차이점 ..? 
		ch = str.charAt(0); // 형변환 , 0번째 인덱스의 결과값을 읽기
		
		// 문자열을 입력했을때 하나하나의 결과값을 다 알려주기  콘솔로 결과값이 뜨긴 하지만  오류가 뜸 , 
		for(int i=0 ; i<str.length() ; i++) {
			ch = str.charAt(i);
			if('0' <= ch && ch<='9') {
				System.out.println("입력하신 문자는 숫자입니다");
			}else if (('a' <= ch && ch <= 'z') || ('A'<= ch && ch <='Z')) {
				System.out.println("입력하신 문자는 영문자 입니다");
			}
		}
		
//		if('0' <= ch && ch<='9') {
//			System.out.println("입력하신 문자는 숫자입니다");
//		}else if (('a' <= ch && ch <= 'z') || ('A'<= ch && ch <='Z')) {
//			System.out.println("입력하신 문자는 영문자 입니다");
//		}
		
	
		
	    }
	}

