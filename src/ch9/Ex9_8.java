package ch9;

public class Ex9_8 {
	public static double round(double d, int n) {
		return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
		// Math.pow 제곱함수(밑수, 지수)
		// Math.round 반올림함수 소수점 첫번째 자리 반올림
		
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}
}