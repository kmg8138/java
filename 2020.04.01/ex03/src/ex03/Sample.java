package ex03;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		/*�迭 ���
		Report[] report=new Report[100];
		int count=0;
		
		//Report r1=new Report();
		
		report[0]=new Report();
		report[0].setSno("01");
		report[0].setSname("�̼���");
		report[0].setKor(79);
		report[0].setEng(91);
		report[0].setMat(67);				
		count=count+1;
		
		report[1]=new Report();
		report[1].setSno("02");
		report[1].setSname("�̼���");
		report[1].setKor(37);
		report[1].setEng(97);
		report[1].setMat(77);
		count=count+1;
		
		for(int i=0; i<count; i++) {
			report[i].printList();
		} */
		
		//ArrayList ���(�÷���)
		ArrayList<Report> array=new ArrayList<Report>();
		Report r=new Report();
		r.setSno("01");
		r.setSname("�̼���");
		r.setKor(98);
		r.setEng(67);
		r.setMat(77);
		array.add(r);
		
		r=new Report();
		r.setSno("02");
		r.setSname("�̴���");
		r.setKor(91);
		r.setEng(61);
		r.setMat(71);
		array.add(r);
		
		for(int i=0; i<array.size(); i++) {
			r=array.get(i);
			r.printList();
		}
	}

}
