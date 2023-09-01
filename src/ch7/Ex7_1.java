package ch7;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		// 1) 배열 SutdaCard 적절히 초기화
		for(int i = 0; i < cards.length; i ++) {
			int num = i%10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
		
	}
	void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int idx = (int)Math.random() * cards.length;
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[idx];
			cards[idx] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random() * cards.length)];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object클래스의 toString()을 오버라이딩
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(6));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick());
	}
}