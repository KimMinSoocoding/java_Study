package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add((int)'a');
//		list.add(""); // Integer 으로 해놨으므로 오류 
		
		// add. get 
		// add: 추가   add( ? ); 어떤타입이 들어갈건지 : 타입을 확정시키는 것은 제네릭
		// get : 조회    ? get();  - Integer로 정한걸로 결과출력 
		
		// list의 합계 구하기 2가지 방법 
		int sum = 0;
		for(int i = 0 ; i <list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
		sum = 0; 
		for(Integer value : list) {
			sum += value;
		}
		System.out.println(sum);
		
		System.out.println("==========");
		
		List<Object> list2 = new ArrayList<>();
		
		list2.add(10);
		list2.add(12);
		list2.add(15);
		
		int sum2 = 0;
		for(int i=0 ; i<list2.size(); i++) {
			sum2 += (Integer)list2.get(i);
		}
		System.out.println(sum2);
		
		sum2=0;
		for(Object i : list2) {
			sum2 +=(int)i;
		}
		System.out.println(sum2);
		
		System.out.println(list.size());
		System.out.println(list);
	}
}
