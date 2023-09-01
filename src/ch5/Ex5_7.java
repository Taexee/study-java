package ch5;

public class Ex5_7 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		
		for(int i=0;i<coinUnit.length;i++) {
			//System.out.println(i+"번 money="+money);
			
			
			int coinNum = 0;
			
			//System.out.println(i+"번 coinNum : " + money/coinUnit[i]);
			coinNum = money/coinUnit[i]; // 단위별 동전 개수
			
			
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum; // 개수만큼 개수 뺌
				//System.out.println(i+"번 coinNum : " + coinNum);
			} else {
				coinNum = coin[i]; // 가지고 있는 개수보다 넘어가면 0으로 변
				coin[i] = 0;
				//System.out.println(i+"번 coinNum : " + coinNum);
			}
			
			money -= coinUnit[i]*coinNum; //단위별 동전만큼 돈에서 뺌
			//System.out.println(i+"번 money : " + money);
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		
		System.out.println("=남은 동전의 개수 =");
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		}
	}
}
