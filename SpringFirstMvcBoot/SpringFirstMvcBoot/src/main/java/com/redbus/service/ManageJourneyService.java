package com.redbus.service;

import java.util.List;

import com.redbus.dao.JourneyDao;
import com.redbus.dto.QuickJourneyDto;

public class ManageJourneyService {
	
	private JourneyDao dao;

	public void setDao(JourneyDao dao) {
		this.dao=dao;
	}
	
	public List<QuickJourneyDto> getRecentJourney() {
		
		return dao.get;
	}

}
