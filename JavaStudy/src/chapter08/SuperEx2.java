package chapter08;

public class SuperEx2 {

}

class Parent2{
	
	String name;
	
	 Parent2(String name) {
		 super();
		 this.name = name;
	}
}

class Child2 extends Parent2{ // 에러발생 부모가 "기본생성자가 없음" 
	public Child2() {
		super(null);
	}
}