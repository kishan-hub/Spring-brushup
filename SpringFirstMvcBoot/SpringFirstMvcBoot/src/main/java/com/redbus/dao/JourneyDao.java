package com.redbus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.redbus.bo.BusBo;
import com.redbus.bo.JourneyBo;
import com.redbus.dto.QuickJourneyDto;

public class JourneyDao {
	
	private JdbcTemplate jdbcTemplate;
	private final String SQL_GET_RECENT_JOURNEY="select * from bus b inner join Journey j on b.bus_no=j.bus_no";
	
	public JourneyDao(JdbcTemplate jdbcTemplte) {
		this.jdbcTemplate=jdbcTemplte;
	}
	
	public List<QuickJourneyDto> getJourney(){
		return jdbcTemplate.query(SQL_GET_RECENT_JOURNEY,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				 QuickJourneyDto dto=null;
				 BusBo busBo=new BusBo();
				 busBo.setBusNo(rs.getInt("BUS_NO"));
				 busBo.setBusName(rs.getString("BUS_NAME"));
				 busBo.setServiceNo(rs.getString("TYPE"));
				 busBo.setType(rs.getString("CAPACITY"));
				 
				 JourneyBo journeyBo =new JourneyBo();
				 journeyBo.setJourneyNo(rs.getInt("JOURNEY_NO"));
				 journeyBo.setSource(rs.getString("SOURCE"));
				 journeyBo.setDestination(rs.getString("DESTINATION"));
				 journeyBo.setBusNo(rs.getString("BUS_NO"));
				 journeyBo.setAmount(rs.getString("AMOUNT"));
				 
				 dto= new QuickJourneyDto();
				 dto.setBusBo(busBo);
				 dto.setJourneyBo(journeyBo);
				 
				return dto;
			}
			
		});
	}

}
