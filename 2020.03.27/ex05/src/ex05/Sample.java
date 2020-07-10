package ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args)throws Exception {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		boolean run=true;
		Scanner s=new Scanner(System.in);
		while(run) {
			System.out.println("1.성적입력|2.성적출력|3.종료");
			System.out.println("----------------------");
			System.out.print("메뉴선택>");
			int menu=s.nextInt();
			
			switch(menu) {
			case 1:
				String sql="insert into tbl_grade(sno,sname,kor,mat,eng) values(?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				System.out.print("번호>");
				String sno=s.next();
				System.out.print("성명>");
				String sname=s.next();
				System.out.print("국어>");
				String kor=s.next();
				System.out.print("수학>");
				String mat=s.next();
				System.out.print("영어>");
				String eng=s.next();
				
				ps.setString(1, sno);
				ps.setString(2, sname);
				ps.setString(3, kor);
				ps.setString(4, mat);
				ps.setString(5, eng);
				ps.execute();
				
				System.out.println("입력완료");
				
				break;
			case 2:
				sql="select * from tbl_grade order by sno+sname+kor+mat+eng";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next()) {
						
				System.out.print(rs.getString("sno")+"\t");
				System.out.print(rs.getString("sname")+"\t");
				System.out.print(rs.getInt("kor")+"\t");
				System.out.print(rs.getInt("mat")+"\t");
				System.out.print(rs.getInt("eng")+"\t");
				}
				break;
			case 3:
				run=false;
				System.out.println("프로그램을 종료합니다.");
			}
			System.out.println();
		}

	}

}
