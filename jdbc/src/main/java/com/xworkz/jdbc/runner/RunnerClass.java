package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dao.CricketDAO;
import com.xworkz.jdbc.dto.CricketDetailsDTO;

public class RunnerClass {
	public static void main(String args[]) {
		
		CricketDetailsDTO cricketDetailsDTO=new CricketDetailsDTO();
		
		cricketDetailsDTO.setNoofPlayers((byte)13);
		cricketDetailsDTO.setTeamName("CyresSK");
		cricketDetailsDTO.setCaptainName("Dhoni");
		cricketDetailsDTO.setMatchesPlayed(12);
		
		CricketDAO cricketDAO=new CricketDAO();
		cricketDAO.saveCricketDetails(cricketDetailsDTO);
		System.out.println(cricketDetailsDTO);
	}

}
