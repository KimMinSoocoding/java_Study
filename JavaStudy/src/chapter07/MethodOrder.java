package chapter07;

public class MethodOrder {
	
	public static void main(String[] args) {
		System.out.println("main() start");
		MethodEx me = new MethodEx();
		me.one(); // 메서드실행
		System.out.println("main() end");
		
	}

}
class MethodEx{
	void one() { // 1 
		System.out.println("one start");
		two();
		System.out.println("one end");
	}
	
	void two() {
		System.out.println("two start");
		three();
		System.out.println("two end");
	}
	
	void three() {
		System.out.println("three start");
		System.out.println("three end");
	}
}