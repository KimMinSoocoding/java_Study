package chapter07;

public class MemberMain {
	public static void main(String[] args) {
		// new : 인스턴스 생성 
		// new : 생성자를 호출해 힙 영역에 필드를 초기화 후 주소를 확보해 반환하는 연산자 
		String str = "abcd";
		String str2 = new String();
		Member m = new Member(); 
		
		Member m2 = m;
		// 객체 entity , 객체 object 
		if(m == m2) {
			System.out.println("m객체와 m2객체는 같다.");
		}
		else {
			System.out.println("m객체와 m2객체는 다르다");
		}
	}
}
