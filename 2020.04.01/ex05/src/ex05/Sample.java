package ex05;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import ex05.Report;

public class Sample {

	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		//�����ͺ��̽� ����
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		while(run) {
		System.out.println("---------------------------------------------");
		System.out.println("1.�����Է�|2.������ȸ|3.����ǥ|4.��������|5.��������|6.����");
		System.out.println("---------------------------------------------");
		System.out.print("�޴�����>");
		int menu=s.nextInt();
		
		switch(menu) {
		
		default:
			System.out.println("������ �޴��� �����ϴ�.");
		case 1://�����Է�
			Report r=new Report();
			
			System.out.println("---------------");
			System.out.print("��ȣ>");
			r.setSno(s.next());
			System.out.print("�̸�>");
			r.setSname(s.next());
			System.out.print("����>");
			r.setKor(s.nextInt());
			System.out.print("����>");
			r.setEng(s.nextInt());
			System.out.print("����>");
			r.setMat(s.nextInt());
			sql="insert into tbl_report values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, r.getSno());
			ps.setString(2, r.getSname());
			ps.setInt(3, r.getKor());
			ps.setInt(4, r.getEng());
			ps.setInt(5, r.getMat());
			ps.execute();
			System.out.println();
			System.out.println("�Է¿Ϸ�");
			System.out.println();
			break;
		case 2://������ȸ
			System.out.println("---------------");
			System.out.print("��ȣ>");
			String no=s.next();
			sql="select * from tbl_report where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, no);
			rs=ps.executeQuery();
			if(rs.next()) {
				r=new Report();
				r.setSno(rs.getString("sno"));
				r.setSname(rs.getString("sname"));
				r.setKor(rs.getInt("kor"));
				r.setEng(rs.getInt("eng"));
				r.setMat(rs.getInt("mat"));
				r.printList();
			}else {
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
			}
				
			break;
		case 3://����ǥ
			System.out.println("---------------");
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
			
			sql="select * from tbl_report order by sno";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				r=new Report();
				r.setSno(rs.getString("sno"));
				r.setSname(rs.getString("sname"));
				r.setKor(rs.getInt("kor"));
				r.setEng(rs.getInt("eng"));
				r.setMat(rs.getInt("mat"));
				r.printList();
				System.out.println();
			}
			break;
		case 4://��������
			System.out.println("---------------");
			System.out.print("��ȣ>");
			no=s.next();
			
			sql="select * from tbl_report where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, no);
			rs=ps.executeQuery();
			
			if(rs.next()) {
			sql="delete tbl_report where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, no);
			ps.execute();
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
			}else {
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
			}
			System.out.println();
			break;
		case 5://��������
			System.out.println("---------------");
			System.out.print("��ȣ>");
			no=s.next();
			
			sql="select * from tbl_report where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, no);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				r=new Report();
				r.setSno(rs.getString("sno"));
				r.setSname(rs.getString("sname"));
				r.setKor(rs.getInt("kor"));
				r.setEng(rs.getInt("eng"));
				r.setMat(rs.getInt("mat"));
				
				System.out.println("�̸�:"+r.getSname());
				System.out.print("����("+r.getKor()+")>");
				r.setKor(s.nextInt());
				System.out.print("����("+r.getEng()+")>");
				r.setEng(s.nextInt());
				System.out.print("����("+r.getMat()+")>");
				r.setMat(s.nextInt());
				
				sql="update tbl_report set kor=?,eng=?,mat=? where sno=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, r.getKor());
				ps.setInt(2, r.getEng());
				ps.setInt(3, r.getMat());
				ps.setString(4, r.getSno());
				ps.execute();
				System.out.println();
				System.out.println("�����Ϸ�");
			}else {
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
			}
			System.out.println();
			break;
		case 6://����
			run=false;
			System.out.println("���α׷��� �����մϴ�.");
		}
		}

	}

}