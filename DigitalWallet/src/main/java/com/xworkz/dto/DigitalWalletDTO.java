package com.xworkz.dto;

import java.io.Serializable;

public class DigitalWalletDTO implements Serializable {
	
	int walletId;
	String walletProvider;
	double availableBalance;
	int noofTransactions;
	
	
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public String getWalletProvider() {
		return walletProvider;
	}
	public void setWalletProvider(String walletProvider) {
		this.walletProvider = walletProvider;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public int getNoofTransactions() {
		return noofTransactions;
	}
	public void setNoofTransactions(int noofTransactions) {
		this.noofTransactions = noofTransactions;
	}
	
	
	

}
