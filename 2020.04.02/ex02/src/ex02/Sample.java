package ex02;

public class Sample {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.r=5;
		System.out.println("���ǳ���:"+c1.areaCircle());
		
		Computer c2=new Computer();
		c2.r=5;
		System.out.println("���ǳ���:"+c2.areaCircle());
	}

}
