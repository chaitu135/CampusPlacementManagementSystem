package com.placement.controller;

import com.placement.dao.StudentDAO;
import com.placement.model.Student;

public class TestAddStudent {
public static void main(String[] args) {
	
	Student std=new Student(1,"579","chaitanya","8074953853","cse",2026,66.7);
	StudentDAO student=new StudentDAO();
	System.out.println(student.addStudent(std));
	System.out.println(std);
	
	
}
}
