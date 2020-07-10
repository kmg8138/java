package ex01;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args)throws Exception {
		Scanner s=new Scanner(System.in);
		StudentDAO dao=new StudentDAO();
		StudentVO vo=new StudentVO();
		boolean run=true;
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��Է�|2.�л���ȸ|3.�л����|4.�л�����|5.�л�����|6.����");
			System.out.println("-----------------------------------------------");
			System.out.print("�޴�����>");
			int menu=s.nextInt();
			
			switch(menu) {
			
			default:
				break;
			case 1:
				System.out.println("------------------");
				System.out.println("�л��Է�");
				System.out.println("------------------");
			
				System.out.print("�й�(���ڸ�)>");
				String sno=(s.next());
				
				vo=dao.read(sno);
				
				if(vo.getSno()==null) {
				vo.setSno(sno);	
				System.out.print("�̸�>");
				vo.setSname(s.next());
				System.out.print("��ȭ��ȣ>");
				vo.setTel(s.next());
				dao.insert(vo);
				}else {
					System.out.println("�̹� �����ϴ� �й��Դϴ�.");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("------------------");
				System.out.println("�л���ȸ");
				System.out.println("------------------");		
				System.out.print("�й�(���ڸ�)>");
				sno=s.next();
				vo=dao.read(sno);
				if(vo.getSname()==null) {
					System.out.println("�л��� �������� �ʽ��ϴ�.");
				}else {
					System.out.println("����:"+vo.getSname());
					System.out.println("��ȭ��ȣ:"+vo.getTel());
				}
				
				System.out.println();
				break;
			case 3:
				System.out.println("------------------");
				System.out.println("�л����");
				System.out.println("------------------");
				System.out.println("�й�\t�̸�\t��ȭ��ȣ");
				ArrayList<StudentVO> array=dao.list();
				for(int i=0; i<array.size(); i++) {
					vo=array.get(i);
					System.out.print(vo.getSno()+"\t");
					System.out.print(vo.getSname()+"\t");
					System.out.print(vo.getTel());
					System.out.println("\n");
					
				}		
				break;
			case 4:
				System.out.println("------------------");
				System.out.println("�л�����");
				System.out.println("------------------");
				System.out.print("�й�(���ڸ�)>");
				sno=s.next();
				vo=dao.read(sno);
				
				if(vo.getSno()==null) {
					System.out.println("�л��� �������� �ʽ��ϴ�.");
				}else {
					System.out.print("�̸�("+vo.getSname()+")>");
					vo.setSname(s.next());
					System.out.print("��ȭ��ȣ("+vo.getTel()+")>");
					vo.setTel(s.next());
					dao.update(vo);
					System.out.println();
					System.out.println("�����Ϸ�");
				}
				System.out.println();
				break;
			case 5:
				System.out.println("------------------");
				System.out.println("�л�����");
				System.out.println("------------------");
				System.out.print("�й�(���ڸ�)>");
				sno=s.next();
				vo=dao.read(sno);
				if(vo.getSno()==null) {
					System.out.println("������ �л��� �������� �ʽ��ϴ�.");
				}else {
					dao.delete(sno);
					System.out.println("�����Ϸ�");
				}
				System.out.println();
				break;
			case 6:
				run=false;
				System.out.println("���α׷� ����");
				
			}
		}
	}

}