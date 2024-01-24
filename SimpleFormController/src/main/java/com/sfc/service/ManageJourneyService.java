package com.sfc.service;

import java.util.ArrayList;
import java.util.List;

import com.sfc.bo.JourneyBo;
import com.sfc.dao.JourneyDao;
import com.sfc.dto.JourneyDto;

public class ManageJourneyService {
 
	private JourneyDao dao;
	
	public void setDao(JourneyDao dao) {
		this.dao=dao;
	}
	
	public List<JourneyDto> getJourneys(){
		
	 List<JourneyDto> journeyDtos=null;
	 List<JourneyBo> journeyBos=null;
	 
	 
	 journeyDtos =new ArrayList<JourneyDto>();
	 journeyBos = dao.getJourneys();
	 
	 for(JourneyBo journeyBo:journeyBos) {
		 JourneyDto jDto=new JourneyDto();
		 jDto.setJourneyNo(journeyBo.getJourneyNo());
		 jDto.setSource(journeyBo.getSource());
		 jDto.setDestination(journeyBo.getDestination());
		 jDto.setJourneyDate(journeyBo.getJourneyDate());
		 jDto.setAmount(journeyBo.getAmount());
		 journeyDtos.add(jDto);
	 }
	 
	}
}
