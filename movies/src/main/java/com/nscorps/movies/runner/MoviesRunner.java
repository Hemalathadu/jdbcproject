package com.nscorps.movies.runner;

import com.nscorps.movies.dao.MoviesDAO;
import com.nscorps.movies.dto.MoviesDTO;

public class MoviesRunner {
	
	public static void main(String[] args) {
		
		MoviesDTO dto = new MoviesDTO();
		
		MoviesDAO dao = new MoviesDAO();
		
		dto.setMovie_name("vivo");
		dto.setLanguage("");
		dto.setBudget(0);
		dto.setDirector("");
	                   
	}
}
