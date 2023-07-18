package chapter08;

public class TexiMain {
	public static void main(String[] args) {
		Car t = new Texi();
		t.go();
		System.out.println(t); // 주소가 Texi로 나오게됨 new Texi 인스턴스때문
		
		Texi t2 = (Texi)t;  // t는 문법적으로 Car타입이여서 형변환해주어야함 
		
		Car car = new Car();
		
		Texi t3 = (Texi)car;  // 에러발생 상속이 뒤바뀜
		
		// 조상타입 자손인스턴스
		
//		Phone p = (Phone)new Car(); // 관계가없어서 에러 문법적으로도 불가
		
		Car c = t2; // 가능 타입이 조상
		
		Object o = new int[5]; // 배열은 길이를 알 수 있는 프로퍼티가 있다 
		
		System.out.println(((int[])o).length);
	}
}
