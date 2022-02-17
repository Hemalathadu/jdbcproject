package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.dto.DigitalWalletDTO;

public interface DigitalWalletDAO {
	
	public int addWalletsInBatch(List<DigitalWalletDTO>wallets);
	Connection conn=null;
	PreparedStatement preparedstatement=null;
	
	
	try {
	Connection con=DriverManager.getConnection(Jdbc Constants,URL,JdbcConst, null, null);
	preparedstatement=Connection.preparedstatement("Insert into digital_wallet values(?,?,?,?)");
	
	for(DigitalWalletDTO walletDTO:wallets) {
		preparedstatement.setInt(1, walletDTO.getWalletId());
		preparedstatement.setString(2, walletDTO.getWalletProvider());
		preparedstatement.setDouble(3,walletDTO.getAvailableBalance());
		preparedstatement.setInt(4,walletDTO.getNoofTransactions());
		
		preparedstatement.addBatch();}
	
	preparedstatement.executeBatch();
	System.out.println("save successfully");
	}

if(preparedstatement!=null)
preparedstatement.close();

if(connection!=null)
	con.close();

catch(SQLException e) {
	e.printStackTrace();
}
	finally {
	preparedstatement.close();
	return 0;
	
}




}
