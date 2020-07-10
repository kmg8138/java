package ex05;

public class Sample {

	public static void main(String[] args) {
		String[] name= {"홍길동","심청이","강감찬"};
		int[] kor= {97, 95, 98};
		int[] eng= {92, 60, 51};
		int[] mat= {80, 77, 66};
		int[] tot=new int[3];
		int[] avg=new int[3];
		String[] grade=new String[3];
		int sumkor=0;
		int sumeng=0;
		int summat=0;
		int sumtot=0;
		int sumavg=0;
		
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t평점");
		for(int i=0; i<=2; i++) {
					
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3;
			
			if(avg[i]>=90) {
				grade[i]="A";
			}else if(avg[i]>=80) {
				grade[i]="B";
			}else {
				grade[i]="C";
			}
			
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+grade[i]);
			
			sumkor=sumkor+kor[i];
			sumeng=sumeng+eng[i];
			summat=summat+mat[i];
			sumavg=sumavg+avg[i];
		
			
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println("과목별 반평균\t" + sumkor/3 + "\t" + sumeng/3 + "\t" + summat/3 + "\t" + sumavg/3);
	}

}
