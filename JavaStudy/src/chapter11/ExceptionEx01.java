package chapter11;

public class ExceptionEx01 {
	public static void main(String[] args) {
		System.out.println("main() start");
		m1();
		System.out.println("main() end");
		
	}
	
	static void m1() {
		System.out.println("m1 start");
		try {
			m2();
		}catch (ArithmeticException e) {
			System.out.println("m1() 예외처리");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("m1 end");
	}
	static void m2() {
		System.out.println("m2 start");
		System.out.println(1);
		try {
//			System.out.println(2/0);
			throw new ArithmeticException();
			
		} catch (NullPointerException e) {
			System.out.println(2.5);

		} finally {
			System.out.println(2.7);
		}
		System.out.println(3);
		System.out.println("m2 end");
	}
	
}
