package ex02;

public class Car {
	
	// �ʵ�(�Ӽ�)
	private String company;
	private int maxSpeed;
	
	//set() �޼���
	public void setCompany(String company) {
		this.company=company;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed<0) {
			this.maxSpeed=0;
		}else {
			this.maxSpeed=maxSpeed;
		}
	}
	
	//get �޼���
	public String getCompany() {
		return company;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	//������
	Car(){
		
	}
	
	//�޼���
	void printCar() {
		//System.out.println("������:"+company);
		//System.out.println("�ִ�ӵ�:"+maxSpeed);
	}
}