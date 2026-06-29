package com.placement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.placement.model.Student;
import com.placement.util.DBConnection;
import com.placement.util.DBConstants;

public class StudentDAO {

	public boolean addStudent(Student student) {

		try {
			Connection con = DBConnection.getConnection();
			String query = "INSERT INTO students "
					+ "(user_id, roll_number, full_name, phone, branch, year_of_passout, cgpa) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, student.getUserId());
			ps.setString(2, student.getRollNumber());
			ps.setString(3, student.getFullName());
			ps.setString(4, student.getPhone());
			ps.setString(5, student.getBranch());
			ps.setInt(6, student.getYearOfPassout());
			ps.setDouble(7, student.getCgpa());

			int rows = ps.executeUpdate();

			return rows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Student getStudentByUserId(int userId) {

		try {
			Connection con = DBConnection.getConnection();
			String query = "SELECT * FROM STUDENTS WHERE user_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Student student = new Student(rs.getInt("user_id"), rs.getString("roll_number"),
						rs.getString("full_name"), rs.getString("phone"), rs.getString("branch"),
						rs.getInt("year_of_passout"), rs.getDouble("cgpa"));

				student.setStudentId(rs.getInt("student_id"));
				return student;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
			return null;
	}
	
	public boolean updateStudent(Student student) {
		try {
			Connection con=DBConnection.getConnection();
			String query="UPDATE students set phone=?,branch=?,year_of_passout=?,cgpa=? where roll_number=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, student.getPhone());
			ps.setString(2, student.getBranch());
			ps.setInt(3, student.getYearOfPassout());
			ps.setDouble(4, student.getCgpa());
			ps.setString(5, student.getRollNumber());
			int row= ps.executeUpdate();
			return row>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
