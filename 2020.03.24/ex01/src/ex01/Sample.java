package ex01;

public class Sample {

	public static void main(String[] args) {
		//���� IF��
		/*
		int score=90;
			System.out.println("������" + score + "�� �Դϴ�.");
		if(score>=90) {
			System.out.println("����� A�Դϴ�.");
		} else if(score>=80){
			System.out.println("����� B�Դϴ�.");
		} else if(score>=70){
			System.out.println("����� C�Դϴ�.");
		} else {
			System.out.println("����� F�Դϴ�.");
		}
		*/
		
		// ����� ������ 100���� �̻� �ֿ��, 50���� �̻� ���, 50�̸��� ���� ���
		int sale=70;
		System.out.println("������" + sale + "���� �Դϴ�.");
		if(sale>=100) {
			System.out.println("�ֿ��");
		}else if(sale>=50) {
			System.out.println("���");
		}else {
			System.out.println("����");
		}
		
		//��ø IF��
		int score=88;
		String grade="";
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
		}else {
			grade="A0";
		}
		}else if(score>=80) {
			if(score>=85) {
				grade="B+";
			}else {
				grade="B0";
			}
		}else if(score>=70) {
			if(score>=75) {
				grade="C+";
			}else {
				grade="C0";
			}
		}else {
			grade="F";
		}
		
		System.out.println("�����" + grade + "�Դϴ�.");
	}//main

}//sample
