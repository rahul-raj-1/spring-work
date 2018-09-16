package com.rahul.spring.launcher;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.spring.configuartion.RolesConfig;
import com.rahul.spring.dao.RolesDao;

public class RoleLauncher {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = 
		            new AnnotationConfigApplicationContext(RolesConfig.class);
		RolesDao rolesDao = context.getBean( RolesDao.class);
		try {
			rolesDao.getRolesList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        context.close();
		            
		            

	}

}
