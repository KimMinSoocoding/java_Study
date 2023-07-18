package studyQuiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		// 소수 구하기 : 나누어 지는게 1과 나 자신만 있는 것
		
//		- for문으로  범위구간을 반복하며 소수인지 판가름
//		- 소수를 구분할 변수 b 생성
//		- 조건문으로 소수를 판가름
		
		Scanner scn = new Scanner(System.in);
		System.out.println("소수를 구할 범위(수)를 입력하세요");
		
		int a = scn.nextInt(); // 범위 
		
	      for(int i=2; i<=a; i++) { // 예 ) 범위 100을 입력 하였을때 2~100 
	    	  int b = 0; // 소수구분 변수 b
              for(int j=1; j<=i; j++){ // i까지 증가하는 j
                   if(i%j ==0)  // 메모 * 예를들어 i가 9가 되었다 치자 그렇다면 b가 +1이 되는 조건은 나머지가 0 일때만 가능하다 9는 1,3,9 총 세가지 경우로 나누어 지기 때문에 소수에 부합하지 않다. 그렇다면 b==2가 아니므로 9는 걸러진다  
                        b = b+1; // 
              	}    
              if(b==2) // b가 소수인지 검사 ? 왜 ? 소수는 나누어지는게 1과 나 자신만 있어야한다 
            	  //그럼 두가지 경우의 수 밖에 없다 그렇다면 당연히 b = b +1 이 2가 되는 것이 소수 일 것 
            	  System.out.print(i+" ");
	      }
	      
                        
	      
	   
	}
}
