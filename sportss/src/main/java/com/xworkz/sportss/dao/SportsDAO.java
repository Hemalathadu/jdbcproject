package com.xworkz.sportss.dao;

import com.xworkz.sportss.dto.SportDTO;

public interface SportsDAO {

	
	public void saveSportss(SportDTO sportDTO);
	
	public SportDTO getSportsById(int sportsId);
	
	
}
