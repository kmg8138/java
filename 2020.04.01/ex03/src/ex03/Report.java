package ex03;
//학생 성적관리용 클래스
public class Report {
	//필드
	private String sno;
	private String sname;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade; //학점(90이상 'A' 80점이상 'B' ~)
	
	//생성자
	
	//메서드
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot=kor+eng+mat;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg=getTot()/3.;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		if(getAvg()>=90) {
			grade='A';
		}else if(getAvg()>=80) {
			grade='B';
		}else if(getAvg()>=70) {
			grade='C';
		}else {
			grade='F';
		}
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void printReport() {
		System.out.println("번호:"+sno+"\t");
		System.out.println("이름:"+sname+"\t");
		System.out.println("국어:"+kor+"\t");
		System.out.println("영어:"+eng+"\t");
		System.out.println("수학:"+mat+"\t");
		System.out.println("총점:"+getTot()+"\t");
		System.out.println("평균:"+getAvg()+"\t");
		System.out.println("학점:"+getGrade());
		System.out.println("-------------------");
	}
	public void printList() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.print(sno+"\t");
		System.out.print(sname+"\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(mat+"\t");
		System.out.print(getTot()+"\t");
		System.out.print(getAvg()+"\t");
		System.out.println(getGrade());
	}
}
