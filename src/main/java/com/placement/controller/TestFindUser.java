package com.placement.controller;

import com.placement.dao.UserDAO;
import com.placement.model.User;

public class TestFindUser {
public static void main(String[] args) {
	UserDAO UD=new UserDAO();
	
	User user=UD.findUserByUsername("hr2");
	System.out.println(user);
}
}
