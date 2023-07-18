package chapter12;

import java.lang.reflect.Method;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ClassTest test1 = new ClassTest();
		
		// 1번방법 : 이미 만들어진 인스턴스를 통해 생성 
		Class c1 = test1.getClass();
		
		// 2번방법 : forName메서드를 통해 생성
		Class c2 = Class.forName("chapter12.ClassTest"); // 패키지이름 포함 
		
		// 3번방법 : 클래스 리터럴을 통해 생성 
		Class c3 = ClassTest.class;
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		Method[] methods = c3.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
		Object o = c3.newInstance();
		
		System.out.println(o);
		// method, function 구분 메서드는 호출하기 위해서 매개체가 있어야하지만 함수는 매개체가 필요없다
		// 문자열을 자른다면 문자열, 시작위치, 종료위치 세가지가 필요 
		
	}
}
