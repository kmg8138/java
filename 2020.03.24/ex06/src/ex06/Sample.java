package ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		System.out.println("1:100�հ� 2:¦���հ� 3:Ȧ���հ�");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		switch(number) {
		case 1:
			for2();
			break;
		case 2:
			for3();
			break;
		case 3:
			for4();
			break;
		}
	}
	//5���� �ݺ����
	public static void for1() {
		System.out.println("*****����1*****");
		for(int i=0; i<=50; i=i+2) {
			System.out.println("5���� �ݺ����>" + i);
		}
	}
	//1~100������ ���� ���
	public static void for2() {
		System.out.println("***����2***");
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum=sum + i;
		}
		System.out.println("1~100������ �հ�>" + sum);
	}
	//0~100������ ¦�� �� ���
	public static void for3() {
		System.out.println("***����3***");
		
		int zzak=0;
		for(int i=0; i<=100; i=i+2) {
			zzak=zzak + i;
		}
		System.out.println("0~100������ ¦�� �� ���>" + zzak);
	}
	//1~100������ Ȧ�� �� ���
	public static void for4() {
		System.out.println("****����4****");
		
		int hole=0;
		for(int i=1; i<=100; i=i+2) {
			hole=hole + i;
		}
		System.out.println("1~100������ Ȧ�� �� ���>" + hole);
	}
}