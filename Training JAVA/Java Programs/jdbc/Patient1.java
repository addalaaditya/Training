package jdbc;
import java.sql.*;
public class Patient1
{
public static void main(String[] args)
	{
 
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "12345678");
		
		String sql="INSERT INTO patient1(NAME, AGE, DISEASE, ADM_DATE, DOCTOR_ASSI) VALUES(?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1, "Renu");
		pstmt.setInt(2, 30);
		pstmt.setString(3, "cold");
		pstmt.setString(4, "");
		pstmt.setString(5, "");
		int rowsInserted=pstmt.executeUpdate();
		if(rowsInserted>0)
		{
			System.out.println("Patient inserted successfully");
		}
		
		con.close();
	 }
	catch (Exception e)
	{
	e.printStackTrace();
			
	}
	}
}
 