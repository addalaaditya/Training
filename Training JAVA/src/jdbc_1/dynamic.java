//Create a JDBC application with a new record into an existing table by taking dynamic inputs
package jdbc_1;
import java.sql.*;
import java.util.*;
public class dynamic {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch182","root","12345678");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		int  did=sc.nextInt();
		String dname=sc.next();
		String location=sc.next();
		
		String query="insert into dept values("+did+",'"+dname+",'"+location+"')";
		System.out.println(st.executeUpdate(query));
		
		String query1="select * from dept";
		ResultSet rs=st.executeQuery(query1);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		st.close();
		con.close();
	}

}
