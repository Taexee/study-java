package ch6;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 10;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOff() {
		// 1) isPowerOn의 값이 true면 false로 false면 true로 변경 
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// 2) volume의 값이 MAX_VOLUME보다 작을 때만 값 1 증가
		if(volume < MAX_VOLUME)
			volume++;
	}
	
	void volumeDown() {
		// 3) volume의 값이 MIN_VOLUME보다 클 때만 값 1 감소
		if(volume > MIN_VOLUME)
			volume--;
	}
	
	void channelUp() {
		// 4) channel의 값 1 증가 MAX_CHANNEL이면 MIN_CHANNEL로 변경
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
	}
	
	void channelDown() {
		// 5) channel의 값 1 감소 MIN_CHANNEL이면 MAX_CHANNEL로 변경
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
	}
}

public class Ex6_21 {
	
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
	}

}