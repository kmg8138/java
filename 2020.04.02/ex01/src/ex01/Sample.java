package ex01;

public class Sample {

	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.powerOn();
		p1.sendVoice("��������!");
		p1.reciveVoice("���� �̼����Դϴ�.");
		p1.hangup();
		p1.powerOff();
		
		DmbPhone d1=new DmbPhone("�Ｚ��Ʈ","�Ķ�",11);
		d1.powerOn();
		d1.turnOnDmb();
		d1.changeChannel(11);
		d1.turnOffDmb();
		d1.powerOff();
	}

}
