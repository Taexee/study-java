package ch7;

public class Ex7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		b.buy(new Tv1());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product1[] cart = new Product1[3]; // 구입 제품을 저장하기 위한 배열
	int i = 0; // cart에 사용될 index
	
	// 메서드 작성
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 " + p.toString()+ "을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product1 p) {
		if(i >= cart.length) {
			Product1[] tmp = new Product1[cart.length * 2]; // 더 긴 배열 생성
			System.arraycopy(cart, 0, tmp, 0, cart.length); // 복사
			cart = tmp; // 긴거로 변경
		}
		cart[i++] = p; // cart에 저장하고 i 1 증가
	}
	void summary() {
		String items = "";
		int total = 0;
		
		for(int j = 0; j < cart.length; j++) {
			items += cart[j] + ", ";
			total += cart[j].price;
		}
		
		System.out.println("구입한 물건: " + items);
		System.out.println("사용한 금액: " + total);
		System.out.println("남은 금액: " + money);
	}
	
}

class Product1 {
	int price;
	
	Product1(int price) {
		this.price = price;
	}
}

class Tv1 extends Product1{
	Tv1() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer extends Product1{
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio extends Product1{
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}