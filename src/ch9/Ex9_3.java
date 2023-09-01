package ch9;

public class Ex9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		// 1) 
		int pos  = fullPath.lastIndexOf("\\");
		
		if(pos!=-1) {
			path = fullPath.substring(0, pos);
			fileName = fullPath.substring(pos+1);
		}
		/*
		lastIndexOf 마지막 구분자를 찾아 인덱스 반환
		찾는 문자열이 없으면 -1 반환하기 때문에 조건문 사용해 확인 필요
		subString은 문자열을 잘라주는 메서드로 매개변수를 한개만 전달하면 매개변수부터 끝까지 잘라줌
		subString(시작, 끝) 주의할 점은 끝인덱스 문자를 포함하지 않는다는 것!
		 */
		
		System.out.println("fullPath: " + fullPath);
		System.out.println("path: " + path);
		System.out.println("fileName: " + fileName);
	}
}
