package ex01;

public class Car {
	//�ʵ�
	String company="����";
	String model;
	String color;
	int maxSpeed;
	
	//�⺻������
	Car(){
		
	}
	
	//�Ϲݻ�����
	
	Car(String model, String color, int maxSpeed){
		
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
			
	}
	//��¸޼��� (����)
	void printCar(Car c) {
		System.out.println("-------------------------");
		System.out.println("ȸ���:"+c.company);
		System.out.println("�𵨸�:"+c.model);
		System.out.println("����:"+c.color);
		System.out.println("�ִ�ӵ�:"+c.maxSpeed);
	}
	
}