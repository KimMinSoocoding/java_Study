package ArrayLisrReview;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		//add() 메서드 
		colors.add("black");
		colors.add("white");
		colors.add(0,"green");
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		
		// add는 리스트의 가장 끝에 값을 추가한다 
		// 별도로 인덱스를 지정하면 해당 인덱스에 값이 추가되고 그 인덱스부터 값들이 1 칸씩 밀린다 
		colors.set(0, "blue");
		System.out.println(colors);
		// 0 번인덱스에 green이 추가되면서 한칸씩 밀림, 마지막으로 set메소드를 통해 가장 앞(0)이 green이  blue로 변경 
		
		//Array 엘레멘트 삭제 : 추가했던 값을 삭제할 때는 remove()메소드 호출 , 전체삭제할때는 clear 호출 
		colors.remove(0); // 인덱스로 값을 지울경우 삭제되는 엘레멘트를 리턴받을 수 있음 / 값을 지움과 동시에 해당값이 필요하다면 리턴을 받아 사용가능 
		colors.remove("black");
		System.out.println(colors);
		String removeColor = colors.remove(0); // 삭제하고자하는 값을 removeColors로 넣기 
		System.out.println("removeColor : " + removeColor); // white 값 나옴 
		
		//ArrayList 전체 값 확인 
		for (String color : colors) {
			System.out.print(color + " ");
		}
		
		System.out.println();
		for(int i=0; i < colors.size(); i++) {
			System.out.print(colors.get(i) + " ");
		}
		
		System.out.println();
		
		// 값 존재 유무 확인 :  값이 존재하는지, 존재한다면 어느 위치에 존재하는지 
		// contains() 사용 
		boolean contains = colors.contains("black");
		boolean contains2 = colors.contains("red");
		System.out.println(contains); // 값 존재유무 true / false로 리턴 
		System.out.println(contains2);
		
		int index = colors.indexOf("red");
		System.out.println(index); //  값이 존재하는 경우 해당 값의 인덱스를 리턴해줌 , 값이 존재하지 않을경우 -1을리턴 
	}
}
