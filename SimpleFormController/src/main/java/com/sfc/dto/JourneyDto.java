package com.sfc.dto;

import java.util.Date;

public class JourneyDto {
	
	protected int journeyNo;
	protected String source;
	protected String destination;
	protected Date journeyDate;
	protected float amount;

	public int getJourneyNo() {
		return journeyNo;
	}
	public void setJourneyNo(int journeyNo) {
		this.journeyNo = journeyNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	

}
