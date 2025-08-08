
package jdbc_1;
import java.sql.*;
import java.util.*;
public class dynamic2 {
	public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch182", "root", "12345678");
        
        String query = "INSERT INTO dept (did, dname, location) VALUES (?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Department ID: ");
        int did = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.print("Enter Department Name: ");
        String dname = sc.nextLine();
        
        System.out.print("Enter Department Location: ");
        String location = sc.nextLine();
        
        pst.setInt(1, did);
        pst.setString(2, dname);
        pst.setString(3, location);
        
        int result = pst.executeUpdate();
        System.out.println("Record inserted successfully. Rows affected: " + result);
        
        String query1 = "SELECT * FROM dept";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query1);
        
        System.out.println("\nAll Department Records:");
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        
        rs.close();
        st.close();
        pst.close();
        con.close();
        sc.close();
    }

}
