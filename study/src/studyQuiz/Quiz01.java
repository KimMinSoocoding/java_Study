package studyQuiz;

public class Quiz01 {
	public static void main(String[] args) {
		// - 과일바구니 갯수 계산 
		// ( 과일숫자(사전값)ex:123 , 바구니당 가능한 과일 숫자(사전값) ex:10 , 필요한 바구니숫자를 구하여라)
		int fruit = 130;
		int basket = 5;
		
		int basketCount = fruit/basket;
		
		System.out.println("현재 과일갯수는 : " + fruit + " 이고 바구니당 담을 수 있는 과일 갯수는 : " + basket + " 이고 필요한 바구니 갯수는 " 
						+ basketCount +"입니다"  );
		
		// 나머지 0인지 아닌지 구분하는 조건식
		if(fruit % basket == 0) {
			System.out.println("필요한 바구니 : " + basketCount + "개"); // 나머지 0
		}else {
			System.out.println("필요한 바구니 : " + (basketCount + 1) + "개"); // 나머지 0이아
		}
		
		
	}
}
