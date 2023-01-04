package com.unique.apps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Traveler{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name,to_city,from_city;
	
	@ManyToOne
	private Train train;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo_city() {
		return to_city;
	}

	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}

	public String getFrom_city() {
		return from_city;
	}

	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}
	
		
}