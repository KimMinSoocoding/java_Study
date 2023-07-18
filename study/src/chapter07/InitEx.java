package chapter07;

//import java.util.Arrays;
import java.util.Date;
import java.util.*;

//import student.Student;


public class InitEx {
	// arr이라는 이름을 가지는 int 타입의 일차원배열을 생성, 10개의 공간으로 초기화, 클래스 변수 
	
	static int[] arr = new int[10];
	
	
	
//	Student student = new Student();
	
	Date date; // 임포트 시켜줘야함 
	
//	java.sql d2;
	
	
	// 10의 공간의 임의의 숫자를 배정해서 초기화 단 0~100 사이의 5의 배수로 지정
	
   static {
    	for(int i=0; i < arr.length; i++) {
    		arr[i] = (int)(Math.random()*9)*5+60;
    	}
    	
    }
    
    public static void main(String[] args) {
    	new InitEx();
		System.out.println(Arrays.toString(arr));
		new InitEx();
		System.out.println(Arrays.toString(arr));
	}
    
    // 인스턴스 초기화와 static 초기화의 차이점 , 클래스 변수 초기화는 딱 1번만 실행하기 떄문에 위에처럼 두번 호출해도 같은값이 나온다
    // 인스턴스 초기화는 두개의 선언 값이 다르다 

}

