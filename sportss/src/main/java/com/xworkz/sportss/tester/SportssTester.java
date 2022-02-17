package com.xworkz.sportss.tester;

import com.xworkz.sportss.dao.SportsDAO;
import com.xworkz.sportss.dao.SportsDAOImpli;
import com.xworkz.sportss.dto.SportDTO;

public class SportssTester {

	public static void main(String[] args) {
		
		SportDTO sportsDTO= new SportDTO();
		sportsDTO.setId(5);
		sportsDTO.setType("cricket");
		sportsDTO.setName("MSD");
		sportsDTO.setNo_of_players(11);
		sportsDTO.setCountryOfOrigin("INDIA");
		
		SportDTO sportsDTO2=new SportDTO();
		sportsDTO2.setId(7);
		sportsDTO2.setType("football");
		sportsDTO2.setName("ronaldo");
		sportsDTO2.setNo_of_players(8);
		sportsDTO2.setCountryOfOrigin("ENGLAND");
		
		SportDTO sportsDTO3=new SportDTO();
		sportsDTO3.setId(12);
		sportsDTO3.setType("Badmiton");
		sportsDTO3.setName("pvs");
		sportsDTO3.setNo_of_players(2);
		sportsDTO3.setCountryOfOrigin("INDIA");
		
		SportsDAO sportsDAO=new SportsDAOImpli();
		sportsDAO.saveSportss(sportsDTO);
		sportsDAO.saveSportss(sportsDTO2);
		sportsDAO.saveSportss(sportsDTO3);
		System.out.println(sportsDAO);
		
		SportsDAO sportsDAO2=new SportsDAOImpli();
		sportsDAO2.getSportsById(7);
		System.out.println(sportsDAO2);

	}

}
