package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbutils {
	private static Connection cn;

	public static Connection openConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/dacmarch23?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(url, "root", "root123");
		return cn;
	}

}
