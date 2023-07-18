package studyQuiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두개의 수를 입력하세요");
		
		int a = scn.nextInt(); // 받을 값 
		int b = scn.nextInt(); // 받을 값 
		int c = 0; // 최대공약수 
		
		int min = (a < b) ? a : b; // 삼항연산자를 통해 값을 받은 두개의 수 중 더 작은 수 를 구한다 조건문이 참일경우 b보다 작은수인 a가 될 것이고 
		// 거짓일경우 b(a보다 작은 수)
		
		
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0)
				c = i;
		} // 두수의 나머지가 공통으로 0인 것을 고른다 ex) 14 ( 1,2,7 .... ) 16 (1,2,8...) 공통된 수 1,2 최대공약수 2 
		System.out.println("최대공약수 : " + c);
				
	
		
	}
}
