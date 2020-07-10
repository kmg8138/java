package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String[] no=new String[100];
		String[] name=new String[100]; //계좌주
		int[] balance=new int[100]; //잔액
		int count=0; //계좌 갯수
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			int menu=s.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("-----------------");
				System.out.println("계좌생성");
				System.out.println("-----------------");
				System.out.print("계좌번호:");
				no[count]=s.next();
				System.out.print("계좌주:");
				name[count]=s.next();
				System.out.print("초기입금액:");
				balance[count]=s.nextInt();
				
				count=count+1;
				break;
			case 2:
				System.out.println("-----------------");
				System.out.println("계좌목록");
				System.out.println("-----------------");
				
				for(int i=0; i<=count-1; i++) {
					System.out.println("계좌번호\t계좌주\t잔액");
					System.out.println(no[i] + "\t" + name[i] + "\t" + balance[i]);
				}
				break;
			case 3:
				
				System.out.println("-----------------");
				System.out.println("예금");
				System.out.println("-----------------");
				System.out.print("계좌번호:");
				String number=s.next();
				System.out.print("예금액:");
				int plus=s.nextInt();
				
				for(int i=0; i<=count-1; i++) {
					if(no[i].equals(number)) {
						balance[i]=balance[i]+plus;	
						System.out.println("현재 잔액:" + balance[i]);
					}
				}
					 
				System.out.println("결과:예금이 완료되었습니다.");		
									
				break;
			case 4:
				System.out.println("-----------------");
				System.out.println("예금");
				System.out.println("-----------------");
				System.out.print("계좌번호:");
				String number2=s.next();
				System.out.print("출금:");
				int minus=s.nextInt();
				
				for(int i=0; i<=count-1; i++) {
					if(no[i].equals(number2)) {
						balance[i]=balance[i]-minus;	
					}
				}
				
				System.out.println("결과:출금이 완료되었습니다.");
				
				break;
			case 5:
				run=false;
				System.out.println("프로그램을 종료합니다.");
			}
			
			
		}

	}

}
