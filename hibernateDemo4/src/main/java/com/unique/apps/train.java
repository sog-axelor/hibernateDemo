package com.unique.apps;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class train{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int train_id;
	private String train_name;
	
	@OneToMany(targetEntity = traveler.class)
	private List travelerList;
	
	
	public List getTravelerList() {
		return travelerList;
	}
	public void setTravelerList(List travelerList) {
		this.travelerList = travelerList;
	}
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	
	
	
}