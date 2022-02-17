package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.dto.CricketDetailsDTO;

public class CricketDAO {
	
	public boolean saveCricketDetails(CricketDetailsDTO dto) {
		//String insertWQuery="INSERT INTO cricket_details VALUES{
		//1,
		//'rcb',
		//'vk',
		//10)";
		String insertQuery ="INSERT INTO cricket_details VALUES("
				+dto.getNoofPlayers()+ ",' "
				+dto.getTeamName()+ "',' "
				+dto.getCaptainName()+ "',"
				+dto.getMatchesPlayed() +  ") ";
		//Step 1:
		//Class forName("com.mysql.jdbc.Driver");
		Connection con=null;
		Statement stmt=null;
		
			//Step 2:
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Hema");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Step 3:
			try {
				stmt=con.createStatement();
				
				stmt.execute(insertQuery);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		return false;			
		
	

     }
}
	
