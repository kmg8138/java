package ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		System.out.println("1:100합계 2:짝수합계 3:홀수합계");
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
	//5까지 반복출력
	public static void for1() {
		System.out.println("*****예제1*****");
		for(int i=0; i<=50; i=i+2) {
			System.out.println("5까지 반복출력>" + i);
		}
	}
	//1~100까지의 합을 출력
	public static void for2() {
		System.out.println("***예제2***");
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum=sum + i;
		}
		System.out.println("1~100까지의 합계>" + sum);
	}
	//0~100까지의 짝수 합 출력
	public static void for3() {
		System.out.println("***예제3***");
		
		int zzak=0;
		for(int i=0; i<=100; i=i+2) {
			zzak=zzak + i;
		}
		System.out.println("0~100까지의 짝수 합 출력>" + zzak);
	}
	//1~100까지의 홀수 합 출력
	public static void for4() {
		System.out.println("****예제4****");
		
		int hole=0;
		for(int i=1; i<=100; i=i+2) {
			hole=hole + i;
		}
		System.out.println("1~100까지의 홀수 합 출력>" + hole);
	}
}
