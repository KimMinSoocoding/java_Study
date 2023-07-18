package chapter10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class QuterEx {
	public static void main(String[] args) {
		Quter outer = new Quter();
		
		Quter.SInner sInner = new Quter.SInner(); // SInner를 생성하는데 Quter의 위치에 있다는 뜻 
		
		Quter.Inner inner = new Quter().new Inner(); // 인스턴스 부로부터 생성해야됨 
		Quter.Inner inner2 = outer.new Inner();
		
		// 클래스 내 변수의 외부접근
		System.out.println(Quter.SInner.si3);
		System.out.println(sInner.i3);
		
		System.out.println(inner.i2);
		System.out.println(Quter.Inner.si2);
		
		// 맛보기 map 
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		System.out.println(map);
		System.out.println(map.get("B"));
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
}

class Quter{
	
	// iv 
	int i;
	// cv 
	static int si;
	
	class Inner{
		int i2;
		static int si2;
		{
			i = 10;
			si = 20;
		}
	}
	static class SInner{ //"스태틱 맴버클래스" - 외부클래스의 인스턴스가 필요하다 
		int i3;
		static int si3;
		{
//			i = 30; 클래스 메서드와 마찬가지로 접근불가 ~ 
			si = 40;
		}
	}
	
}
