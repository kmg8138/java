package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		boolean run=true;
		Scanner s=new Scanner(System.in);
		Grade[] grade=new Grade[100];
		int count=0;
		while(run){
		System.out.println("------------------------------");
		System.out.println("1.�����Է�|2.�������|3.������ȸ|4.����");
		System.out.println("------------------------------");
		System.out.print("����>");
		int menu=s.nextInt();
		
		
		switch(menu) {
		
		default:
			System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
			System.out.println();
			break;
		case 1: //�����Է�
			grade[count]=new Grade();
			System.out.print("�й�>");
			grade[count].sno=s.next();
			System.out.print("����>");
			grade[count].sname=s.next();
			System.out.print("����>");
			grade[count].kor=s.nextInt();
			System.out.print("����>");
			grade[count].eng=s.nextInt();
			System.out.print("����>");
			grade[count].mat=s.nextInt();
			System.out.println("�Է¿Ϸ�\n");
			count++;
			break;
		case 2: //������
			System.out.println("��ȣ\t����\t����\t����\t����\t����\t���");
			
			for(int i=0; i<count; i++) {
				grade[i].printgrade();
			}
			break;
		case 3: //������ȸ
			System.out.print("��ȸ��ȣ>");
			String no=s.next();
			boolean find=false;
			
			for(int i=0; i<count; i++) {
				if(no.equals(grade[i].sno)) {
					System.out.println("����:"+grade[i].sname);
					System.out.println("����:"+grade[i].kor);
					System.out.println("����:"+grade[i].eng);
					System.out.println("����:"+grade[i].mat);
					System.out.println("����:"+grade[i].tot);
					System.out.println("���:"+grade[i].avg);
					//���� ����� ���������� �ؿ� ������ε� �����ϰ� �� �� �ִ�.
					//grade[i].printgrade();
					find=true;
				}
			}
			if(find==false) {
				System.out.println("��ȣ�� �������� �ʽ��ϴ�.");
			}
			System.out.println();
			break;
		case 4: //����
			run=false;
			System.out.println("���α׷� ����");
		}
		}

	}

}
