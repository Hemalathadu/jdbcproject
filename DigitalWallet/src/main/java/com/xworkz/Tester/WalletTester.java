package com.xworkz.Tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dao.DigitalWalletDAO;
import com.xworkz.dao.WalletDAOImplements;
import com.xworkz.dto.DigitalWalletDTO;

public class WalletTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DigitalWalletDTO walletDTO =new DigitalWalletDTO();
		walletDTO.setWalletId(1);
		walletDTO.setWalletProvider("AnyPay");
		walletDTO.setAvailableBalance(100.0);
		walletDTO.setNoofTransactions(3);
		
		DigitalWalletDTO walletDTO2=new DigitalWalletDTO();
		walletDTO2.setWalletId(2);
		walletDTO2.setWalletProvider("BharathPae");
		walletDTO2.setAvailableBalance(300.0);
		walletDTO.setNoofTransactions(1);
		
		
		List<DigitalWalletDTO> walletDTO1=new ArrayList<DigitalWalletDTO>();
		walletDTO1.add(walletDTO);
		walletDTO1.add(walletDTO2);
		
		
		
		WalletDAOImplements walletDAOImpls=new WalletDAOImplements();
		walletDAOImpls.addWalletsInBatch(walletDTO1);
		
	}

}
