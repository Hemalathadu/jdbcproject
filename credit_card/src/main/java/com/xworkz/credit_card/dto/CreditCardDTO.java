package com.xworkz.credit_card.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="card_credit")
public class CreditCardDTO {
	
	@Id
	
	@Column(name="card_id")
	private int cardId;
	
	@Column(name="card_no")
	private int cardNo;
	
	@Column(name="expiry_date")
	private String expirydate;
	
	@Column(name="card_holder_name")
	private String cardholderName;
	
	@Column(name="nfc_enabled")
	private boolean nfcenabled;
	
	
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getCardholderName() {
		return cardholderName;
	}
	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}
	public boolean getNfcenabled() {
		return nfcenabled;
	}
	public void setNfcenabled(boolean nfcenabled) {
		this.nfcenabled = nfcenabled;
	}
	
	
	

}
