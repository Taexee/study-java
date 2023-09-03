package ch9;

public class Ex9_13 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa를" + stringCount(src, "aa") + "개 찾았습니다.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if(key == null |  key.length() == 0) {
			return 0;
		}
		
		// 1)
		// src에 key와 일치하는 부분의 위치 index가 -1이 아니면 계속 반복
		while((index = src.indexOf(key, pos)) != -1) {
			count++; // 같은 문자열 찾으면 증가
			pos = index + key.length(); // 검색 시작 위치 변
		}
		
		return count;
	}
}
