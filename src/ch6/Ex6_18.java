package ch6;

class MemberCall{
	int iv = 0;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv; // 라인A
	
	static void staticMethod1(){
		System.out.println(cv);
		//System.out.println(iv); // 라인B
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 라인C
	}
	
	static void staticMethod2(){
		staticMethod1();
		//instanceMethod1(); // 라인D
	}
	
	void instanceMethod2() {
		staticMethod1(); // 라인E
		instanceMethod1();
	}
}

public class Ex6_18 {

}
