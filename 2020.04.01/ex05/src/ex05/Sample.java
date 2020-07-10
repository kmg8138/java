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
		
		//데이터베이스 연결
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
		System.out.println("1.성적입력|2.성적조회|3.성적표|4.성적삭제|5.성적수정|6.종료");
		System.out.println("---------------------------------------------");
		System.out.print("메뉴선택>");
		int menu=s.nextInt();
		
		switch(menu) {
		
		default:
			System.out.println("선택한 메뉴가 없습니다.");
		case 1://성적입력
			Report r=new Report();
			
			System.out.println("---------------");
			System.out.print("번호>");
			r.setSno(s.next());
			System.out.print("이름>");
			r.setSname(s.next());
			System.out.print("국어>");
			r.setKor(s.nextInt());
			System.out.print("영어>");
			r.setEng(s.nextInt());
			System.out.print("수학>");
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
			System.out.println("입력완료");
			System.out.println();
			break;
		case 2://성적조회
			System.out.println("---------------");
			System.out.print("번호>");
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
				System.out.println("번호를 잘못 입력하였습니다.");
			}
				
			break;
		case 3://성적표
			System.out.println("---------------");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
			
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
		case 4://성적삭제
			System.out.println("---------------");
			System.out.print("번호>");
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
			
			System.out.println("삭제가 완료되었습니다.");
			
			}else {
				System.out.println("번호를 잘못 입력하였습니다.");
			}
			System.out.println();
			break;
		case 5://성적수정
			System.out.println("---------------");
			System.out.print("번호>");
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
				
				System.out.println("이름:"+r.getSname());
				System.out.print("국어("+r.getKor()+")>");
				r.setKor(s.nextInt());
				System.out.print("영어("+r.getEng()+")>");
				r.setEng(s.nextInt());
				System.out.print("수학("+r.getMat()+")>");
				r.setMat(s.nextInt());
				
				sql="update tbl_report set kor=?,eng=?,mat=? where sno=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, r.getKor());
				ps.setInt(2, r.getEng());
				ps.setInt(3, r.getMat());
				ps.setString(4, r.getSno());
				ps.execute();
				System.out.println();
				System.out.println("수정완료");
			}else {
				System.out.println("존재하지 않는 번호입니다.");
			}
			System.out.println();
			break;
		case 6://종료
			run=false;
			System.out.println("프로그램을 종료합니다.");
		}
		}

	}

}
