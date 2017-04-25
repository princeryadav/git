package com.bridgelabz.mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String query="UPDATE COFFEES SET SALES=?, TOTAL=? WHERE COF_ID=?";
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP","root","password");		
		try {
			
			connection.setAutoCommit(false);
			
			Class.forName("com.mysql.jdbc.Driver");
			

	
			PreparedStatement pStatement=connection.prepareStatement(query);
			
			pStatement.setInt(1, 5);
			pStatement.setInt(2, 90);
			pStatement.setInt(3, 102);
			pStatement.addBatch();
			
			pStatement.setInt(1, 200);
			pStatement.setInt(2, 15);
			pStatement.setInt(3, 104);
			pStatement.addBatch();
			
			pStatement.executeBatch();
			pStatement.executeUpdate();
			connection.commit();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 
			connection.rollback();
		}
		
	}

}
