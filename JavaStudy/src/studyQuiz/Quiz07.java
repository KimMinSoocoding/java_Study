package studyQuiz;

import java.util.Scanner;

public class Quiz07 {
		
	public static void main(String[] args) {
		
		// 등비수열 구하기 
		// - 처음 숫자와 다음 숫자 그 다음 숫자들의 공비(수열들에게 동일하게 곱하는 값)가 같은 것
		// - 그러면 "처음"숫자를 받고 "공비"를 판단할 수 있는 다음 숫자를 정하고 그것이 *인지 +인지 조건식을 걸어야 한다 
		// - 예를들어 처음 2라는 숫자를 받고 다음 숫자를 4를 한다면 2+2 로 4가 된 것인지 2*2가 된 것인지 구분 할 수 없기 때문에 
		// - ?? 어떻게하지 ㅜ 
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("처음 시작할 숫자와 공비를 판단할 다음 숫자를 입력하세요");
		
		System.out.println("시작숫자 입력하기");
		double a = scn.nextDouble();
		
		System.out.println("공비를 판단할 두번째 숫자를 입력하기");
		double b = scn.nextDouble();
		
		
		
		
		
		
	}
}
