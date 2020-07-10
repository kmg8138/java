package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int score=96;
		//점수가 90점 이상이면 A출력
		//점수가 80점 이상이면 B출력
		//점수가 70점 이상이면 C출력
		//점수가 70점 미만이면 D출력
		
		//100~95 사이면 A+
		//94~90 사이면 A0
		if(score<=100 && score>=95) {
			System.out.println("A+");
		}else if(score<=94 && score>=90) {
			System.out.println("A0");
		}else {
			
		}
		
		//반복문
		int sum=0;
		
		for(int i=1; i<=100; i=i+2) {
			sum=sum+i;
		}
		System.out.println("1~100까지의 홀수만 더한 값:" + sum);
		
		sum=0;
		int i=1;
		while(i<=100) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println("100까지의 합:" + sum);
		
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
		//배열
		int[] num= {1,2,3};
		sum=0;
		for(int j=0; j<num.length; j++) {
			System.out.println(num[j]);
			sum=sum+num[j];
		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/num.length);
		
		int[] number=null;
		System.out.print("배열크기>");
		int count=s.nextInt(); //배열갯수 키보드에서 입력
		number=new int[count]; // 배열갯수 설정
		
		sum=0; //합계변수 초기화
		
		for(int j=0; j<count; j++) { //0~배열갯수만큼 반복
			System.out.print("값["+j+"]>");
			number[j]=s.nextInt(); // 키보드에서 j번째의 값을 입력
			sum=sum+number[j]; //합계
			
		}
		System.out.println("합계:" + sum);
			
	}

}
