package com.rahul.spring.configuartion;

import oracle.jdbc.pool.OracleDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
//@ConfigurationProperties("oracle")
@PropertySource("classpath:dev.properties")
public class OracleConfiguration {
	 @Value( "${oracle.username}" )
    private String username;// we can remove value injection and just use 
    @Value( "${oracle.password}" )
    private String password;
 @Value( "${oracle.url}" )
    private String url;
    @Value( "${oracle.driverType}" )
    private String driverType;
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    
    public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}
  
    @Bean
	DataSource dataSource() throws SQLException {
		 
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setDriverType(driverType);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }
    
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        return jdbcTemplate;
//    }
//	
    
  
BaseDaoImpl has property jdbcTemplate annotated with @Autowired.
	With this annotation you ask Spring IoC to look for an object of type JdbcTemplate in its configuration
		and set to that property. And this is method jdbcTemplateRandomName() which tells Spring IoC how to create object of type JdbcTemplate. When you comment out that method Spring no longer knows how to create object of type JdbcTemplate for you and throws exception
	https://stackoverflow.com/questions/52485699/unsatisfied-dependency-error-through-field-in-spring

}
