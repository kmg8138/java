package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String[] no=new String[100];
		String[] name=new String[100]; //������
		int[] balance=new int[100]; //�ܾ�
		int count=0; //���� ����
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("---------------------------------");
			System.out.print("����>");
			int menu=s.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("-----------------");
				System.out.println("���»���");
				System.out.println("-----------------");
				System.out.print("���¹�ȣ:");
				no[count]=s.next();
				System.out.print("������:");
				name[count]=s.next();
				System.out.print("�ʱ��Աݾ�:");
				balance[count]=s.nextInt();
				
				count=count+1;
				break;
			case 2:
				System.out.println("-----------------");
				System.out.println("���¸��");
				System.out.println("-----------------");
				
				for(int i=0; i<=count-1; i++) {
					System.out.println("���¹�ȣ\t������\t�ܾ�");
					System.out.println(no[i] + "\t" + name[i] + "\t" + balance[i]);
				}
				break;
			case 3:
				
				System.out.println("-----------------");
				System.out.println("����");
				System.out.println("-----------------");
				System.out.print("���¹�ȣ:");
				String number=s.next();
				System.out.print("���ݾ�:");
				int plus=s.nextInt();
				
				for(int i=0; i<=count-1; i++) {
					if(no[i].equals(number)) {
						balance[i]=balance[i]+plus;	
						System.out.println("���� �ܾ�:" + balance[i]);
					}
				}
					 
				System.out.println("���:������ �Ϸ�Ǿ����ϴ�.");		
									
				break;
			case 4:
				System.out.println("-----------------");
				System.out.println("����");
				System.out.println("-----------------");
				System.out.print("���¹�ȣ:");
				String number2=s.next();
				System.out.print("���:");
				int minus=s.nextInt();
				
				for(int i=0; i<=count-1; i++) {
					if(no[i].equals(number2)) {
						balance[i]=balance[i]-minus;	
					}
				}
				
				System.out.println("���:����� �Ϸ�Ǿ����ϴ�.");
				
				break;
			case 5:
				run=false;
				System.out.println("���α׷��� �����մϴ�.");
			}
			
			
		}

	}

}