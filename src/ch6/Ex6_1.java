package ch6;

public class Ex6_1 {
	public static void main (String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	// 생성자
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info메서드
	String info() {
		return num + (isKwang? "K": "");
			
	}
}