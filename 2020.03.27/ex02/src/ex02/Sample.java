package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		boolean run=true;
		Scanner s=new Scanner(System.in);
		int count=0;
		int[] num=null;
		
		while(run) {
				
			System.out.println("-----------------------------------");
			System.out.println("1.�迭 ����|2.������ �Է�|3.������ ����|4.����");
			System.out.println("-----------------------------------");
			System.out.print("����>");
			int menu=s.nextInt();
			
			
			switch(menu) {
			case 1:
				
				System.out.print("�迭ũ��>");
				count=s.nextInt();
				num=new int[count];
				
				break;
			case 2:
				
				for(int i=0; i<count; i++) {
					int j=i+1;
					
					System.out.print("����["+j+"]>");
					num[i]=s.nextInt();				
				}

				break;
			case 3:
				int sum=0;
				
				for(int i=0; i<count; i++) {
					int j=i+1;
					
					System.out.print("����["+j+"]:");
					System.out.println(num[i]);
					sum=sum+num[i];
				}
				System.out.println("����:"+sum);
				System.out.println("���:"+(double)sum/count);
				
				break;
			case 4:
				run=false;
				System.out.println("���α׷��� �����մϴ�.");
				
			}
			
		}

	}

}