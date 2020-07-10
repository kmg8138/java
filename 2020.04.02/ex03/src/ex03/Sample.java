package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Sample {

	public static void main(String[] args)throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		Scanner s=new Scanner(System.in);
		boolean run=true;
		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
	    while(run) {
		System.out.println("---------------------------------------");
		System.out.println("1.�����Է�|2.������ȸ|3.��������|4.����");
		System.out.println("---------------------------------------");
		System.out.print("����>");
		int menu=s.nextInt();
		
			switch(menu) {
			
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			case 1:
				SungjukVO vo=new SungjukVO();
				boolean find=true;
				boolean find2=true;
				while(find) {
					System.out.println("-----------------------");
					System.out.print("�й�>");
					vo.setSno(s.next());
					sql="select * from tbl_student where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, vo.getSno());
					rs=ps.executeQuery();
								
					if(rs.next()) {			
						System.out.println("�̸�:"+rs.getString("sname"));	
						
						while(find2) {
						System.out.print("���>");				
						vo.setSmonth(s.next());
						sql="select * from tbl_sungjuk where smonth=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, vo.getSmonth());
						rs=ps.executeQuery();
						
							if(rs.next()) {
								System.out.println();
								System.out.println("�ش� ���� ������ �̹� �ԷµǾ����ϴ�.");
								System.out.println("���Է� ���ֽñ� �ٶ��ϴ�.");
								System.out.println();
							}else {					
								System.out.print("����>");
								vo.setKor(s.nextInt());
								System.out.print("����>");
								vo.setEng(s.nextInt());
								System.out.print("����>");
								vo.setMat(s.nextInt());
								
								sql="insert into tbl_sungjuk(sno,smonth,kor,eng,mat) values(?,?,?,?,?)";
								ps=con.prepareStatement(sql);
								ps.setString(1, vo.getSno());
								ps.setString(2, vo.getSmonth());
								ps.setInt(3, vo.getKor());
								ps.setInt(4, vo.getEng());
								ps.setInt(5, vo.getMat());
								ps.execute();
								
								System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
								System.out.println();
								find=false;
								find2=false;
							}														
						}	
					}
				else {
					System.out.println("�������� �ʴ� ��ȣ�Դϴ� �ٽ� �Է����ֽñ� �ٶ��ϴ�.");
					System.out.println();
				}						
				}
				break;
			case 2:
				System.out.println("-----------");
				break;
			case 3:
				break;
			case 4:
				run=false;
				
			}
	    }
	}

}