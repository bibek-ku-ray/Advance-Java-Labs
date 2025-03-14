package com.gui_jdbc.student_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {
    public static final String URL = "jdbc:mysql://localhost:3306/collegeDB";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    void addStudent(Student student) {
        String sql = "INSERT INTO Student (ame, email, rollNo) VALUES (?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getAme());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setInt(3, student.getRollNo());
            int update = preparedStatement.executeUpdate();
            System.out.println("Row effected: " + update);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean updateStudent(int id, Student student) {
        String sql = "UPDATE Student SET ame = ?, email = ?, rollNo = ? WHERE id = ?";
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getAme());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setInt(3, student.getRollNo());
            preparedStatement.setInt(4, id);
            int update = preparedStatement.executeUpdate();
            System.out.println("Row effected: " + update);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}