package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.constants.JDBCConstants;
import com.xworkz.dto.DigitalWalletDTO;

public abstract class WalletDAOImplements implements DigitalWalletDAO {
	
	public int addWalletInBatch (DigitalWalletDTO walletDTO) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String query="Insert into digital_wallet values(?,?,?,?)";
		
		try {
			connection=DriverManager.getConnection(JDBCConstants.URL,JDBCConstants.USERNAME,JDBCConstants.PASSWARD);
			preparedstatement=connection.prepareStatement(query);
			
			for(DigitalWalletDTO walletDTO1:walletDTO) {
				preparedStatement.setInt(1,  walletDTO.getWalletId());
				preparedStatement.setString(2, walletDTO.getWalletProvider());
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	
	
}
