package com.placement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.placement.model.User;
import com.placement.util.DBConnection;


public class UserDAO {

	public boolean registerUser(User user) {

		try {

			Connection con = DBConnection.getConnection();

			String query = "INSERT INTO users(username,email,password,role) VALUES(?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, user.getUsername());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getRole());

			int rows = ps.executeUpdate();

			return rows > 0;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	public User findUserByUsername(String username) {

		Connection con = DBConnection.getConnection();

		String query = "SELECT * FROM users WHERE username=?";

		try {

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				User u = new User();

				u.setUserId(rs.getInt("user_id"));

				u.setUsername(rs.getString("username"));

				u.setEmail(rs.getString("email"));

				u.setPassword(rs.getString("password"));

				u.setRole(rs.getString("role"));

				u.setStatus(rs.getBoolean("status"));

				return u;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}
	
	public User loginUser(String username,String password) {
		try {
			Connection con=DBConnection.getConnection();
			String query="SELECT * FROM USERS WHERE username=? and password=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return findUserByUsername(username);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
}