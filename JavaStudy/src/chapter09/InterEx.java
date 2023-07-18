package chapter09;

public class InterEx {
	public static void main(String[] args) {
		I i = new B();
		i.m2();
		
		A a = new B();
		a.m1();
		// 형변환하여 사용가능 
		((A)i).m1();
		((B)i).m1();
		
		((B)a).m2();
		((I)a).m2();
		
		C c = new C();
		c.m2(); 
		
		System.out.println(i);
		System.out.println(a);
	}
}

abstract class A {
	
	abstract void m1();
	
}

class B extends A implements I {
	
	@Override
	void m1() {
		System.out.println("B.m1()");
	}
	
	@Override
	public void m2() {
		System.out.println("B.m2()");
	}
}

class C implements I{
	@Override
	public void m2() {
		System.out.println("C.m2");
	}
}

interface I {
	void m2(); // public abstract 생략되어있음 
}