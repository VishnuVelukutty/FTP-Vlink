package qa.sql;
import java.sql.*;


public class sqltest3 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/qa/sql/test.db";  
        Statement st;
        Connection conn;

        try {  
            conn = DriverManager.getConnection(url); 
            st = conn.createStatement();
            String sql1 = "INSERT INTO employee (id,name)"+" VALUES (1,'Vishnu')";
            st.executeUpdate(sql1);
            String sql2 = "INSERT INTO employee (id,name)"+" VALUES (2,'Hemanshu')";
            st.executeUpdate(sql2);



            
    
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        



}
}
