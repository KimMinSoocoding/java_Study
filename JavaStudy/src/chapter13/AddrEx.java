package chapter13;

import java.util.HashSet;
import java.util.Set;

public class AddrEx {
	public static void main(String[] args) {
		System.out.println("1111".hashCode());
		System.out.println(new String("1111").hashCode());
		System.out.println(new Addr("1111","홍길동").hashCode());
		
		Set<Addr> addrs = new HashSet<Addr>();
		addrs.add(new Addr("1111", "홍길동"));
		addrs.add(new Addr("2222", "고길동"));
		
		Addr addr = new Addr("3333", "김길동");
		addrs.add(addr);
		addrs.add(addr);
		addrs.add(new Addr("1111","홍길동"));
		
		System.out.println(addrs);
		
		String str1 = "abcd";
		String str2 = new String("abcd");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
	}
}
