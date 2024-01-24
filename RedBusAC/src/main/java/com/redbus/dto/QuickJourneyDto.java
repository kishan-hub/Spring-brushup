package com.redbus.dto;

import com.redbus.bo.BusBo;
import com.redbus.bo.JourneyBo;


public class QuickJourneyDto {
	
	private BusBo busBo;
	
	private JourneyBo journeyBo;

	public BusBo getBusBo() {
		return busBo;
	}

	public void setBusBo(BusBo busBo) {
		this.busBo = busBo;
	}

	public JourneyBo getJourneyBo() {
		return journeyBo;
	}

	public void setJourneyBo(JourneyBo journeyBo) {
		this.journeyBo = journeyBo;
	}
	

}
