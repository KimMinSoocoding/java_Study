package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableEx {
	public static void main(String[] args) {
		List<Player> players = new ArrayList<>();
		players.add(new Player("a",899));
		players.add(new Player("b",982));
		players.add(new Player("c",1090));
		players.add(new Player("d",1019));
		
		Collections.sort(players);
		System.out.println(players);
		
		Comparator<Player> comparator = new Comparator<Player>() {
		    @Override
		    public int compare(Player a, Player b) {
		        return b.getScore() - a.getScore();
		    }
		};

		Collections.sort(players, comparator);
		System.out.println(players);
		
		// Comparator 객체를 Collections.sort() 메서드의 두번째 인자로 넘겨서 이전 섹션과 동일한 정렬 결과를 만든다 
		// 이렇게 Comparator 객체를 인자로 넘기면 정렬 대상 객체가 Comparble 인터페이스를 구현 여부와 상관없이 넘어온 Comparator 
		// 구체의 compare() 메서드 기준으로 정렬을 수행한다 compare() 메서드는 비교대상 2개의 객체를 인자를 차례로 받는다 
		// 첫번째 인자가 두번째인자보다 작다면 음수, 같다면 0 , 크다면 양수를 리턴 
	}
}
