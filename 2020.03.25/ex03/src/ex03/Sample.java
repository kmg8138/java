package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int speed=0;
		boolean run=true;
		Scanner s=new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.print("1.���� ");
			System.out.print("| 2.���� ");
			System.out.println("| 3.����");
			System.out.println("--------------------------");
			System.out.print("����:");
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1:
				speed=speed+1;
				System.out.println("���� �ӵ�=" + speed);
				break;
			case 2:
				speed=speed-1;
				System.out.println("���� �ӵ�=" + speed);
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				run=false;
				
			}
		}
		
		

	}

}
