package ch9;

public class Ex9_10 {
	public static String format(String str, int length, int alignment) {
		// length가 str 길이보다 작으면 length 만큼 자름
		if(length - str.length() < 0) {
			return str.substring(0, length);
		}
		
		// str 문자 배열로 변경
		char[] strArr = str.toCharArray();
		
		char[] arr = new char[length];
		
		// 공백 넣기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ' ';
		}
		
		// 정렬 
		switch(alignment) {
			case 0:
			default:
				System.arraycopy(strArr, 0, arr, 0, strArr.length);
				break;
			case 1:
				System.arraycopy(strArr, 0, arr, (length - str.length())/2, strArr.length);
				break;
			case 2:
				System.arraycopy(strArr, 0, arr, length - str.length(), strArr.length);
				break;
		}
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String str = "가나다";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
	}
}
