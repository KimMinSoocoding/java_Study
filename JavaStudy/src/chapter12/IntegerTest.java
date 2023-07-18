package chapter12;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i = 10;
		int i2 = 20;
		
		Integer i3 = new Integer(i2);
		int i4 = i.intValue();
		
		Integer i5 = i2; 
		int i6 = i5;
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i + i2);
		System.out.println(i3);
		System.out.println(i4);
		
		String str = "1";
		Integer i7 = Integer.valueOf(str);
		
		String str2 = i7.toString();
		
		long l = 10;
//		Long l2 = 10; // 불가능, 자기 리터럴밖에안됨 
		Long l2 = 10L; 
		Long l3 = (long)i4;
		
		String.format("%d %d %s", 10, 20, "abcd");
	}
}
