package chapter08;

//Shape(도형), 
//Rect(사각형), Tri(삼각형:직각), Circle(원), // 둘레, 넓이 
//Cylinder(원기둥),Cube(육면체), Prizm(삼각기둥) // 부피, 겉넓이 
//도형을 제외한 나머지애들의 기본생성자는 안만들기 

public class ShapeEx {
	public static void main(String[] args) {
		// 직사각형
		Rect rect = new Rect(7,4);
		rect.RectCircumference();
		rect.RectArea();
		
		
		System.out.println("==================");
		
		// 직각삼각형
		Tri tri = new Tri(3,5,6);
		tri.TriCircumference();
		tri.TriArea();
		
		System.out.println("==================");
		
		// 원
		Circle cir = new Circle(10);
		cir.cirCircumference();
		System.out.println("원의 둘레는"+cir.cirCircumference()+"입니다");
		cir.cirArea();
		System.out.println("원의 넓이는"+cir.cirArea()+"입니다");
		
		System.out.println("==================");
		
		// 원기둥 
		Cylinder cyl = new Cylinder(20);
		cyl.cylOutArea();
		cyl.cylVolume();

		
		System.out.println("==================");
		
		// 직육면체 
		Cube cube = new Cube(7,4,3);
		cube.cubeOutArea();
		cube.cubeVolume();
		
	}
}


class Shape {
	int x;
	int y;
	int z;
	int area;
	double radius;
	double Value;
}

// 직사각형
class Rect extends Shape{
	
	public Rect(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void RectCircumference() {
		area = (x+y)*2;
		System.out.println("직사각형의 둘레는" +area+"입니다");
	}
	
	void RectArea() {
		area = x*y;
		System.out.println("직사각형의 넓이는" +area+"입니다");
	}
}

// 직각삼각형
class Tri extends Shape{
	
	public Tri(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	void TriCircumference() {
		area = x+y+z;
		System.out.println("직각삼각형 둘레는" +area+"입니다");
	}
	
	void TriArea() {
		area = (x*y)*1/2;
		System.out.println("직각삼각형 넓이는" +area+"입니다");
	}
	
}

// 원
class Circle extends Shape{
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	double cirCircumference() { // 원의 둘레
		Value = Math.round((2 * radius) * Math.PI * 1000)/1000.0;
//		System.out.println("원의 둘레는"+Value+"입니다");
		return Value;
	}
	
	double cirArea() { // 원의 넓이
		Value = Math.round((radius * radius * Math.PI)*1000)/1000.0;
//		System.out.println("원의 넓이는" +Value+"입니다");
		return Value;
	}
}

// 원기둥 
class Cylinder extends Circle{

	
	public Cylinder(int y) {
		super(10);
		this.y=y;
	}
	
	void cylOutArea() {
//		cylArea(cirArea());
		Value = (cirArea() + (cirCircumference()*y)) * 2;
		System.out.println("원기둥의 겉넓이는"+Value+"입니다");
	}
	
	void cylVolume() {
		Value = cirArea() * y;
		System.out.println("원기둥의 부피는" + Value + "입니다");
	}
	
}


// 육면체
class Cube extends Shape{
	
//	public Cube(int z) {
//		super(7,4);
//		this.x=x;
//		this.y=y;
//		this.z=z;
//	}	
	public Cube(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	void cubeOutArea() {
		area = x * y * z;
		System.out.println("직육면체의 부피는" + area + "입니다");
	}
	
	void cubeVolume() {
		area = (x*y)*2 + (x*z)*2 + (y*z)*2;
		System.out.println("직육면체의 겉넓이는" + area + "입니다");
	}
	
	
}

// 삼각기둥
class Prizm extends Shape{
	
}

