package ch5;

public class Ex5_11 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				// result에 score 넣어주기
				result[i][j] = score[i][j];
				
				// 마지막줄 합계
				result[result.length-1][j] += score[i][j]; 
				
				// 왼쪽 합계
				result[i][result[0].length-1] += score[i][j];
				
				// 왼쪽 전체 합계
				result[result.length-1][result[0].length-1] += score[i][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
