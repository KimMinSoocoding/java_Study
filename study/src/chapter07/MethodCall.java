package chapter07;

public class MethodCall {
	int i = 10; 
	static int si = 20;
	
	public static void main(String[] args) {
		
		
		//	직접 실행 
		Method.printName();
		
		// 객체를 생성해서 실행 
		Method m = new Method();
		m.printEmail();
		
		System.out.println(new MethodCall().i); // i는 인스턴스생성자로 호출해야함 
		System.out.println(si); // 클래스 변수는 바로직접 호출가능
	}

}

class Method{
	static void printName() {
		System.out.println("printName()실행");
	}
	
	void printEmail() {
		System.out.println("printEmail() 실행");
		
		printId(); // 다른 메서드 실행 
	}
	
	void printId() {
		System.out.println("printId() 실행");
	}
}