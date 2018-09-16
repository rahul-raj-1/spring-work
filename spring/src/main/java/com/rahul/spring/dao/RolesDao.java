/**
 * 
 */
package com.rahul.spring.dao;

import java.sql.SQLException;
import java.util.List;

import com.rahul.spring.entity.Roles;

/**
 * @author Rahul
 *
 */

public interface RolesDao 
{
	List<Roles> getRolesList() throws SQLException;
	void printMethod() ;

}
