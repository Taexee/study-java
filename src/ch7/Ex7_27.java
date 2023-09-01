package ch7;

class Outer3{
	int value = 10;

	class Inner {
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	}
}

public class Ex7_27 {

	public static void main(String[] args) {
		/* 4 */
		Outer3 o = new Outer3();
		Outer3.Inner inner = o.new Inner();
		
		inner.method();
	}
}