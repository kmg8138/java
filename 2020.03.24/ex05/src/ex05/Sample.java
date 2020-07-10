package ex05;

import java.util.Scanner;

public class Sample {
	//main-----------------
	public static void main(String[] args) {
		switch1();
		sungjuk();
		sungjuk1();
	}
	//학점구하기
	public static void sungjuk1() {
		Scanner s=new Scanner(System.in); //키보드입력
		System.out.print("점수>");
		int score=s.nextInt();
		if(score>=90) {
			System.out.println("학점은 A");
			}else if(score>=80) {
				System.out.println("학점은 B");
			}
		}
	
	//sungjuk---------------
	public static void sungjuk() {
		System.out.println("******성적계산******");
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("국어>");
		int kor=scanner.nextInt();
		System.out.print("수학>");
		int mat=scanner.nextInt();
		System.out.print("영어>");
		int eng=scanner.nextInt();
		
		int tot=kor+mat+eng;
		double avg=(double)tot/3;
				System.out.println("총점:" + tot);
				System.out.println("평균:" + avg);
	}
	//switch---------------
	public static void switch1() {
		System.out.println("switch 예졔1");
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("시간입력>");
		int time=scanner.nextInt(); //키보드에서 데이타입력
		
		switch(time) {
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 8:
			System.out.println("출근을 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 합니다.");
			break;
		}
		
	}
	
}
