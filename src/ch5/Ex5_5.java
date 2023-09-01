package ch5;

public class Ex5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length); 
			int tmp = 0;
			
			tmp = ballArr[i]; // tmp에 임시저장
			ballArr[i] = ballArr[j]; // i에 j값
			ballArr[j] = ballArr[i]; // j에 tmp
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		// arraycopy(복사항 배열, 복사할 배열 시작 위치, 복사본 담을 배열, 담을 배열 시작, 끝)
		
		for(int i=0;i<ball3.length;i++) { 
			System.out.print(ball3[i]);
		}
		
		System.out.println();
	}
}
