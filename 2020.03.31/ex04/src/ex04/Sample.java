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
		System.out.println("1.성적입력|2.성적목록|3.성적조회|4.종료");
		System.out.println("------------------------------");
		System.out.print("선택>");
		int menu=s.nextInt();
		
		
		switch(menu) {
		
		default:
			System.out.println("번호를 잘못 입력하였습니다.");
			System.out.println();
			break;
		case 1: //성적입력
			grade[count]=new Grade();
			System.out.print("학번>");
			grade[count].sno=s.next();
			System.out.print("성명>");
			grade[count].sname=s.next();
			System.out.print("국어>");
			grade[count].kor=s.nextInt();
			System.out.print("영어>");
			grade[count].eng=s.nextInt();
			System.out.print("수학>");
			grade[count].mat=s.nextInt();
			System.out.println("입력완료\n");
			count++;
			break;
		case 2: //목록출력
			System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균");
			
			for(int i=0; i<count; i++) {
				grade[i].printgrade();
			}
			break;
		case 3: //성적조회
			System.out.print("조회번호>");
			String no=s.next();
			boolean find=false;
			
			for(int i=0; i<count; i++) {
				if(no.equals(grade[i].sno)) {
					System.out.println("성명:"+grade[i].sname);
					System.out.println("국어:"+grade[i].kor);
					System.out.println("영어:"+grade[i].eng);
					System.out.println("수학:"+grade[i].mat);
					System.out.println("총점:"+grade[i].tot);
					System.out.println("평균:"+grade[i].avg);
					//위에 방법도 가능하지만 밑에 방법으로도 간단하게 할 수 있다.
					//grade[i].printgrade();
					find=true;
				}
			}
			if(find==false) {
				System.out.println("번호가 존재하지 않습니다.");
			}
			System.out.println();
			break;
		case 4: //종료
			run=false;
			System.out.println("프로그램 종료");
		}
		}

	}

}
