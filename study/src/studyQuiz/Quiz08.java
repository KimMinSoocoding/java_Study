package studyQuiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
	
		// 피보나치 수열 1,2,3,5,8 .... 앞에 숫자와 더한 값을 나열한 것 
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("범위 값 입력"); // 정수로만 입력 , 정수인지 유효성검사(?)
		int Range = scn.nextInt();
		
		int a = 0; 
		int b = 1;
		int sum = 1; // 첫번째 값 1 
		
		for(int i=0; i<Range; i++) {
			sum = a+b; // 0(a)+1(b)=1(sum) , 1(a)+1(b)=2(sum) , 1(a)+2(b)=3(sum) , 2(a)+3(b)=5(sum)....
			a=b; // 1(a) , 1(a) , 2(a) , 3(a).....
			b=sum; // (b)=1(sum), (b)=2(sum), (b)=3(sum) , (b)=5(sum) ...
			System.out.println(sum+",");
		}
		
		
		
		
	}
}
