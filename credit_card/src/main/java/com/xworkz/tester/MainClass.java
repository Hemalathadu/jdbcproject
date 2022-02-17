package com.xworkz.tester;

import com.xworkz.credit_card.dao.CreditCardDAO;
import com.xworkz.credit_card.dao.CreditCardImplDAO;
import com.xworkz.credit_card.dto.CreditCardDTO;

public class MainClass {

	public static void main(String[] args) {
		
		
 CreditCardDTO creditcard=new CreditCardDTO();
 creditcard.setCardId(1);
 creditcard.setCardNo(10);
 creditcard.setExpirydate("16-02-2022");
 creditcard.setCardholderName("Abc");
 creditcard.setNfcenabled(false);
 
 CreditCardDTO creditcard2=new CreditCardDTO();
 creditcard2.setCardId(2);
 creditcard2.setCardNo(20);
 creditcard2.setExpirydate("11-02-1998");
 creditcard2.setCardholderName("XYZ");
 creditcard2.setNfcenabled(false);
 
 CreditCardDAO creditcarddao = new CreditCardImplDAO();
 creditcarddao.saveCard(creditcard);
 creditcarddao.saveCard(creditcard2);
 


	}

}
