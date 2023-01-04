package com.unique.apps;

import javax.persistence.*;

@Entity
public class Library {
	
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private int b_id;  
	private String b_name;  
	
	@OneToOne(cascade =CascadeType.PERSIST)
	private Student stud;

	public Library(int b_id, String b_name, Student stud) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.stud = stud;
	}



	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getB_id() {
		return b_id;
	}



	public void setB_id(int b_id) {
		this.b_id = b_id;
	}



	public String getB_name() {
		return b_name;
	}



	public void setB_name(String b_name) {
		this.b_name = b_name;
	}



	public Student getStud() {
		return stud;
	}



	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	
		
}
