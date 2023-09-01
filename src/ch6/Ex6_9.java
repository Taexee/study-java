package ch6;

class Marine {
	int x = 0, y = 0; // 위치좌표
	int hp = 60; // 체력
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력 
	
	static void weaponUp() {
		weapon++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ex6_9 {

}
