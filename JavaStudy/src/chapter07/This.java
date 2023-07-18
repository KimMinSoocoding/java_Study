package chapter07;

public class This {
	int i = 1; 
	
	public This() {
		int i = 10;
		System.out.println(i);
	}
	
	public This(int i) {
		this.i = i;
	}
	void printThis() {
		System.out.println(this); // 사용되어질 예정 
	}
	
	This getThis() {
		return this;
	}
	
	public static void main(String[] args) {
		This this1 = new This(10); // 주소 
		This this2 = new This(20); // 주소 
		System.out.println(this1);
		this1.printThis();
		this2.printThis();
	}
}
