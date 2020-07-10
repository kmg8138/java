package ex01;

public class Sample {

	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.powerOn();
		p1.sendVoice("여보세요!");
		p1.reciveVoice("저는 이송현입니다.");
		p1.hangup();
		p1.powerOff();
		
		DmbPhone d1=new DmbPhone("삼성노트","파랑",11);
		d1.powerOn();
		d1.turnOnDmb();
		d1.changeChannel(11);
		d1.turnOffDmb();
		d1.powerOff();
	}

}
