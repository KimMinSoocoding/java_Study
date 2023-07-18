package chapter07;

public class Deck {
	Card[] cards;
	{
		cards = new Card[52];
		String numbers = "A23456789XJQK"; // 13

		int cnt = 0;
		for(int j=0; j<4; j++) { // 4
			for(int i=0; i<numbers.length(); i++) { // 13
				cards[cnt] = new Card(); // 배열의 공간을 확보 
				cards[cnt].number = numbers.charAt(i) + ""; // "" = 문자열로 변환 (?) 
				cards[cnt].kind = j;
				cnt++;
			} // for
		} // for2 
		
	}
	
	void shuffle() {
		for(int i = 0 ; i < cards.length ; i ++) {
			int rand = (int)(Math.random() * 52);
			Card tmp = cards[rand];
			cards[rand] = cards[i];
			cards[i] = tmp;
		}
	}
	
	Card pick() {
		return cards[0];
	}
	
	Card pick(int idx) {
		if(idx < 0 || idx > 51) {
			return null;
		}
		return cards[idx];
	}

	
}
