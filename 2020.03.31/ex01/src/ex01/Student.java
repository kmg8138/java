package ex01;

public class Student {
	//�ʵ�
	String sno;
	String sname;
	String tel;
	
	//�⺻������
	Student(){
		
	}
	
	//�Ϲݻ����� - ���� �̸����� �ΰ��� �����ڸ� ����� ���� "�����ε�" �̶�� �Ѵ�.
	Student(String sno, String sname, String tel){
		this.sno=sno;
		this.sname=sname;
		this.tel=tel;
	}
	//�޼���
	void print(Student s) {
		System.out.println("----------------------");
		System.out.println("��ȣ:"+s.sno);
		System.out.println("�̸�:"+s.sname);
		System.out.println("��ȭ��ȣ:"+s.tel);
	}
}
