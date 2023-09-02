package ch9;

public class Ex9_9 {
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i = 0; i < src.length(); i++) {
			char c = src.charAt(i);
			// src문자열을 하나씩 분리
			
			if(delCh.indexOf(c) == -1) { 
				// 지울 문자열에 c가 포함되어있지 않으면 buffer에 추가
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2     3   4\t5)" + " -> " + delChar("(1 2     3   4\t5)", " \t"));
	}

}
