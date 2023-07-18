package chapter13;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(3);
		// 같은값은 덮어버림 [1,2,3] 만 출력 
		System.out.println(set);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(2);
		set2.add(4);
		System.out.println(set2);
		
		HashSet<Integer> target = new HashSet<>(set); // 클론하는 것  s
		System.out.println("======================");
		target.retainAll(set2); // 교집합
		System.out.println(target);
		
		target = new HashSet<>(set); // 초기화
		System.out.println("======================");
		target.addAll(set2); // 합집합
		System.out.println(target);
		
		target = new HashSet<>(set); // 초기화
		System.out.println("======================");
		target.removeAll(set2); // 차집합 
		System.out.println(target);
	}
}
