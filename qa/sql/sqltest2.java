package qa.sql;
import java.sql.*;

public class sqltest2 {
    public static void main(String[] args) {
        Connection conn;
        Statement st;

        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/qa/sql/test.db";  
        String sql = "CREATE TABLE IF NOT EXISTS employee(id INTEGER PRIMARY KEY, name TEXT NOT NULL)";

        try {  
            conn = DriverManager.getConnection(url); 
            st = conn.createStatement();
            st.execute(sql); 
    
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        

       }
    
}
