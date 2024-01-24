package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

public class EmpSearchDAOImpl implements EmpSearchDAO {
	private static final String EMP_SEARCH_QUERY="select empno,ename,job,sal,mgr,deptno  from emp "
                                                                                                + " where (empno is not null and empno=? )"
                                                                                                + "or (ename is  not null and ename like ?)"
                                                                                                + "or (job is not null and job like ?)"
                                                                                                + "or (sal is not null  and sal=?)";
	private JdbcTemplate jt;
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public List<SearchResultBO> search(SearchBO sbo) {
		List <SearchResultBO> listRBO=jt.query(EMP_SEARCH_QUERY, new EmpRowMapper(),sbo.getNo(),
				                                                                                                                                                                 sbo.getName(),
				                                                                                                                                                                 sbo.getDesg(),
				                                                                                                                                                                 sbo.getSalary());
		return listRBO;
	}
	private static final class EmpRowMapper implements RowMapper<SearchResultBO>{

		@Override
		public SearchResultBO mapRow(ResultSet rs, int pos) throws SQLException {
			//copy ResultSet record into SearchResultBO obj
			SearchResultBO  rbo=new SearchResultBO();
			rbo.setNo(rs.getInt(1));
			rbo.setName(rs.getString(2));
			rbo.setDesg(rs.getString(3));
			rbo.setSalary(rs.getInt(4));
			rbo.setMgrno(rs.getInt(5));
			rbo.setDeptno(rs.getInt(6));
			return rbo;
		}
		
		
	}

}
