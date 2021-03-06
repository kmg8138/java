package ex01;

public class DmbPhone extends Phone{
	//필드
	int channel;
	
	//기본생성자(오버로딩)
	DmbPhone(){
		
	}
	
	//일반생성자
	DmbPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메서드
	void turnOnDmb() {
		System.out.println(channel+"번 DMB 방송을 수신합니다.");
	}
	void changeChannel(int channel) {
		System.out.println(channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
