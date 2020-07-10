package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

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
		
		while(run) {	
			System.out.println("------------------------------");
			System.out.println("1.�Է�|2.���|3.����|4.����|5.����");
			System.out.println("------------------------------");
			System.out.print("����>");
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1: //�Է�
				System.out.print("��ȣ>");
				String sno=s.next();
				System.out.print("�̸�>");
				String sname=s.next();
				System.out.print("����>");
				int kor=s.nextInt();
				System.out.print("����>");
				int eng=s.nextInt();
				System.out.print("����>");
				int mat=s.nextInt();
				String sql="insert into tbl_grade(sno,sname,kor,eng,mat,tot) values(?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, sno);
				ps.setString(2, sname);
				ps.setInt(3, kor);
				ps.setInt(4, eng);
				ps.setInt(5, mat);
				ps.setInt(6, kor+eng+mat);
				ps.execute();
				System.out.println("������ �Է¿Ϸ�");
				System.out.println();
				break;
			case 2: //���
				sql="select * from tbl_grade order by sno";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				System.out.println("��ȣ\t����\t����\t����\t����\t����\t���");
				while(rs.next()) {
					sno=rs.getString("sno");
					sname=rs.getString("sname");
					kor=rs.getInt("kor");
					mat=rs.getInt("mat");
					eng=rs.getInt("eng");
					
					System.out.print(sno+"\t");
					System.out.print(sname+"\t");
					System.out.print(kor+"\t");
					System.out.print(eng+"\t");
					System.out.print(mat+"\t");
					System.out.print(kor+eng+mat+"\t");
					System.out.println((kor+eng+mat)/3.);
					System.out.println();
				}
				System.out.println();
				break;
			case 3: //����
				System.out.print("��ȣ>");
				sno=s.next();
				sql="delete from tbl_grade where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, sno);
				ps.execute();
				System.out.println("������ �����Ϸ�");
				System.out.println();
				break;
			case 4: //����
				System.out.print("������ȣ>");
				sno=s.next();
				sql="select * from tbl_grade where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, sno);
				rs=ps.executeQuery();
				
				if(rs.next()) {
					sname=rs.getString("sname");
					kor=rs.getInt("kor");
					eng=rs.getInt("eng");
					mat=rs.getInt("mat");
					
					System.out.println("����:" + sname);
					System.out.print("����:[" + kor + "]>");
					kor=s.nextInt();
					System.out.print("����:[" + eng + "]>");
					eng=s.nextInt();
					System.out.print("����:[" + mat + "]>");
					mat=s.nextInt();
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					System.out.println();
					
					sql="update tbl_grade set kor=?,eng=?,mat=? where sno=?";
					ps=con.prepareStatement(sql);
					ps.setInt(1, kor);
					ps.setInt(2, eng);
					ps.setInt(3, mat);
					ps.setString(4, sno);
					ps.execute();
				}else {
					System.out.println("���� ��ȣ�Դϴ�.");
					System.out.println();
				}
				break;
			case 5: //����
				run= false;
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
			
		}
	}

}