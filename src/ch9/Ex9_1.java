package ch9;

public class Ex9_1 {

	public static void main(String[] args) {
		Sutdacard c1 = new Sutdacard(3, true);
		Sutdacard c2 = new Sutdacard(3, true);
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2) :" + c1.equals(c2));
	}
}

class Sutdacard {
	int num;
	boolean isKwang;
	
	Sutdacard() {
		this(1, true);
	}
	
	Sutdacard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		// 1)
		if(obj instanceof Sutdacard) {
			Sutdacard c = (Sutdacard)obj;
			return num==c.num && isKwang==c.isKwang;
		}
		
		return false;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}