package qa.sql;
import java.sql.*;

public class sqltest5 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/qa/sql/test.db";  
        Statement st;
        Connection conn;
        ResultSet rs;

        try {  
            conn = DriverManager.getConnection(url); 
            st = conn.createStatement();
            
            String sql = "SELECT * FROM employee"+ " INNER JOIN" + "traders";
            // String sql = "SELECT * FROM employee"+ " OUTER JOIN" + "traders";
            // String sql = "SELECT * FROM employee"+ " RIGHT JOIN" + "traders";
            // String sql = "SELECT * FROM employee"+ " LEFT JOIN" + "traders";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println( "ID = " + id );
         System.out.println( "NAME = " + name );
            }
                    
    
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
}
}
