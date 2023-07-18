package studyQuiz;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요");
		int a = scn.nextInt(); 
		
		int a50000 = a/50000;
		
		int a10000 = a/10000; 
		
		int a1000 = a/1000; 
		
		int a100 = a/100; 
		
		System.out.println("오만원권 : " + a50000 + " 개");
		System.out.println("만원권 : " + a/10000 + " 개");
		System.out.println("천원권 : " + a/1000 + " 개");
		System.out.println("백원권 : " + a/100 + " 개");
		
		
	
		
	}
}
