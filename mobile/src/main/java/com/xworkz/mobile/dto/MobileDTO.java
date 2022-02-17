package com.xworkz.mobile.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {
	private String Mobile;
	private int ram_size;
	private int storage_capacity;
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public int getRam_size() {
		return ram_size;
	}
	public void setRam_size(int ram_size) {
		this.ram_size = ram_size;
	}
	public int getStorage_capacity() {
		return storage_capacity;
	}
	public void setStorage_capacity(int storage_capacity) {
		this.storage_capacity = storage_capacity;
	}
	
	
	

}
