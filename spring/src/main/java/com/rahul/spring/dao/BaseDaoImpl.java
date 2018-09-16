package com.rahul.spring.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class BaseDaoImpl {
	
	
   private JdbcTemplate jdbcTemplate; //SETTER NOT REQUIRED 
// @Bean	
//public JdbcTemplate getJdbcTemplate() {
//
//		return jdbcTemplate;
//	}
//	public void setDataSource ( DataSource dataSource )
//	{
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
	@Bean
    public JdbcTemplate getjdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
       jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
	
}
