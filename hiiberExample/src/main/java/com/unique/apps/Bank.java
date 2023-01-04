package com.unique.apps;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bank_id;
	String bank_Name;
	
	@OneToMany( targetEntity=Consumer.class )
	private List ConsumerList;

	public int getBank_id() {
		return bank_id;
	}
	

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_Name() {
		return bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

	public List getConsumerList() {
		return ConsumerList;
	}

	public void setConsumerList(List consumerList) {
		ConsumerList = consumerList;
	}
	
	
}
