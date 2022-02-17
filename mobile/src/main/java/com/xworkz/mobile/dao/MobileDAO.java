package com.xworkz.mobile.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;

public class MobileDAO {
	Connection con = null;
	Statement stmt = null;

	public void saveMobile() {

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");
			stmt = con.createStatement();
			stmt.execute("Insert into mobile_details values('Vivo',12,256)");
			System.out.println("saved successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();

				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void updateMobileStorageByRamsize() {
		Connection con = null;
		Statement stmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.executeUpdate("Update mobile_details set storage_capacity=128 where ram_size=12");
			con.commit();
			System.out.println("value updated succesfully");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

//public void DeleteMobileByStorage_capacity() {
	// Connection con=null;
	//////// *Stateme
	public void getMobileByStorage_capacityByRam_size(String name) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");

			// Statement statement = connection.createStatement();

			PreparedStatement statement = connection
					.prepareStatement("select mobile_name,storage_capacity from mobile_details where ram_size=?");
			statement.setString(1, name);

			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				System.out.println(rs.getInt("storage_capacity"));
				System.out.println(rs.getString("mobile_name"));

			} else {
				System.out.println("No data found");
			}
		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void insertMobile(List<MobileDTO> mobilelist) {
		String insertQuery="INSERT INTO mobile values(?,?,?)";
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");
			statement=connection.prepareStatement(insertQuery);
			
			for(int i=0;i<mobilelist.size();i++) {
				MobileDTO mobileDTO=mobilelist.get(i);
				statement.setString(1,mobileDTO.getMobile());
				statement.setInt(2,mobileDTO.getRam_size());
				statement.setInt(3, mobileDTO.getStorage_capacity());
				
				statement.execute();
				
		}
			System.out.println("All mobiledetails saved successfully");
				
				//ResultSet rs = statement.executeQuery("Select storage_capacity from mobile_details where ram_size=12"); {

			//if (rs.next()) {
				//System.out.println(rs.getString("storage_capacity"));

			//} else {
				//System.out.println("No data founfd");
			//}
		}

		catch (Exception e) {
			e.printStackTrace();

		}finally {
			try {
				if(statement != null)
				statement.close();
				if(connection!=null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void deleteByMobile() {
		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "Hema");
			connection.setAutoCommit(false);

			statement = connection.createStatement();
			statement.execute("delete from mobile_details where name='vivo'");
			System.out.println("deleted successfully");

			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
