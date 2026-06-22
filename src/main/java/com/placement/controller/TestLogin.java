package com.placement.controller;

import com.placement.dao.UserDAO;
import com.placement.model.User;

public class TestLogin {
public static void main(String[] args) {
	UserDAO UD=new UserDAO();
	User user=UD.loginUser("chaitu", "123456");
	System.out.println(user);
}
}
