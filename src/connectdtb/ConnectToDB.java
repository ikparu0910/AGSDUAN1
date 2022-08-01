package connectdtb;

import java.sql.*;

public class ConnectToDB {

	
	/* class's variables */
	private static Connection con = null;
	private static String url = "jdbc:sqlserver://";
	private static String serverName = "localhost";
//	private static String serverName = "10.200.201.168";
	private static String portNumber = "1433";
	private static String databaseName = "du_an1_1";
	private static String userName = "sa";
	private static String password = "123456";
			
	/* class's methods */
	public static String getConnectionUrl() {
		return url + serverName + ": " + portNumber + "; databaseName=" + databaseName + ";";
	}
	
	public static Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(getConnectionUrl(), userName, password);
		}
		catch (Exception e) {
			con = null;
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection() {
		try {
			if (con != null) {
				con.close();
			}
			con = null;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	/* instance methods */

}
