package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//cal();
		//Area a1=new Area();
		System.out.println(Area.triangle(5, 5));
		
		System.out.println(Area.rectangle(10, 11));
		
		System.out.println(Area.rectangle(12));
		
		System.out.println(Area.circle(15));
	}
	
	public static void cal() {
		Scanner s=new Scanner(System.in);
		System.out.print("x=");
		int x=s.nextInt();
		
		System.out.print("y=");
		int y=s.nextInt();
		
		Calculator c1=new Calculator(x,y);

		System.out.println("x+y="+c1.plus(x, y));
		
		double result=c1.divide(x, y);
		System.out.println("x/y="+result);
		
		System.out.println("x*y="+c1.rhqgkrl(x, y));
	}
}
