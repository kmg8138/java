package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int score=96;
		//������ 90�� �̻��̸� A���
		//������ 80�� �̻��̸� B���
		//������ 70�� �̻��̸� C���
		//������ 70�� �̸��̸� D���
		
		//100~95 ���̸� A+
		//94~90 ���̸� A0
		if(score<=100 && score>=95) {
			System.out.println("A+");
		}else if(score<=94 && score>=90) {
			System.out.println("A0");
		}else {
			
		}
		
		//�ݺ���
		int sum=0;
		
		for(int i=1; i<=100; i=i+2) {
			sum=sum+i;
		}
		System.out.println("1~100������ Ȧ���� ���� ��:" + sum);
		
		sum=0;
		int i=1;
		while(i<=100) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println("100������ ��:" + sum);
		
		Scanner s=new Scanner(System.in);
		
		/*boolean run=true;
		while(run) {
			int stop=s.nextInt();
			if(stop==0) {
				run=false;
			}else {
			System.out.println("------------");
			}
		}
		System.out.println("**********");
		*/
		//�迭
		int[] num= {1,2,3};
		sum=0;
		for(int j=0; j<num.length; j++) {
			System.out.println(num[j]);
			sum=sum+num[j];
		}
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + (double)sum/num.length);
		
		int[] number=null;
		System.out.print("�迭ũ��>");
		int count=s.nextInt(); //�迭���� Ű���忡�� �Է�
		number=new int[count]; // �迭���� ����
		
		sum=0; //�հ躯�� �ʱ�ȭ
		
		for(int j=0; j<count; j++) { //0~�迭������ŭ �ݺ�
			System.out.print("��["+j+"]>");
			number[j]=s.nextInt(); // Ű���忡�� j��°�� ���� �Է�
			sum=sum+number[j]; //�հ�
			
		}
		System.out.println("�հ�:" + sum);
			
	}

}