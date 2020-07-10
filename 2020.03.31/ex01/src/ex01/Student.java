package ex01;

public class Student {
	//필드
	String sno;
	String sname;
	String tel;
	
	//기본생성자
	Student(){
		
	}
	
	//일반생성자 - 같은 이름으로 두개의 생성자를 만드는 것을 "오버로딩" 이라고 한다.
	Student(String sno, String sname, String tel){
		this.sno=sno;
		this.sname=sname;
		this.tel=tel;
	}
	//메서드
	void print(Student s) {
		System.out.println("----------------------");
		System.out.println("번호:"+s.sno);
		System.out.println("이름:"+s.sname);
		System.out.println("전화번호:"+s.tel);
	}
}
