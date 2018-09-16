/**
 * 
 */
package com.rahul.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.rahul.spring.configuartion.OracleConfiguration;
import com.rahul.spring.entity.Roles;

/**
 * @author Rahul
 *
 */

@Component
public class RolesDaoImpl  extends BaseDaoImpl implements RolesDao  {

	@Autowired
	private JdbcTemplate jdbcTemplate;	
	

	public List<Roles> getRolesList() throws SQLException {
		
		System.out.println( " 2 " );
		System.out.println( " 23" );
		String sql = "SELECT * FROM ROLES";
		List<Roles> rolesList  = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper<Roles>(Roles.class));
		
		for (Roles role : rolesList )
		{
			System.out.println(role.getName());
			System.out.println(role.getRoleId());
		}
		return rolesList;
		
	}

	public void printMethod() {
    System.out.println( " Inside Print method of  RolesDaoImpl");
    System.out.println();
    
 
	}

}
