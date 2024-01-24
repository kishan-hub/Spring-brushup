package com.sfc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sfc.bo.JourneyBo;

public class JourneyDao {
	
	private JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_JOURNEY="select * from JOURNEY_TBL";
	
	public JourneyDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	

	public List<JourneyBo> getJourneys() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_JOURNEY, new JourneyRowMapper());
	}
	
	private final class JourneyRowMapper implements RowMapper<JourneyBo>{

		@Override
		public JourneyBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			JourneyBo journeyBo =new JourneyBo();
			journeyBo.setJourneyNo(rs.getInt("JOURNEY_NO"));
			journeyBo.setSource(rs.getString("SOURCE"));
			journeyBo.setDestination(rs.getString("DESTINATION"));
			journeyBo.setJourneyDate(rs.getDate("JOURNEY_DT"));
			
			return null;
		}
		
	}

}
