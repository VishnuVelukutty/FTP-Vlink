import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


// put it into a file 

import java.io.*;
import java.sql.*;
import java.util.*;


public class DbToXml {
    static void dReader() {

        String url = "jdbc:sqlite:/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/employees.db";
        Connection conn;
        PreparedStatement st;
        try {
            conn = DriverManager.getConnection(url);
            st = conn.prepareStatement("SELECT * FROM emp ");
            ResultSet rs = st.executeQuery();

            PrintWriter pw = new PrintWriter(new File("/home/vishnu/Desktop/FTP-Vlink/kyzer-assginments/emp.xml"));
            StringBuilder sb = new StringBuilder();


            ResultSetMetaData rmd = rs.getMetaData();
            int cols = rmd.getColumnCount();

            DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = d.newDocumentBuilder();
            Document df = b.newDocument();

            Element res = df.createElement("employees");

            df.appendChild(res);

            while (rs.next()) {

                Element rows = df.createElement("employee");
                res.appendChild(rows);

                for (int i = 1; i <= cols; i++) {

                    String columnName = rmd.getColumnName(i);
                    if (columnName.equals("id")) {
                        continue;
                    }

                    String id_col;
                    Object value = rs.getObject(i);
                    Element nNode = df.createElement(columnName);
                    nNode.appendChild(df.createTextNode(value.toString()));

                    if (columnName.matches("name")) {
                        id_col = (String) rs.getObject("id");
                        nNode.setAttribute("id", id_col);
                        NodeList idRows = df.getElementsByTagName("id");

                    }

                    rows.appendChild(nNode);

                }

            }

            DOMSource domSource = new DOMSource(df);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            // transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
            StringWriter sw = new StringWriter();
            StreamResult sr = new StreamResult(sw);
            transformer.transform(domSource, sr);
            sb.append(sw);
            pw.write(sb.toString());
            pw.close();
            //System.out.println(sw.toString());

        } catch (

        Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        dReader();
    }
}
