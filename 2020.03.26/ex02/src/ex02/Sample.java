package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		int[] score=null;
		
		
		
		while(run) {
			
			System.out.println("------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("------------------------------------");
			System.out.print("����>");
			int menu=s.nextInt();
			
			
			switch(menu) {
			
			case 1:
				System.out.print("�л���>");
				int count=s.nextInt();
				score=new int[count];
				break;
			case 2:
				for(int i=0; i<=score.length-1; i++) {
					System.out.print("����[" + i + "]>");
					score[i]=s.nextInt();
					
					
				}
				break;
			case 3:
				for(int i=0; i<=score.length-1; i++) {
					System.out.println("����[" + i + "]:" + score[i]);
				}
				break;
			case 4:
				int sum=0;
				int max=0;
				
				for(int i=0; i<=score.length-1; i++) {
					sum=sum+score[i];
					
					
					if(max<=score[i]) {
						max=score[i];
					}
					
				}
				double avg=(double)sum/score.length;
				System.out.println("�ְ�����:" + max);
				System.out.println("�������:" + avg);
				break;
			case 5:
				run=false;
				System.out.println("���α׷��� �����մϴ�.");
			}
		}
	}

}