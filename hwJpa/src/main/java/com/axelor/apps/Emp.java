package com.axelor.apps;

import javax.persistence.*;

@Entity
@Table(name="emptbl1")
public class Emp {
		
	@Id @Column(name="id") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name") private String name;
	@Column(name="city") private String city;
	
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
