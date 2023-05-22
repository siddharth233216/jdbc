package tester;

import java.sql.Connection;
import static dbutils.dbutils.openConnection;
public class TestConnection {
	
	public static void main(String[] args) {
		try(Connection cn = openConnection();){
			
			System.out.println("connection---"+cn);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
