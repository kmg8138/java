package ex02;

public class Sample {

	public static void main(String[] args) {
		
		String name="�̼���";
		int kor=98, eng=75, mat=83;
		int tot=kor+eng+mat;
		double avg=(double)tot/3;
		String grade="";
		//��� ���ϱ�
		if(avg>=90) {
			if(avg>=95) {
				grade="A+";
			}else {
				grade="A0";
			}
		}else if(avg>=80){
			if(avg>=85) {
				grade="B+";
			}else {
				grade="B0";
			}
		}else if(avg>=70) {
			if(avg>=75) {
				grade="C+";
			}else {
				grade="C0";
			}
		}else {
			grade="F";
		}
		
		//����ǥ ���
		System.out.println("�̸�:" + name);
		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + mat);
		System.out.println("����:" + tot);
		System.out.println("���:" + avg);
		System.out.println("���:" + grade);
	}

}