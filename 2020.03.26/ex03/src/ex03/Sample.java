package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String[] no=new String[100];
		String[] name=new String[100];
		String[] address=new String[100];
		int count=0; //�ּ��Է� ����
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.�ּ��Է�|2.�ּҸ��|3.�ּ���ȸ|4.����");
			System.out.println("------------------------------");
			System.out.print("����>");
			int menu=s.nextInt();
			
			switch(menu) {
				
			case 1: //�ּ��Է�
				
				System.out.println("------------------------------");
				System.out.println("�ּ��Է�");
				System.out.println("------------------------------");
				System.out.print("��ȣ>");
				no[count]=s.next();
				System.out.print("����>");
				name[count]=s.next();
				
				//�ּ��Է½� ���⸦ �� ���
				System.out.print("�ּ�>");
				s.nextLine();
				address[count]=s.nextLine();
				
				count=count+1;
				
				System.out.println("���:�л��� �Է� �Ǿ����ϴ�.");
				break;
			case 2: //�ּҸ��
				for(int i=0; i<=count-1; i++) {
					System.out.println(no[i] + "\t" + name[i] + "\t" + address[i]);
				}
				break;
			case 3: //�ּ���ȸ
				System.out.println("------------------------------");
				System.out.println("�ּ���ȸ");
				System.out.println("------------------------------");
				
				System.out.print("��ȣ>");
				String number=s.next();
				
				for(int i=0; i<=count-1; i++) {
					if(no[i].equals(number)) {
						System.out.println("����:" + name[i]);
						System.out.println("�ּ�:" + address[i]);
					}
				}
				break;
			case 4: //����
				System.out.println("���α׷��� �����մϴ�.");
				run=false;
			}
		}

	}

}