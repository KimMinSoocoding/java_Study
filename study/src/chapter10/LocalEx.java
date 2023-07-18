package chapter10;

public class LocalEx {
	public static void main(String[] args) {
		
		Fightable f1 = getFighter();
		Fightable f2 = new Fighter();
		
		// 익명 
		Fightable f3 = getFightable2();
		Fightable f4 = new Fightable() {
			public void fight() {
				System.out.println("f4.fight()");
			}
		};
		
		f1.fight();
		f2.fight();
		f3.fight();
		f4.fight();
	}
	// 지역클래스 
	static Fightable getFighter() {
		class MyFighter implements Fightable{
			public void fight() {
				System.out.println("MyFighter.fight()");
			}
		}
		return new MyFighter();
	}
	
	// 익명클래스 
	static Fightable getFightable2() {
		return new Fightable() {
			public void fight() {
				System.out.println("getFighter2().fight");
			}
		};
	}
}

interface Fightable {
	void fight();
}

class Fighter implements Fightable {
	
	@Override
	public void fight() {
		System.out.println("Fighter.fight()");
		
	}
	
}