package chapter09;

public class Player {
	String name; // 이름
	int idx; // 지도상의 플레이어의 현재 위치, 값의 범위는 0 ~ 맵 길이 - 1
	
	
	
	public Player(String name) {
		this.name = name;
	}



	// 주사위 
	// 저장해야될 변수 : 현재위치 타입 int 
	// 행위 :  주사위 굴리기 roll 
	
	// 주사위를 굴림 
//	void roll1() {
//		int dice01 = (int)(Math.random()*6+1);
//		System.out.println("주사위 1번 숫자는 : " + dice01 + "입니다");
//	}
//	
//	void roll2() {
//		int dice02 = (int)(Math.random()*6+1);
//		System.out.println("주사위 2번 숫자는 : " + dice02 + "입니다");
//	}
	
	/**
	 * @return 주사위를 굴린 후 두 주사위의 합계 
	 * 
	 */
	int roll() {
		int d1 = (int)(Math.random()*6)+1;
		int d2 = (int)(Math.random()*6)+1;
		System.out.println("첫번째 주사위"+d1+"번");
		System.out.println("두번째 주사위"+d2+"번");
		System.out.println("두 주사위의 합의"+(d1+d2)+"번 만큼 이동합니다");
		return d1 + d2;
	}
	
	
}
