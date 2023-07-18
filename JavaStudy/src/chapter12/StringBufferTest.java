package chapter12;

public class StringBufferTest {
	public static void main(String[] args) {
		String str = new String();
		str = str.concat("a").concat("가");
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();
		sb.append("abcde").append("가나다라").delete(1, 3).append("1234").insert(2, 12); // insert 해당시작숫자 , boolean , 문자 숫자올수 있
		System.out.println(sb);
	
		String str2 = new String(sb);
	}
}
