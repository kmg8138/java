package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] num=new int[5];
		int sum=0;
		
		for(int i=0; i<=num.length-1; i++) {
			System.out.println(i + "��°��");
			num[i]=s.nextInt();
		}
		
		for(int i=0; i<=num.length-1; i++) {
			sum=sum+num[i];
		}
		
		System.out.println("�հ�:" + sum);
		
		/*�迭(����Ÿ��)
		int[] d= {90, 80, 100, 88, 100};
		int sum=0;
		
		for(int i=0; i<=d.length-1; i++)
		{
			System.out.println(i + "��°:" + ��[1]);
			sum=sum+d[1];
		}
			System.out.println("�հ�: + sum");
			double avg=(double)sum/d.length;
			System.out.println("���:" + avg); */
	}

}
