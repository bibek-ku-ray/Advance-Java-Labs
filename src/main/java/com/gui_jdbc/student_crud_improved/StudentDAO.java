package com.gui_jdbc.student_crud_improved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Data Access Object for Student entity
 */
public class StudentDAO {

    /**
     * Adds a student to the database
     * @param student the student to add
     * @return true if successful, false otherwise
     */
    public boolean addStudent(Student student) {
        String sql = "INSERT INTO Student (name, email, rollNo) VALUES (?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setInt(3, student.getRollNo());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error adding student: " + e.getMessage());
            return false;
        }
    }

    /**
     * Updates a student's information
     * @param id the ID of the student to update
     * @param student the updated student information
     * @return true if successful, false otherwise
     */
    public boolean updateStudent(int id, Student student) {
        String sql = "UPDATE Student SET name = ?, email = ?, rollNo = ? WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setInt(3, student.getRollNo());
            preparedStatement.setInt(4, id);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error updating student: " + e.getMessage());
            return false;
        }
    }

    /**
     * Retrieves a student by ID
     * @param id the student ID
     * @return the student or null if not found
     */
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM Student WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Student student = new Student();
                    student.setId(resultSet.getInt("id"));
                    student.setName(resultSet.getString("name"));
                    student.setEmail(resultSet.getString("email"));
                    student.setRollNo(resultSet.getInt("rollNo"));
                    return student;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving student: " + e.getMessage());
        }
        return null;
    }

    /**
     * Deletes a student from the database
     * @param id the ID of the student to delete
     * @return true if successful, false otherwise
     */
    public boolean deleteStudent(int id) {
        String sql = "DELETE FROM Student WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error deleting student: " + e.getMessage());
            return false;
        }
    }
}