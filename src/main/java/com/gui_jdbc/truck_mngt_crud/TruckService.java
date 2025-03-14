package com.gui_jdbc.truck_mngt_crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TruckService {

    public void addTruck(Truck truck){
        String sql =
                "INSERT INTO trucks (name, model, capacity, driver_name) VALUES (?, ?, ?, ?)";

        try {
            Connection connection = DBConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, truck.getName());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3, truck.getCapacity());
            preparedStatement.setString(4, truck.getDriverName());

            int update = preparedStatement.executeUpdate();
            System.out.println("Row effected: "+update);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Truck getTruckById(int id) {
        String sql = "SELECT * FROM trucks WHERE id = ?";
        Truck truck = null;
        try{
            Connection connection = DBConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                truck = new Truck();
                truck.setId(resultSet.getInt("id"));
                truck.setName(resultSet.getString("name"));
                truck.setModel(resultSet.getString("model"));
                truck.setCapacity(resultSet.getInt("capacity"));
                truck.setDriverName(resultSet.getString("driver_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return truck;
    }

    public void updateTruckById(Truck truck){
        String sql =
                "UPDATE trucks SET name=?, model=?, capacity=?, driver_name=? WHERE id = ?";

        try {
            Connection connection = DBConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, truck.getName());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3, truck.getCapacity());
            preparedStatement.setString(4, truck.getDriverName());
            preparedStatement.setInt(5, truck.getId());

            int update = preparedStatement.executeUpdate();
            System.out.println("Row updated: "+update);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Truck> getAllTruck(){
        String sql = "SELECT * FROM trucks";
        List<Truck> trucks = new ArrayList<Truck>();

        try {
            Connection connection = DBConnectionDetail.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                Truck truck = new Truck();
                truck.setId(resultSet.getInt("id"));
                truck.setName(resultSet.getString("name"));
                truck.setModel(resultSet.getString("model"));
                truck.setCapacity(resultSet.getInt("capacity"));
                truck.setDriverName(resultSet.getString("driver_name"));
                trucks.add(truck);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trucks;
    }

    public void deleteTruckById(int id){
        String sql = "DELETE FROM trucks WHERE id = ?";

        try {
            Connection connection = DBConnectionDetail.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int update =  preparedStatement.executeUpdate();
            System.out.println("Row deleted: "+update);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
