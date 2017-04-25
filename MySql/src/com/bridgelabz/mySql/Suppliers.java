package com.bridgelabz.mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Suppliers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String query="INSERT INTO SUPPLIERS VALUES(?,?,?,?)";
		//String query1="UPDATE SUPPLIERS SET CITY=? WHERE SUP_ID=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP","root","password");
			
			PreparedStatement pStatement=connection.prepareStatement(query);
			//PreparedStatement pStatement=connection.prepareStatement(query1);
			
			System.out.println("Enter new suppliers Name:");
			String supplName=scanner.next();
			System.out.println("Enter supplier id");
			int supplId=scanner.nextInt();
			
			pStatement.setString(1, supplName);
			pStatement.setInt(2, supplId);
			pStatement.executeUpdate();
			
			/*System.out.println("Enter new city");
			String newCity=scanner.next();
			System.out.println("Enter supplier id");
			int supplId=scanner.nextInt();*/
			
			pStatement.setString(1, "Banglur");
			pStatement.setInt(2, 58);
			pStatement.addBatch();
			
			pStatement.setString(1,"Chennai");
			pStatement.setInt(2, 103);
			pStatement.addBatch();
			
			pStatement.setString(1, "Kanpur");
			pStatement.setInt(2, 106);
			pStatement.addBatch();
			
			pStatement.executeBatch();
			
			/*pStatement.setInt(1, 103);
			pStatement.setString(2, "Acme, Inc.");
			pStatement.setString(3, "Mumbai");
			pStatement.setString(4, "India");
			pStatement.executeUpdate();
			
			pStatement.setInt(1, 58);
			pStatement.setString(2, "Superior Coffee");
			pStatement.setString(3, "Delhi");
			pStatement.setString(4, "India");
			pStatement.executeUpdate();
			
			pStatement.setInt(1, 106);
			pStatement.setString(2, "The High Ground");
			pStatement.setString(3, "Kolkata");
			pStatement.setString(4, "India");
			pStatement.executeUpdate();
			*/
			ResultSet resultSet=pStatement.executeQuery("Select * from SUPPLIERS");
			while(resultSet.next()){
				
				System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4));
				
				
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scanner.close();
	}

}
