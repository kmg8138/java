package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class StudentDAO {
	String sql=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	//데이터베이스 접속 메서드
	public Connection con() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	
	//입력 메서드
	public void insert(StudentVO vo) throws Exception{
		sql="insert into tbl_Student(sno,sname,tel) values(?,?,?)";
		ps=con().prepareStatement(sql);
		ps.setString(1, vo.getSno());
		ps.setString(2, vo.getSname());
		ps.setString(3, vo.getTel());
		ps.execute();
		con().close();
	}
	
	//수정 메서드
	public void update(StudentVO vo) throws Exception{
		sql="update tbl_student set sname=?, tel=? where sno=?";
		ps=con().prepareStatement(sql);
		ps.setString(1, vo.getSname());
		ps.setString(2, vo.getTel());
		ps.setString(3, vo.getSno());
		ps.execute();
		con().close();
		
	}
	
	//조회 메서드
	public StudentVO read(String sno) throws Exception{
		sql="select * from tbl_student where sno=?";
		ps=con().prepareStatement(sql);
		ps.setString(1, sno);
		rs=ps.executeQuery();
		StudentVO vo=new StudentVO();
		
		if(rs.next()) {
		vo.setSno(rs.getString("sno"));
		vo.setSname(rs.getString("sname"));
		vo.setTel(rs.getString("tel"));
		con().close();
		}
		return vo;
	}
	
	//삭제 메서드
	public void delete(String sno) throws Exception{
		sql="delete from tbl_student where sno=?";
		ps=con().prepareStatement(sql);
		ps.setString(1, sno);
		ps.execute();		
		con().close();
	}
	
	//목록
	public ArrayList<StudentVO> list()throws Exception{
		ArrayList<StudentVO> array=new ArrayList<StudentVO>();
		sql="select * from tbl_student order by sno";
		ps=con().prepareStatement(sql);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			StudentVO vo=new StudentVO();
			vo.setSno(rs.getString("sno"));
			vo.setSname(rs.getString("sname"));
			vo.setTel(rs.getString("tel"));
			array.add(vo);
		}
		return array;
	}
}
