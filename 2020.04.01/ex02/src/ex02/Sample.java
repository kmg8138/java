package ex02;

public class Sample {

	public static void main(String[] args) {
		Car c1=new Car();
		//c1.company="����";
		//c1.maxSpeed=200;
		c1.setCompany("�Ｚ");
		System.out.println("������:"+c1.getCompany());
		
		c1.setMaxSpeed(-120);
		System.out.println("�ִ�ӵ�:"+c1.getMaxSpeed());
		c1.printCar();

	}

}