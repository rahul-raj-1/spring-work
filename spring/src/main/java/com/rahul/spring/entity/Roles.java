package com.rahul.spring.entity;

import org.springframework.stereotype.Component;


public class Roles {

private Long roleId;
private String name;

public Long getRoleId() {
	return roleId;
}

public void setRoleId(Long roleId) {
	this.roleId = roleId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



}