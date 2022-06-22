import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.sql.*;
import java.util.*;

/**
 * test
 */
public class XmlToDb {
    public static void main(String[] args) {
        xReader();
    }

    static void xReader() {

        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/employees.db";

        Connection conn;
        PreparedStatement st;

        try {
            conn = DriverManager.getConnection(url);

            st = conn.prepareStatement("INSERT INTO emp (id,name,pos,joinyr,sal,dep)" + "VALUES (?,?,?,?,?,?)");

            File ip = new File("employees.xml");
            DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = d.newDocumentBuilder();
            Document df = b.parse(ip);

            df.getDocumentElement().normalize();

            NodeList nList = df.getElementsByTagName("employee");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    String id = eElement.getElementsByTagName("name").item(0).getAttributes().getNamedItem("id")
                            .getNodeValue();

                    List<String> columns = Arrays
                            .asList(id,
                                    eElement.getElementsByTagName("name").item(0).getTextContent(),
                                    eElement.getElementsByTagName("position").item(0).getTextContent(),
                                    eElement.getElementsByTagName("joinyear").item(0).getTextContent(),
                                    eElement.getElementsByTagName("salary").item(0).getTextContent(),
                                    eElement.getElementsByTagName("department").item(0).getTextContent());

                    for (int n = 0; n < columns.size(); n++) {
                        st.setString(n + 1, columns.get(n));
                    }

                    System.out.println("Loop runs");

                    st.execute();

                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
