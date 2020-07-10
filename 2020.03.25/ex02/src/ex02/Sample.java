package ex02;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		
			System.out.println("--------------------");
			System.out.println("*번호를 선택하세요.*");
			System.out.println("[1]1~100까지의 합계");
			System.out.println("[2]1~100까지의 짝수합계");
			System.out.println("[3]1~100까지의 홀수합계");
			System.out.println("[4]프로그램 종료");
			System.out.println("--------------------");
			
			Scanner s=new Scanner(System.in);
			int menu=s.nextInt();
				
			int sum=0;
			switch(menu) {
			case 1:
				System.out.print("\n 1~100까지의 합계=");
				for(int i=1; i<=100; i=i+1) {
					sum=sum+i;
				}
				System.out.println(sum);
				break;
			case 2:
				System.out.print("\n 1~100까지의 짝수합계=");
				for(int i=0; i<=100; i=i+2) {
					sum=sum+i;
				}	
				System.out.println(sum);
				break;
			case 3:
				System.out.print("\n 1~100까지의 홀수합계=");
				for(int i=1; i<=100; i=i+2) {
					sum=sum+i;
				}
				System.out.println(sum);
				break;
			case 4:
				System.out.println("\n 프로그램을 종료합니다.");
				break;
			default:
				System.out.println("\n 잘못 입력 했습니다.");
			}
		
		
	}

}
