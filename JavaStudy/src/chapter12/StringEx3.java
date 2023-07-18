package chapter12;

import java.util.Arrays;

public class StringEx3 {
	public static void main(String[] args) {
		String str ="abcdeabcde";
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("c",4)); //  4번인덱스 부터 찾음 
		System.out.println(str.lastIndexOf("c"));
		System.out.println(str.lastIndexOf("c", 6));
		
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,7));
		
		// 순차 탐색시 처음 만나는 c의 위치부터 끝까지 문자열을 자르세요.
		System.out.println(str.substring(str.indexOf("c")));
		
		// 대소문자 변환 
		System.out.println(str.toUpperCase());
		
		// a로 시작하면 true 아니면 false
		System.out.println(str.startsWith("ab"));
		System.out.println(str.startsWith("cd"));
		System.out.println(str.contains("ea"));
		System.out.println(str.contains("eac"));
		
		System.out.println(str.replace("a", "f")); // a를 f로 치환 
		System.out.println(str.replaceFirst("a", "f")); // 처음만나는 a만 f로 치환 
		
		System.out.println(str.split("")[1]);
		System.out.println(Arrays.toString(str.split(""))); //
		System.out.println(Arrays.toString(str.split("c"))); // 구분자를 쓴다 c를 ,처럼 쓴다 
		
		char[] chs = str.toCharArray();
		String s2 = new String(chs);
		
		System.out.println("===========================================");
		
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B3%B4%EB%8D%94%EC%BD%9C%EB%A6%AC";
		// https : 프로토콜 
		System.out.println(url.substring(0,4));
		System.out.println(url.substring(url.indexOf("h"),4));
		// search.naver.com : 도메인 
//		System.out.println(url.indexOf("search",4));
//		System.out.println(url.indexOf("com",4));
		System.out.println(url.split("/")[2]);
		System.out.println(url.substring(8,24));
		// search.naver : 파일&폴더명 

//		System.out.println(url.indexOf("search",10));
//		System.out.println(url.indexOf("?",10));
		System.out.println(url.substring(25,37));
		System.out.println(url.substring(url.indexOf("s",10),37));
		// where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B3%B4%EB%8D%94%EC%BD%9C%EB%A6%AC: 쿼리스트링
		// ? 이후 부터 & 로 끊어서 출력하면 됨 
//		System.out.println(url.indexOf("&",10)); //& 처음 인덱스 찾기 : 52 
		String[] str01 = url.split("&");
		
		System.out.println(url.substring(url.indexOf("?"),52));
		System.out.println(url.substring(url.indexOf("?"),url.indexOf("&")));
		int str2 = url.indexOf("&");
		System.out.println(url.substring(str2,url.indexOf("&",53)));
		
		
		
	}
}
