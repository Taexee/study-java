package ch9;

public class Ex9_5 {
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		// 1)
		while(true) {
			pos = src.indexOf(target, pos);
			
			if(pos != -1) {
				count++;
				pos += target.length(); // pos의 위치를 다음 단어로 이동
			} else {
				break;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}
}
