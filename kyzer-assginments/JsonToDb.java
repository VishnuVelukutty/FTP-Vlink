
import java.io.*;
import java.sql.*;
import java.util.*;
import org.json.simple.parser.*;
import org.json.JSONObject;
import org.json.simple.*;

public class JsonToDb {
    public static void main(String[] args) {
        jReader();
    }

    static void jReader() {

        Connection conn;
        PreparedStatement st;
        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/employees3.db";
        //JSONParser jPar = new JSONParser();

        try {
            conn = DriverManager.getConnection(url);

            st = conn.prepareStatement("INSERT INTO emp3 (id,name,pos,joinyr,salary,dep)" + "VALUES (?,?,?,?,?,?)");

            String filepath = "files/employees.json";

            InputStream is = new FileInputStream(filepath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            StringBuilder sb = new StringBuilder();
            String fileContents = "";
            while ((fileContents = br.readLine()) != null) {
                sb.append(fileContents);
            }

            fileContents = sb.toString();

            // System.out.println(fileContents);

            JSONObject obja = new JSONObject(fileContents);
            // System.out.println(obja);

            org.json.JSONArray jArr = obja.optJSONArray("employeesList");

            for (int i = 0; i < jArr.length(); i++) {
                JSONObject rec = jArr.getJSONObject(i);
                System.out.println("rec : " + rec);
                String id = rec.getString("id");

                JSONObject dataRec = rec.getJSONObject("data");
                String name = dataRec.getString("name");
                String pos = dataRec.getString("position");
                String jyr = dataRec.getString("joinyear");
                String sal = dataRec.getString("salary");
                String dep = dataRec.getString("department");

                st.setString(1, id);
                st.setString(2, name);
                st.setString(3, pos);
                st.setString(4, jyr);
                st.setString(5, sal);
                st.setString(6, dep);
                st.execute();

            }

            // st.execute();

        }

        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

}






/*
import java.io.*;
import java.sql.*;
import java.util.*;
import org.json.simple.parser.*;
import org.json.JSONObject;
import org.json.simple.*;

public class test {
    public static void main(String[] args) {
        jReader();
    }

    static void jReader() {

        // Connection conn;
        // PreparedStatement st;
        // String url =
        // "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/employees3.db";
        JSONParser jPar = new JSONParser();

        try {
            // conn = DriverManager.getConnection(url);

            String filepath = "files/employees.json";

            InputStream is = new FileInputStream(filepath);
            BufferedReader br =  new BufferedReader( new InputStreamReader(is,"UTF-8"));

            StringBuilder sb = new StringBuilder();
            String fileContents = "" ;
            while ((fileContents = br.readLine()) != null) {
               sb.append(fileContents); 
            }
            
            fileContents = sb.toString();

           
            // System.out.println(fileContents);

            JSONObject obja = new JSONObject(fileContents);
            System.out.println(obja);

        }

        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

}
 */