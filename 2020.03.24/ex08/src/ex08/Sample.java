package ex08;

import java.util.Scanner;

public class Sample {
	   public static void main(String[] args) {
	      Scanner s=new Scanner(System.in);
	      System.out.print("�����Է�>");
	      int num=s.nextInt();
	      int sum=0;
	      
	      while(num!=0) { 
	         for(int i=0; i<=num; i++) {
	            sum=sum+i;
	         }
	         System.out.println("1~" + num + "������ �հ�=" + sum + "\n");
	         sum=0;
	         System.out.print("�����Է�>");
	         num=s.nextInt();
	      }
	      
	      System.out.println("���α׷�����");
	   }
	}