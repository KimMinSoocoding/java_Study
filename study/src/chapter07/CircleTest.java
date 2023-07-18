package chapter07;

public class CircleTest {
	public static void main(String[] args) {
		new Circle(3).area().cir();
	}
}
class Circle{

	// 반지름
	double r;
	
	public Circle(double r) {
		this.r=r;
	}
	// 넓이무
	Circle area() {
		System.out.println(3.14*r*r);
		return this;
	}
	// 둘레 
	Circle cir() {
		System.out.println(2 * 3.14*r);
		return this;
	}
//	public Circle(int r) { // 오버로딩하면(?) 위에(main안에)있는 Circle("값") 이 "정수"라면 더 가까운 타입 int인 생성자를 호출하게 된다 
//		
//	}
	Circle setR(double r) { 
		this.r = r;
		return this;
	}
	
}
