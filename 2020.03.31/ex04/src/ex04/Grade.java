package ex04;

//���������� Ŭ����
public class Grade {
	//�ʵ�
	String sno;
	String sname;
	int kor;
	int eng;
	int mat;
	int tot;
	char grade;
	double avg;
	
	//�⺻ ������
	public Grade() {
		
	}
	
	//������
	public Grade(String sno, String sname, int kor, int eng, int mat) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	
	//�޼���
	void printgrade() {
		this.avg=(this.kor+this.eng+this.mat)/3.;
		this.tot=this.kor+this.eng+this.mat;
	    
		System.out.println(this.sno+"\t"+this.sname+"\t"+this.kor+"\t"+this.eng+"\t"+this.mat+"\t"+this.tot+"\t"+this.avg);
		System.out.println();
		
	}
	
	char grade(double avg) {
		if(avg>=90) {
			return 'A';
		}else if(avg>=80) {
			return 'B';
		}else if(avg>=70) {
			return 'C';
		}else {
			return 'F';
		}
	}
	
}