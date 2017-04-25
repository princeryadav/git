package com.bridgelabz.mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CoffeeShop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String query="Select * from COFFEES";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEE_SHOP","root","password");
			
			System.out.println("connected");
			
			Statement statement=connection.createStatement();
			
			System.out.println("");
			//statement.executeUpdate("INSERT INTO COFFEES VALUES('French_Roast_Decaf',52,9.7,0,0)");
			int n=statement.executeUpdate("UPDATE COFFEES SET COF_NAME='FrenchDecaf' WHERE COF_ID=52");
			//statement.executeUpdate("DELETE FROM COFFEES WHERE COF_ID=");
			System.out.println(n);
			ResultSet resultSet=statement.executeQuery(query);
			while(resultSet.next()){
				String coffeeName=resultSet.getString("COF_NAME");
				int suplierId=resultSet.getInt("COF_ID");
				String price=resultSet.getString("PRICE");
				String salse=resultSet.getString("SALES");
				String total=resultSet.getString("TOTAL");
				System.out.println(coffeeName+"\t"+suplierId+"\t"+price+"\t"+salse+"\t"+total);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
