package ex03;

public class Sample {

	public static void main(String[] args) {
		//문자형 변수 = char
		char a = 'A';
		String name = "이송현";
		System.out.println("반:" + a);
		System.out.println("이름:"  + name);
		
		int kor=85, eng=76, mat=77;
		double tot=kor + eng + mat;
		double avg=tot / 3;
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + mat);
		System.out.println("총점:" + tot);
		System.out.println("평균:" + avg);
		
		//논리형 변수 = true, false
		boolean stop=true;
		stop=false;
		System.out.println("stop:" + stop);
	}

}
