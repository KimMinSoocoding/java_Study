package chapter07;

public class Card {
	//숫자, 무늬, 너비, 높이
	String number;
	int kind; // 0클로버 1하트 2다이아 3스페이드
	static int width = 80;
	static int height = 80;
	

	public String toString() {
		String[] kinds = {"클로버", "하트", "다이아", "스페이드"};
		return number + " " + kinds[kind];
	}
	
	
	
}
