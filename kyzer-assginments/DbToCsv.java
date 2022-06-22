import java.sql.*;
import java.io.*;
import java.io.PrintWriter;

public class DbToCsv {
    public static void main(String[] args) {
        dReader();
    }

    static void dReader() {

        Connection conn;
        PreparedStatement st;
        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/employees2.db";

        {
            // String line = "";

            try {
                conn = DriverManager.getConnection(url);
                PrintWriter pw = new PrintWriter(new File("/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/emp2.csv"));
                StringBuilder sb = new StringBuilder();

                st = conn.prepareStatement("SELECT * FROM emp2 ");
                ResultSet rs = st.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();

                while (rs.next()) {

                  
                    // for (int i = 1; i <= columnsNumber; i++) {
                    // if (i > 1)

                    // System.out.print(", ");
                    // String columnValue = rs.getString(i);
                    // System.out.println();

                    // System.out.println();

                    // System.out.print( rsmd.getColumnName(i) +" "+ columnValue);
                    // }

                    sb.append(rs.getString("id"));
                    sb.append(",");
                    sb.append(rs.getString("name"));
                    sb.append(",");
                    sb.append(rs.getString("pos"));
                    sb.append(",");
                    sb.append(rs.getString("joinyr"));
                    sb.append(",");
                    sb.append(rs.getString("salary"));
                    sb.append(",");
                    sb.append(rs.getString("dep"));
                    sb.append("\r\n");
                    }

                    pw.write(sb.toString());
                    pw.close();

                

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

        }
    }

}
