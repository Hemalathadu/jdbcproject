package com.nscorps.movies.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MoviesDAO {

	public void saveMovies() {
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");
			stmt = con.createStatement();
			stmt.execute("Insert into movies values('Appu', 5 , 'Kannada', 15 , 'Dinesh Babu')");
			System.out.println("Movie Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public void updateMoviesRatingsByBudget() {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root", "Hema");
		}
		catch(Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con.setAutoCommit(false);
			stmt=con.createStatement();
			stmt.executeUpdate("Update movies set ratings=4 where budget=15");
			con.commit();
			System.out.println("value updated successfully");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}
	

public void getMoviesByRatingsByBudget(String name) {
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");
        PreparedStatement statement= con.prepareStatement("select movie_name,ratings from movies where budget=?");
        statement.setString(1,name);
        
        ResultSet rs = statement.executeQuery();
        
        if(rs.next()) {
        	System.out.println(rs.getInt("ratings"));
        	System.out.println(rs.getString("movie_name"));
        	
        }else {
        	System.out.println("No data");
        }
	}
	
	catch(Exception e) {
		e.printStackTrace();
        }
	}

public void deleteByMovie_name() {
	Connection con=null;
	Statement statement=null;
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");
		con.setAutoCommit(false);
		
		statement=con.createStatement();
		statement.addBatch("delete from movies where name='Appu' ");
		System.out.println("deleted successfully");
		
		con.commit();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	finally {
		
		try {
			statement.close();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		}
		
		
	}
}





