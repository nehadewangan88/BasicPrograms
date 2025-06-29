package SampleTests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";

		Connection connection = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Details","root","root"); 
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("Select * from Customer");
		System.out.println("CustomerID       CustomerName");
		System.out.println("----------------------------");
		while(resultSet.next())
		{
			
			System.out.println(resultSet.getString("CustomerID")+"                 "+resultSet.getString("CustomerName"));
		}
	}

}
