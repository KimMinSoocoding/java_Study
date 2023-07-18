package chapter08;

public class Programmer extends Emp {
	void work() {
		System.out.println("개발 업무 합니다");
	}
	
	void goWork() {
//		goWork(); // 재귀호출 나자신을 호출하는 것 
		System.out.print("개발자 ");
		super.goWork();
	} 
}
