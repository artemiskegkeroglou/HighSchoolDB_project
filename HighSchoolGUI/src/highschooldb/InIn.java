package highschooldb;
import java.sql.*;

public class InIn {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "" ; //path, username and password for database login
    static Connection dbConnection = null;
    static String     username = ""; 
    static String     passwd = "";

    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
  	CallableStatement cst = dbConnection.prepareCall("{call insertInto()}");
        cst.executeUpdate();
        dbConnection.close();
    }
}
