package chapter08;

public abstract class Emp {
	String name;
	
	abstract void work();
	
	void goWork() {
		System.out.println("출근합니다");
	}
	
	void getOffWork() {
		System.out.println("퇴근합니다");
	}
}
