package ch5;

import java.util.Scanner;

public class Ex5_13 {
	public static void main (String[] args) {
		String[] words = { "television", "computer", "mouse", "phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // string을 char로 변환
			
			for(int j = 0; j < question.length; j++) {
				// 랜덤 숫자
				int num = (int)(Math.random() * question.length);
				// 임시저장
				char tmp = question[i];
				
				// 서로 변경
				question[i] = question[num];
				question[num] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			
			String answer = sc.nextLine();
			
			// trim으로 answer의 좌우 공백 제거 후 equals로  words[i]와 비교
			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else 
				System.out.printf("틀렸습니다.%n%n");
		}
	}
}
