package com.bridgelabz.mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Savepoint;

public class SavePoint {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String query="INSERT INTO SUPPLIERS VALUES(?,?,?,?)";
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP","root","password");
		
		try {
			
			connection.setAutoCommit(false);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			PreparedStatement pStatement=connection.prepareStatement(query);
			
		//	SavePoint savePoint=(SavePoint) connection.setSavepoint();
			
			
			pStatement.setInt(1, 69);
			pStatement.setString(2,"BCoffee");
			pStatement.setString(3, "raipur");
			pStatement.setString(4, "India");
			pStatement.addBatch();
			
			pStatement.setInt(1, 107);
			pStatement.setString(2,"BrooCoffee");
			//pStatement.setString(3, "Kochi");
			pStatement.setString(4, "India");
			pStatement.addBatch();
			
			
			pStatement.setInt(1, 107);
			pStatement.setString(2,"NCoffee");
			pStatement.setString(3, "jaipur");
			pStatement.setString(4, "India");
			pStatement.addBatch();
			
			
			pStatement.executeBatch();
			connection.commit();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			connection.rollback();
		}
	}

}
