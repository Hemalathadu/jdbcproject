package com.xworkz.mobile.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dto.MobileDTO;

public class MobileRunner {

	public static void main(String[] args) {
		
		MobileDTO mobile=new MobileDTO();
		
		mobile.setMobile("Vivo");
		mobile.setRam_size(12);
		mobile.setStorage_capacity(256);
		// TODO Auto-generated method stub
		
		MobileDTO mobile1=new MobileDTO();
		
		mobile1.setMobile("Redmi");
		mobile1.setRam_size(11);
		mobile1.setStorage_capacity(220);
		
		MobileDAO dao = new MobileDAO();
	//	dao.saveMobile();
		
		//dao.updateMobileStorageByRamsize();
//		
	dao.getMobileByStorage_capacityByRam_size("vivo");
//		dao.insertMobile();
	
	List<MobileDTO> list= new ArrayList<MobileDTO>();
	list.add(mobile);
	list.add(mobile);
	}

}
