package chapter08;

public class Ex {
	public static void main(String[] args) {
		
//		System.out.println(new RectEx(4, 5).getArea());
//		System.out.println(new RectEx(4, 5).cir());
//		System.out.println(new CubeEx(3, 4, 5).getArea());
//		System.out.println(new CubeEx(3, 4, 5).volumn());
		
		ShapEx[] shapes = new ShapEx[3];
		shapes[0] = new RectEx(3,4);
		shapes[1] = new RectEx(6,10);
		shapes[2] = new CubeEx(6, 10, 4);
		
		for(int i=0; i<shapes.length; i++) {
			System.out.print(shapes[i].getClass().getSimpleName()+"의");
			if(shapes[i] instanceof Shape2D) {
				System.out.println("둘레 : " + ((Shape2D)shapes[i]).cir());
			}else if(shapes[i] instanceof Shape3D) {
				System.out.println("부피 : " + ((Shape3D)shapes[i]).volumn());
			}
			System.out.println("넓이 : "+shapes[i].getArea());
		}
	}
}


interface Shape2D {
	double cir();
}
interface Shape3D {
	double volumn();
}


abstract class ShapEx {
	private int x;
	abstract double getArea();
	
	public ShapEx() {}
	public ShapEx(int x) { this.x=x;}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}

class RectEx extends ShapEx implements Shape2D{
	private int y;
	public RectEx(int x, int y) {
		super(x);
		this.y=y;
	}
	@Override
	double getArea() {
		return getX() * y;
	}
	
	public double cir() { // 접근제한자를 줄였기때문에 인터페이스 접근제한자와 최소 동등하게 맞춘다 public 로 
		return (getX()+y)*2;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class CubeEx extends ShapEx	implements Shape3D {
	private RectEx rect; // 육면체가 사각형이다 라는 개념보다는 육면체는 도형이다 그리고 그 육면체안에 Rect가 포함되어있다 가 더 타당하다 
	public CubeEx(int x, int y, int z) {
		super(z);
		rect = new RectEx(x, y);
//		this.x = z;
	}
	
	@Override
	double getArea() {
		return rect.getArea() * 2 + rect.cir() * super.getX();
	}
	
	public double volumn() { // 위에와 마찬가지로 인터페이스와 접근제한자를 맞춰주기 
		return rect.getArea() * super.getX();
	}

	@Override
	public int getX() {
		return rect.getX();
	}

	@Override
	public void setX(int x) {
		rect.setX(x);
	}

	public int getY() {
		return rect.getY();
	}

	public void setY(int y) {
		rect.setY(y);
	}

	public int getZ() {
		return super.getX();
	}

	public void setZ(int z) {
		super.getX();
	}
	
	
}