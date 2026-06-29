package com.placement.controller;

import com.placement.dao.StudentDAO;
import com.placement.model.Student;

public class TestUpdateStudent {
public static void main(String[] args) {
	StudentDAO dao=new StudentDAO();
	Student std=new Student(1,"570","chaitanya","8074953853","cse-b",2027,6.9);
	
	System.out.println(dao.updateStudent(std));
	System.out.println(dao.getStudentByUserId(1));
}
}
