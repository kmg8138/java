package ex02;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		
			System.out.println("--------------------");
			System.out.println("*��ȣ�� �����ϼ���.*");
			System.out.println("[1]1~100������ �հ�");
			System.out.println("[2]1~100������ ¦���հ�");
			System.out.println("[3]1~100������ Ȧ���հ�");
			System.out.println("[4]���α׷� ����");
			System.out.println("--------------------");
			
			Scanner s=new Scanner(System.in);
			int menu=s.nextInt();
				
			int sum=0;
			switch(menu) {
			case 1:
				System.out.print("\n 1~100������ �հ�=");
				for(int i=1; i<=100; i=i+1) {
					sum=sum+i;
				}
				System.out.println(sum);
				break;
			case 2:
				System.out.print("\n 1~100������ ¦���հ�=");
				for(int i=0; i<=100; i=i+2) {
					sum=sum+i;
				}	
				System.out.println(sum);
				break;
			case 3:
				System.out.print("\n 1~100������ Ȧ���հ�=");
				for(int i=1; i<=100; i=i+2) {
					sum=sum+i;
				}
				System.out.println(sum);
				break;
			case 4:
				System.out.println("\n ���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("\n �߸� �Է� �߽��ϴ�.");
			}
		
		
	}

}