package ch6;

public class Ex6_19 {
	public static void chang(String str) {
		str +="456";
	}
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		chang(str);
		System.out.println("After change: " + str);
	}

}