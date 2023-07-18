package chapter07;

public class CardEx {
	public static void main(String[] args) {
		Card card = new Card();
		card.number ="A";
		card.kind=3;
		System.out.println(card);
		
		Deck deck = new Deck();
		
		for(Card c : deck.cards) {
//			System.out.println(c);
		}
		
		deck.shuffle();
		
		Card c = deck.pick();
//		System.out.println(c);
//		System.out.println(deck.cards[0]);
		
//		System.out.println(new Deck().pick());
		
	}
}
