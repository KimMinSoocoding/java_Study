package chapter12;

import java.util.Arrays;

public class EqualsTest {
	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		
		a.i = 10;
		a2.i = 10;
//		System.out.println(a == a2);
//		System.out.println(a.equals(a2));
		
		// a3
		A a3 = a.clone(); // 있는데 안보임 clone은 자바랭 , a3는 패키지 12 
		
		A a4 = a; // 복사 
		a.i=20;
		a3.arr[1] = 10;
		a3.arr2[1] = 30;
		System.out.println(a);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println(System.currentTimeMillis());
	}
}

class A implements Cloneable{
	int i;
	int[] arr = {1,2,3};
	int[] arr2 = {3,4,5};
	
	public boolean equals(Object obj) {
		return i == ((A)obj).i;
	}
	
	@Override
	protected A clone() {
		A a = null;
		try {
			a = (A)super.clone();
			a.arr = this.arr.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	 }

	@Override
	public String toString() {
		return "A [i=" + i + ", arr=" + Arrays.toString(arr) + ", arr2=" + Arrays.toString(arr2) + "]";
	}

//	@Override
//	public String toString() {
//		return "A [i=" + i + ", arr=" + Arrays.toString(arr) + "]";
//	}
	
	
}
