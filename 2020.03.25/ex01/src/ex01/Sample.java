package ex01;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		boolean run=true;
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("*��ȣ�� �����ϼ���.*");
			System.out.println("[1]��� ���ϱ�");
			System.out.println("[2]���� ���� ���ϱ�");
			System.out.println("[3]�ﰢ���� ���� ���ϱ�");
			System.out.println("[4]���α׷� ����");
			System.out.println("--------------------");
			
			Scanner s=new Scanner(System.in);
			int menu=s.nextInt();
				
			int sum=0;
			switch(menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 4:
				System.out.println("\n ���α׷��� �����մϴ�.");
				run=false;
				break;
			default:
				System.out.println("\n �߸� �Է� �߽��ϴ�.");
			}
		}
		
	}
	public static void method1() {
		//�̸�, ����, ����, ���� Ű���忡�� �Է�
				//����, ��� ���
				
				Scanner s=new Scanner(System.in);
				
				System.out.print("�̸�:");
				String name=s.next();
				System.out.print("����:");
				int kor=s.nextInt();
				System.out.print("����:");
				int eng=s.nextInt();
				System.out.print("����:");
				int mat=s.nextInt();
				
				int tot=kor+eng+mat;
				double avg=(double)tot/3;
				
				System.out.println("����:" + tot);
				System.out.println("���:" + avg);
				
				System.out.println("���α׷��� �����Ͻðڽ��ϱ�?(y/n)");
				String yn=s.next();
				if(yn.equals("y")||yn.equals("Y")) {
					System.out.println("���α׷��� �����մϴ�.");
				}else {
					
				}
	}
	public static void method2() {
		//���� �������� �Է� �޾� ���� ���̸� ���Ѵ�.
		//�������� 0�̸� ���α׷� ����
		boolean run=true;
		
		while(!run) {
			Scanner s=new Scanner(System.in);
			System.out.print("������:");
			double r=s.nextDouble();
			double a=r*r*3.14;
			System.out.println("����:" + a);
			
			if(r==0) {
				System.out.println("���α׷��� �����մϴ�.");
				run=false;
			}
		}
	}
	public static void method3() {
		//�ﰢ���� ���̿� �غ��� Ű���忡�� �Է¹޴´�.
		//�ﰢ���� ���̸� ���Ͽ� ����Ѵ�.
		Scanner s=new Scanner(System.in);
		
		boolean a=true;
		while(a) {
		System.out.println("�ﰢ���� ���̸� ��� �� ���ΰ�(y)");
		String q=s.next();
		
			if(q.equals("y") || q.equals("Y")) {
			
				System.out.print("����:");
				int h=s.nextInt();
				System.out.print("�غ�:");
				int w=s.nextInt();
				double area=h*w/2.; // (double)h*w/2 �� ����
				System.out.print("�ﰢ���� ����:" + area);
				System.out.println();
			
			}else if(q.equals("n") || q.equals("N")) {
				System.out.println("���α׷��� �����մϴ�.");
				a=false;
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}	
		
	}

}