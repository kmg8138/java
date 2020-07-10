package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "1234";

			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, password);
					
		System.out.println("---------------------------------");
		System.out.println("1.���»���|2.���|3.����|4.���|5.����");
		System.out.println("---------------------------------");
		System.out.print("����>");
		int menu=s.nextInt();
		System.out.println();
		
		switch(menu) {
		
		case 1: //���»��� insert
			System.out.println("------------------");
			System.out.println("���»���");
			System.out.println("------------------");
			System.out.print("���¹�ȣ>");
			String ano=s.next();
			System.out.print("������>");
			String aname=s.next();
			System.out.print("�ʱ��Աݾ�>");
			int balance=s.nextInt();
			
			String sql="insert into tbl_account (ano,aname,balance) values(?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, ano);
					ps.setString(2, aname);
					ps.setInt(3, balance);
					ps.execute();
					System.out.println("���: ���°� �����Ǿ����ϴ�.");
					System.out.println();
			break;
		case 2: //��� select
			System.out.println("------------------------");
			System.out.println("���¹�ȣ\t������\t�ܾ�");
			System.out.println("------------------------");
			sql="select * from tbl_account";
			ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ano=rs.getString("ano");
				aname=rs.getString("aname");
				balance=rs.getInt("balance");
				
				System.out.println(ano+"\t"+aname+"\t"+balance);			
			}
			System.out.println();

			break;
		case 3: //���� select, update
			System.out.println("------------------------");
			System.out.println("����");
			System.out.println("------------------------");
			System.out.print("���¹�ȣ>");
			ano=s.next();
			sql="select * from tbl_account where ano=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, ano);
			rs=ps.executeQuery();
			
			if(rs.next()) {				
				aname=rs.getString("aname");
				balance=rs.getInt("balance");
				
				System.out.println("������:"+aname);
				System.out.println("�ܾ�:"+balance);
				System.out.print("���ݾ�>");
				int plus=s.nextInt(); // ���ݾ� �Է�
				sql="update tbl_account set balance=balance+? where ano=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, plus);
				ps.setString(2, ano);
				ps.execute();		
				
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
				System.out.println();
			}else {
				System.out.println("���¹�ȣ�� �߸� �Է��Ͽ����ϴ�.");
				System.out.println();
			}
			break;
		case 4: //��� update
			System.out.println("------------------------");
			System.out.println("���");
			System.out.println("------------------------");
			System.out.print("���¹�ȣ>");
			ano=s.next();
			sql="select * from tbl_account where ano=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, ano);
			rs=ps.executeQuery();
			
			if(rs.next()) {				
				aname=rs.getString("aname");
				balance=rs.getInt("balance");
				
				System.out.println("������:"+aname);
				System.out.println("�ܾ�:"+balance);
				System.out.print("��ݾ�>");
				int minus=s.nextInt();
				sql="update tbl_account set balance=balance-? where ano=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, minus);
				ps.setString(2, ano);
				ps.execute();
				
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				System.out.println();
			}else {
				System.out.println("���¹�ȣ�� �߸� �Է��Ͽ����ϴ�.");
				System.out.println();
			}
			break;
		case 5: //����
			run=false;
			System.out.println("���α׷� ����");
			break;
		default:
			System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
			System.out.println();
			
		}
		}
	}

}