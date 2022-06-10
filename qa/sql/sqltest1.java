package qa.sql;
import java.sql.*;

public class sqltest1 {
   public static void main(String[] args) {
    String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/qa/sql/test.db";  
    Connection conn ;

    try {  
        conn = DriverManager.getConnection(url);  
        if (conn != null) {  
            DatabaseMetaData meta = conn.getMetaData();  
            System.out.println("The driver name is " + meta.getDriverName());  
            System.out.println("A database has been created.");  
        }  

    } catch (SQLException e) {  
        System.out.println(e.getMessage());  
    }  
   }

    
}
