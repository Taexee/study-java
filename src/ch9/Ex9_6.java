package ch9;

public class Ex9_6 {
	public static String fillZero(String src, int length) {
		/*
		 * src가 null이거나 src.length가 length와 같으면 src 그대로 반환 
		 * length의 값이 0보다 같거나 작으면 빈 문자열 "" 반환
		 * src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환
		 * 길이가 length인 char배열 생성
		 * 위에서 생성한 char배열을 '0'으로 채운다
		 * src에서 문자배열을 뽑아내서 위에서 생성한 배열에 복사한다.
		 * 생성한 배열로 String을 생성해 반환
		 * */
		
		if(src == null || src.length() == length) { //src가 null이거나 src.length가 length와 같으면 src 그대로 반환 
			return src;
		
		} else if(length <= 0) { //length의 값이 0보다 같거나 작으면 빈 문자열 "" 반환
			return "";
		
		} else if(src.length() > length) { //src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환
			return src.substring(0, length);
		}
		
		// 길이가 length인 char배열 생성
		char[] chArr = new char[length];
		
		//위에서 생성한 char배열을 '0'으로 채운다
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = '0';
		}
		
		//src에서 문자배열을 뽑아내서 위에서 생성한 배열에 복사한다.
		System.arraycopy(src.toCharArray(), 0, chArr, length-src.length(), src.length());
		/*
		 * toCharArray 문자열을 char[]에 한 글자씩 넣어주는 메서드
		 * arraycopy(복사하고자하는 소스, 소스의 시작위치, 복사 대상, 복사본 시작 위치, 복사할 길이)
		 * */
		
		//생성한 배열로 String을 생성해 반환
		return new String(chArr);
		// char[]을 합쳐서 하나의 String으로
	}
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}