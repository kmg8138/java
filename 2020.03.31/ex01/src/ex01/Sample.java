package ex01;

public class Sample {

	public static void main(String[] args) {
		//students();
		//cars();
	}

	public static void students() {

		Student s1=new Student();
		s1.sno="01";
		s1.sname="이송현";
		s1.tel="010-8775-4343";
		s1.print(s1);
	
		Student s2=new Student();
		s2.sno="02";
		s2.sname="이대현";
		s2.tel="010-3202-4171";
		s2.print(s2);
		
		Student s3=new Student("03","이기세","010-7576-0935");
		s3.print(s3);
	}
	public static void cars() {

		Car c1=new Car();
		c1.model="소나타";
		c1.color="검정";
		c1.maxSpeed=250;
		c1.printCar(c1);
		
		Car c2=new Car();
		c2.model="그렌저";
		c2.color="흰색";
		c2.maxSpeed=300;
		c2.printCar(c2);
		
		Car c3=new Car("아반떼","회색",200);
		c3.printCar(c3);
		
	}
}
