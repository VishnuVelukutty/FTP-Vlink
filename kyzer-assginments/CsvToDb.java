import java.sql.*;
import java.io.*;
import java.util.*;

public class CsvToDb {
    public static void main(String[] args) {
        cReader();
    }

    static void cReader() {

        Connection conn;
        PreparedStatement st;
        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/employees2.db";

        {
            String line = "";

            try {
                conn = DriverManager.getConnection(url);

                BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
                while ((line = br.readLine()) != null) {
                    String[] employee = line.split(",");

                    st = conn.prepareStatement("INSERT INTO emp2 (id,name,pos,joinyr,salary,dep)" + "VALUES (?,?,?,?,?,?)");
                    if (employee[0].matches("id")) {
                        continue;
                    }

                    System.out.println("Employee [ID =" + employee[0] + " Name =" + employee[1] + ", position="
                            + employee[2] + ", joinyear=" + employee[3] + ", Salary= " + employee[4] + ", department= "
                            + employee[5] + "]");

                    System.out.println(employee.length);
                    st.setString(1, employee[0]);
                    st.setString(2, employee[1]);
                    st.setString(3, employee[2]);
                    st.setString(4, employee[3]);
                    st.setString(5, employee[4]);
                    st.setString(6, employee[5]);
                    st.execute();

                }

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

        }
    }

}
