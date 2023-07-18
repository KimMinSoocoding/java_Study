package chapter13;

import java.util.Set;
import java.util.TreeSet;

public class SetEx  {
	public static void main(String[] args) {
		Set<Addr> addrs = new TreeSet<Addr>(); // 중복 및 순서, 정렬관리 해줌 
		addrs.add(new Addr("1111","홍길동")); // 대소비교를 할수있게끔 만들어줘야함 
		addrs.add(new Addr("1115","홍길동"));
		addrs.add(new Addr("1113","홍길동"));
		addrs.add(new Addr("1112","홍길동"));
		addrs.add(new Addr("1114","홍길동"));
		
		System.out.println(addrs);
	}
}
