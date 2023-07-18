package studyQuiz;

import java.util.Scanner;

public class Quiz04 {	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("원하시는 숫자(소수점 넷째자리 이상까지)를 입력해주세요 ^--^");
		
		System.out.println("반올림");
		double round = scn.nextDouble();
		
		System.out.println("소숫점 넷째 자리에서의 반올림 값은 : " + Math.round(round*1000) / 1000.0);
		
		System.out.println("올림");
		double ceil = scn.nextDouble();
		
		System.out.println("소숫점 넷째 자리에서의 올림 값은 : " + Math.ceil(ceil*1000) / 1000.0);
		
	}
}
