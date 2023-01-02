package com.unique.apps;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name= "stbl")   
public class student {
	@Id   
	private int id;
	private String fname,lname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
