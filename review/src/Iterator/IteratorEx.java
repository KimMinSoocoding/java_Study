package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
	public static void main(String[] args) {
		
		// Iterator 메소드에는 hasNext(), next(), remove()가 있다 
		//hasNext() : 읽어올 요소가 남아있는지 확인하는 메소드 , 있으면 true 없으면 false
		//next(): 다음 데이터를 반환 
		//remove(): next()로 읽어온 요소를 삭제 
		//호출 순서는 has -> next -> remove  
		
		ArrayList list = new ArrayList();
		list.add("일");
		list.add("월");
		list.add("수");
		
		// 리스트에 들어있는 "일", "월", "수" 중에서 "수"라는 데이터 삭제예제 
		Iterator iter = list.iterator();
		
		while(iter.hasNext()==true) {
			String day = (String)iter.next();
			if(day == "수") {
				iter.remove();
			}
			System.out.println("Day : " + day);
		}
		System.out.println("--------");
		iter = list.iterator();
		while(iter.hasNext() == true) {
			String day = (String)iter.next();
			System.out.println("Day : " + day);
		}
		
		System.out.println("--------");
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0 ; i <= 100 ; i++) {
			list2.add(i);
		}
		
		
		Iterator<Integer> iter2 = list2.iterator(); // 형식에 맞게 Iterator 참조 
		Integer sum = 0;
		while(iter2.hasNext()) { //있으면 true 없으면 false
			int date = iter2.next(); // next메서드를 사용하여 메서드를 조회 
			System.out.print(date); 
			System.out.println();
//			sum += date;
//			System.out.println(sum);
		}
		
		
		
	}
}
