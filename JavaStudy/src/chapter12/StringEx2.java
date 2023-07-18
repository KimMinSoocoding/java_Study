package chapter12;

public class StringEx2 {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); // 시작시간
		String s = "";
		StringBuffer buffer = new StringBuffer(s);
		for(int i=0; i < 100_000; i++) {
//			s +="0";
			buffer.append("0");
		}
		long end = System.currentTimeMillis(); 
		
		System.out.println(end - start + "ms");
		System.out.println(buffer.toString().length());
	}

}
