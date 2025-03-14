package com.gui_jdbc.login.logindb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoginService {

    public void addUser(Login login){
        String sql =
                "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login.getName());
            preparedStatement.setString(2, login.getEmail());
            preparedStatement.setString(3, login.getPassword());

            int update = preparedStatement.executeUpdate();
            System.out.println("Row effected: "+update);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Login> getAllUser(){
        String sql = "SELECT * FROM users";
        List<Login> trucks = new ArrayList<Login>();

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                Login login = new Login();
                login.setId(resultSet.getInt("id"));
                login.setName(resultSet.getString("name"));
                login.setEmail(resultSet.getString("email"));
                login.setPassword(resultSet.getString("password"));
                trucks.add(login);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trucks;
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int update = preparedStatement.executeUpdate();
            System.out.println("Row effected: " + update);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
