package com.sfc.model;

import java.util.Date;

public class AddCriteria {
	
	protected String source;
	protected String destination;
	protected Date journeyDate;
	
	//setters and getters
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
	
}
