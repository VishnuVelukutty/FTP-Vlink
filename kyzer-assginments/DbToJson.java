import java.sql.*;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class DbToJson {
    public static void main(String[] args) {
        dReader();
    }

    static void dReader() {
        Connection conn;
        PreparedStatement st;
        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/employees3.db";

        try {

            conn = DriverManager.getConnection(url);
            PrintWriter pw = new PrintWriter(new File("/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/emp3.json"));
            StringBuilder sb = new StringBuilder();

            st = conn.prepareStatement("SELECT * FROM emp3 ");
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int columnsNumber = rsmd.getColumnCount();

            JSONArray jArr = new JSONArray();
            JSONObject jo = new JSONObject();

            while (rs.next()) {
                
                JSONObject rec = new JSONObject();
                JSONObject data = new JSONObject();

    
                rec.put("id", rs.getString("id"));

                data.put("name", rs.getString("name"));
                data.put("position", rs.getString("pos"));
                data.put("joinyear", rs.getString("joinyr"));
                data.put("salary", rs.getString("salary"));
                data.put("department", rs.getString("dep"));
               
                rec.put("data", data); // json inside json format 
                // data is another json inside json 


                System.out.println("this is rec" +rec);
                jo.put("employeesList", jArr);
                jArr.put(rec);
               



            }
        

            
            

            pw.write(jo.toString(4));
            pw.close();

            // }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
