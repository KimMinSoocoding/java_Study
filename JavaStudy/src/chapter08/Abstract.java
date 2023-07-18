package chapter08;

public class Abstract {
	public static void main(String[] args) {
		C c = new C();
		c.a();
		c.b();
		c.c();

		B b = new C(); // 
		b.a();
		b.b();
		b.c();
		
		B b2 = new B() {
			
			@Override
			void c() {
				// TODO Auto-generated method stub
				System.out.println("anony c()");
			}
		};
		b2.a();
		b2.b();
		b2.c();
		
	}
}
// 

abstract class A {
	abstract void a();
	abstract void b();
	abstract void c();
}

abstract class B extends A {
	void a() {
		System.out.println("B.a()");
	};
	void b() {
		System.out.println("B.b()");
	};
}

class C extends B{

	@Override
	void c() {
		// TODO Auto-generated method stub
		System.out.println("C.c()");
	}
	
}