
package com.unique.apps;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="card")
public class Card extends Payment{
	
	@Column(name = "cardnum")
	private int Card_no;
	@Column(name="cardtype")
	private String Card_type;
	
	public int getCard_no() {
		return Card_no;
	}
	public void setCard_no(int card_no) {
		Card_no = card_no;
	}
	public String getCard_type() {
		return Card_type;
	}
	public void setCard_type(String card_type) {
		Card_type = card_type;
	}
	
	
	
}