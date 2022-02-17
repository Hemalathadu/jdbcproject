package com.xworkz.sportss.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports_details")

public class SportDTO {
	@Id
	@Column(name="sports_id")
	private int id;
	@Column(name="sports_type")
	private String type;
	@Column(name="sports_name")
	private String name;
	@Column(name="no_of_players")
	private int no_of_players;
	@Column(name="country_of_origin")
	private String countryOfOrigin;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_of_players() {
		return no_of_players;
	}
	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	
	
	

}
