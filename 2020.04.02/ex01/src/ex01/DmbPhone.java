package ex01;

public class DmbPhone extends Phone{
	//�ʵ�
	int channel;
	
	//�⺻������(�����ε�)
	DmbPhone(){
		
	}
	
	//�Ϲݻ�����
	DmbPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//�޼���
	void turnOnDmb() {
		System.out.println(channel+"�� DMB ����� �����մϴ�.");
	}
	void changeChannel(int channel) {
		System.out.println(channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}