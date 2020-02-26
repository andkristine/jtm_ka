package jtm.activity12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TeacherManager {

	public static void main(String[] args) {
		System.out.println(new TeacherManager().insertTeacher(new Teacher(111, "Test", "Test")));
	}

	protected Connection conn;

	public TeacherManager() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db?autoReconnect=true&useSSL=false&characterEncoding=utf8", "admin",
					"abcd1234");
			conn.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Teacher findTeacher(int id) {
		
		Teacher teacher = new Teacher();
		try {

			String sql = "select * from Teacher where id = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.first()) {
			teacher.setId(rs.getInt(1));
			teacher.setFirstName(rs.getString(2));
			teacher.setLastName(rs.getString(3));
			return teacher;
			} 
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	public List<Teacher> findTeacher(String firstName, String lastName) {
	
		List<Teacher> teacherList = new ArrayList<>();
		try {

			String sql = "select * from Teacher where firstName = ? or lastName = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(rs.getInt(1));
				teacher.setFirstName(rs.getString(2));
				teacher.setLastName(rs.getString(3));
				teacherList.add(teacher);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return teacherList;
	}

	
	public boolean insertTeacher(String firstName, String lastName) { // ja ir null
		
		boolean success = false;

		try {

			String sql = "insert into Teacher (firstName, lastName) values ( ? , ?)";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);

			int rows = preparedStatement.executeUpdate();
			if (rows == 1) {
				success = true;
			} else {
				success = false;
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return success;

	}

	public boolean insertTeacher(Teacher teacher) { // ja nav null
	

		boolean success = false;

		try {

			String sql = "insert into Teacher (id, firstName, lastName) values (?, ?, ?)";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2, teacher.getFirstName());
			preparedStatement.setString(3, teacher.getLastName());

			int rows = preparedStatement.executeUpdate();
			if (rows == 1) {
				success = true;
			} else {
				success = false;
			}
			conn.commit();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return success;

	}

	public boolean updateTeacher(Teacher teacher) {

		boolean success = false;

		try {

			String sql = "update Teacher set firstName = ? , lastName = ? where id = ?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setString(1, teacher.getFirstName());
			preparedStatement.setString(2, teacher.getLastName());
			preparedStatement.setInt(3, teacher.getId());
			
			int rows = preparedStatement.executeUpdate();
			if (rows == 1) {
				success = true;
			} else {
				success = false;
			}
			conn.commit();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return success;
		
	}

	public boolean deleteTeacher(int id) {
		
		boolean success = false;
		try {

			String sql = "delete from Teacher where id = ?";
			
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int rows = preparedStatement.executeUpdate();
			if (rows == 1) {
				success = true;
			} else {
				success = false;
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return success;
	}

	public void closeConnection() {
	
		try {
			conn.close();
			conn = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
