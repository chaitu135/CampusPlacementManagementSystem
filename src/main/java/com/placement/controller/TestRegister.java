package com.placement.controller;

import com.placement.dao.UserDAO;
import com.placement.model.User;

public class TestRegister {
public static void main(String[] args) {
	User user = new User(
	        "chaitu",
	        "123456",
	        "chaitu@gmail.com",
	        "STUDENT"
	);

	UserDAO dao = new UserDAO();

	boolean result =
	        dao.registerUser(user);

	System.out.println(result);
}
}
