package studyQuiz;

import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		
		// - 숫자 두개를 입력받아 (직각 삼각형의 밑변, 높이) 둘레와 넓이를 구하시오 
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("밑변과 높이를 입력해주세요 직각삼각형 넓이를 구해드립니다~");
		
		System.out.println("밑변");
		double base1 = scn.nextDouble();
		System.out.println("높이");
		double Height1 = scn.nextDouble();
		
		System.out.println("직각삼각형의 넓이 : " + (base1*Height1/2));
		
		System.out.println("밑변과 높이를 입력해주세요 직각삼각형 둘레를 구해드립니다~");
		
		System.out.println("밑변");
		double base2 = scn.nextDouble();
		System.out.println("높이");
		double Height2 = scn.nextDouble();
		
		// 빗변 
		double hypotenuse = ((Math.pow(base2, 2) + Math.pow(Height2, 2)))/2;
		
		double a = Math.pow(base2, 2);
		System.out.println();
	
		System.out.println("둘레 : " + (base2+Height2+hypotenuse) );
		
	}

}
