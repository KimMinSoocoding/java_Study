package chapter12;

import java.util.Objects;

public class StringEx {
	public static void main(String[] args) {
		
		// method, function 구분 메서드는 호출하기 위해서 매개체가 있어야하지만 함수는 매개체가 필요없다
		// 문자열을 자른다면 문자열, 시작위치, 종료위치 세가지가 필요 
		System.out.println("ABCDEF".substring(1,4).substring(1)); // 매서드식 스타일 호출          
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str5 = new String("abcd");
		String str6 = "ab"+"c";
		
		// str1 str2 
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str2.equals(str6));
		System.out.println("=============================");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3.intern()));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode("ab"+"c"));
	
	}
}
