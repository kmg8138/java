package ex05;

import java.util.Scanner;

public class Sample {
	//main-----------------
	public static void main(String[] args) {
		switch1();
		sungjuk();
		sungjuk1();
	}
	//�������ϱ�
	public static void sungjuk1() {
		Scanner s=new Scanner(System.in); //Ű�����Է�
		System.out.print("����>");
		int score=s.nextInt();
		if(score>=90) {
			System.out.println("������ A");
			}else if(score>=80) {
				System.out.println("������ B");
			}
		}
	
	//sungjuk---------------
	public static void sungjuk() {
		System.out.println("******�������******");
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����>");
		int kor=scanner.nextInt();
		System.out.print("����>");
		int mat=scanner.nextInt();
		System.out.print("����>");
		int eng=scanner.nextInt();
		
		int tot=kor+mat+eng;
		double avg=(double)tot/3;
				System.out.println("����:" + tot);
				System.out.println("���:" + avg);
	}
	//switch---------------
	public static void switch1() {
		System.out.println("switch ����1");
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("�ð��Է�>");
		int time=scanner.nextInt(); //Ű���忡�� ����Ÿ�Է�
		
		switch(time) {
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 8:
			System.out.println("����� �մϴ�.");
			break;
		case 10:
			System.out.println("������ ���ϴ�.");
			break;
		default:
			System.out.println("�ܱ��� �մϴ�.");
			break;
		}
		
	}
	
}
