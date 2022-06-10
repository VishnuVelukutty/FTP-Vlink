package qa.sql;
import java.sql.*;

public class sqltest4 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/qa/sql/test.db";  
        Statement st;
        Connection conn;
        ResultSet rs;

        try {  
            conn = DriverManager.getConnection(url); 
            st = conn.createStatement();
            String sql1 = "UPDATE employee set name = 'Himanshu' where id = 1 ";
            st.executeUpdate(sql1);
            String sql2 = "SELECT * FROM employee";
            rs = st.executeQuery(sql2);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println( "ID = " + id );
         System.out.println( "NAME = " + name );
            }
            String sql3 = "DELETE FROM employee where id = 2";
            st.executeQuery(sql3);            
    
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
}
}
