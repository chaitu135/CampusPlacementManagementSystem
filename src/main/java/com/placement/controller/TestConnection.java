package com.placement.controller;
import java.sql.Connection;
import com.placement.util.DBConnection;
public class TestConnection {
public static void main(String[] args) {
	Connection con=DBConnection.getConnection();
	if(con !=null) {
		System.out.println("DB connected");
	}
	else {
		System.out.println("db failed");
	}
}
}
