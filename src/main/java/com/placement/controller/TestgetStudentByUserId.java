package com.placement.controller;

import com.placement.dao.StudentDAO;

public class TestgetStudentByUserId {
public static void main(String[] args) {
	StudentDAO std=new StudentDAO();
	
	System.out.println(std.getStudentByUserId(1));
}
}
